package com.cc.open.service.impl;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cc.open.common.SessionCommon;
import com.cc.open.common.ConstantCommon;
import com.cc.open.dao.CourseDataMapper;
import com.cc.open.dao.CourseMapper;
import com.cc.open.dao.UserCourseMapper;
import com.cc.open.domain.UserCourse;
import com.cc.open.service.ICourseService;
import com.cc.open.service.IUserCourseService;
import com.cc.open.utils.AESUtil;
import com.cc.open.vo.CourseDataVO;
import com.cc.open.vo.CourseVO;
import com.cc.open.vo.ResponVO;
import com.cc.open.vo.UserCourseVO;
import com.cc.open.vo.UserVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class CourseServiceImpl implements ICourseService {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private CourseMapper courseDao;
	
	@Autowired
	private IUserCourseService userCourseService;
	
	@Autowired
	private UserCourseMapper userCourseDao;
	
	@Autowired
	private CourseDataMapper courseDataDao;


	@Override
	public ResponVO<CourseVO> createCourse(CourseVO courseVO) {
		ResponVO<CourseVO> result = new ResponVO<>();
		result.setSuccess(false);
		result.setCode("500");
		result.setData(courseVO);
		logger.info("########  Create course");
		//课程是否已存在
		CourseVO course = courseDao.findCourseByName(courseVO);
		if(course != null) {
			logger.info("########  Course already exists");
			result.setMessage("课程已存在");
			return result;
		}
		String id = UUID.randomUUID().toString();
		courseVO.setCourseId(id);
		courseVO.setCreateTime(new Date());
		courseVO.setIsEnable("1");
		int randNum = 0;
		try {
			randNum = SecureRandom.getInstance("SHA1PRNG").nextInt(999999);
		} catch (NoSuchAlgorithmException e) {
			logger.info("NoSuchAlgorithmException"+e);
		}
		String num = "C"+Integer.toString(randNum);
		courseVO.setCourseNum(num);
		int flag = -1;
		try {
			flag = courseDao.createCourse(courseVO);
			CourseDataVO courseDataVO = new CourseDataVO();
			courseDataVO.setCourseId(courseVO.getCourseId());
			courseDataDao.createCourseData(courseDataVO);
		} catch (Exception e) {
			logger.error("Creat course fail------"+e);
			result.setMessage("创建课程失败");
			return result;
		}
		if(flag>0) {
			result.setCode("200");
			result.setMessage("增加成功");
			result.setSuccess(true);
			result.setData(courseVO);
			logger.info("########  Create course successful");
		}else {
			result.setMessage("增加失败");
			logger.info("########  Create course fail");
		}
		return result;
	}

	@Override
	public ResponVO<String> deleteCourses(List<String> courseIds) {
		ResponVO<String> result = new ResponVO<String>();
		result.setSuccess(false);
		if(courseIds.isEmpty() || courseIds == null) {
			result.setCode("500");
			result.setMessage("The courseIds is null");
			return result;
		}
		courseDao.deleteCourseLogically(courseIds);
		logger.info("########  Delete user successful");
		result.setCode("200");
		result.setSuccess(true);
		return result;
	}

	@Override
	public ResponVO<String> restCourses(List<String> courseIds) {
		ResponVO<String> result = new ResponVO<String>();
		result.setSuccess(false);
		if(courseIds.isEmpty() || courseIds == null) {
			result.setCode("500");
			result.setMessage("The courseIds is null");
			return result;
		}
		courseDao.restCourseLogically(courseIds);
		logger.info("########  Delete user successful");
		result.setCode("200");
		result.setSuccess(true);
		return result;
	}

	@Override
	public ResponVO<PageInfo> findCourseByParam(CourseVO data, String isEnable) {
		ResponVO<PageInfo> result = new ResponVO<>();
		result.setSuccess(false);
		if(data == null) {
			logger.info("########  Param of searching is null");
			result.setCode("500");
			result.setMessage("查询参数为空");
			return result;
		}
		if(data.getAcademyId().isEmpty()) {
			data.setAcademyId(null);
		}
		if(data.getCourseName().isEmpty()) {
			data.setCourseName(null);
		}
		data.setIsEnable(isEnable);
		List<CourseVO> list = courseDao.findCourseByParam(data);
		if(!list.isEmpty()) {
			PageInfo pageInfo = new PageInfo(list);
			logger.info("########  Find course successful");
			result.setCode("200");
			result.setSuccess(true);
			result.setMessage("Find course successful");
			result.setData(pageInfo);
			return result;
		}
		logger.info("########  course is not exist");
		result.setCode("500");
		result.setMessage("课程不存在");
		return result;
	}

	@Override
	public ResponVO<String> deleteCoursePhy(List<String> courseIds) {
		ResponVO<String> result = new ResponVO<String>();
		result.setSuccess(false);
		if(courseIds == null || courseIds.isEmpty()) {
			logger.info("########  The courseIds is null");
			result.setCode("500");
			result.setMessage("The courseIds is null");
			return result;
		}
		courseDao.deleteCourseByIds(courseIds);
		logger.info("########  Delete course successful");
		result.setCode("200");
		result.setSuccess(true);
		return result;
	}

	@Override
	public ResponVO<CourseVO> findCourseById(String courseId) {
		ResponVO<CourseVO> result = new ResponVO<>();
		result.setSuccess(false);
		result.setCode("500");
		CourseVO courseVO = new CourseVO();
		courseVO.setCourseId(courseId);
		CourseVO course = courseDao.findCourseByName(courseVO);
		if(course != null) {
			result.setCode("200");
			result.setData(course);
			result.setSuccess(true);
		}	
		return result;
	}

	@Override
	public ResponVO<String> updateCourse(CourseVO courseVO) {
		logger.info(request.getSession().getId());
		ResponVO<String> result = new ResponVO<>();
		result.setSuccess(false);
		UserVO userSession = SessionCommon.checkUser(request);
		if(userSession == null) {
			result.setCode("401");
			result.setMessage("请登录");
			return result;
		}
		if(!ConstantCommon.SUPADMIN.equals(userSession.getUserType()) && !ConstantCommon.ADMIN.equals(userSession.getUserType())) {
			result.setMessage("当前登录用户权限不足");
			return result;
		}
		logger.info("########  Update user");
		//课程是否已存在
		if(courseDao.findCourseByName(courseVO) == null) {
			logger.info("########  Username is not exists");
			result.setMessage("课程不存在");
			return result;
		}
		
		int flag = courseDao.updateCourse(courseVO);
		if(flag>0) {
			result.setCode("200");
			result.setMessage("修改成功");
			result.setSuccess(true);
			logger.info("########  Update course successful");
		}else {
			result.setCode("500");
			result.setMessage("修改失败");
			logger.info("########  Update course fail");
		}
		return result;
	}

	@Override
	public ResponVO<PageInfo> findAllPersonalCourse(int pageNum, int pageSize,String isEnable) {
		ResponVO<PageInfo> result = new ResponVO<>();
		PageHelper.startPage(pageNum, pageSize);
		logger.info("########  Paging query");
		UserVO user = SessionCommon.checkUser(request);
		if(user == null) {
			result.setCode("401");
			result.setMessage("请登录");
			return result;
		}
		CourseVO course = new CourseVO();
		course.setUserId(user.getUserId());
		course.setIsEnable(isEnable);
		List<CourseVO> listCourses = courseDao.findAllPersonalCourse(course);
		PageInfo pageInfo = new PageInfo(listCourses);
		result.setData(pageInfo);
		result.setSuccess(true);
		result.setCode("200");
		return result;
	}



}
