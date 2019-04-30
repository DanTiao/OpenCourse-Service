package com.cc.open.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cc.open.dao.TeacherMapper;
import com.cc.open.dao.UserCourseMapper;
import com.cc.open.dao.UserInfoMapper;
import com.cc.open.domain.Teacher;
import com.cc.open.domain.UserCourse;
import com.cc.open.service.IUserCourseService;
import com.cc.open.vo.ResponVO;
import com.cc.open.vo.UserCourseVO;
import com.cc.open.vo.UserVO;

@Service
public class UserCourseServiceImpl implements IUserCourseService {
	
	@Autowired
	private UserCourseMapper userCourseDao;
	
	@Autowired
	private UserInfoMapper userInfoDao;
	
	@Autowired
	private TeacherMapper teacherDao;

	@Override
	public ResponVO<String> setUserCourseRelation(UserCourseVO userCourseVO) {
//		ResponVO<String> result = new ResponVO<String>();
//		userCourseDao.setUserCourseRelation(userCourseVO);
//		result.setCode("200");
		return null;
	}

	@Override
	public ResponVO<List<UserCourseVO>> findCourseManager(String courseId) {
		ResponVO<List<UserCourseVO>> result = new ResponVO<List<UserCourseVO>>();
		List<UserCourseVO> list = userCourseDao.findCourseManager(courseId);
		if(list.isEmpty() || list == null) {
			result.setCode("500");
			result.setMessage("暂无课程管理员");
			result.setSuccess(false);
			return result;
		}
		result.setCode("200");
		result.setData(list);
		result.setSuccess(true);
		return result;
	}

	@Override
	public ResponVO<UserVO> findUserByAccount(UserCourseVO userCourseVO) {
		ResponVO<UserVO> result = new ResponVO<>();
		result.setSuccess(false);
		UserCourseVO userCourse = userCourseDao.findRelationshipByUser(userCourseVO);
		if(userCourse != null) {
			result.setCode("500");
			result.setMessage("该用户已经是本课程负责人");
			return result;
		}
		UserVO userInfo = new UserVO();
		userInfo.setUserAccount(userCourseVO.getUserAccount());
		userInfo.setIsEnable("1");
		UserVO user = userInfoDao.findAccountInfo(userInfo);
		if(user == null) {
			result.setCode("404");
			result.setMessage("用户不存在");
			return result;
		}
		Teacher teacher = teacherDao.findTeacherInfoByUserId(user.getUserId());
		if(teacher == null) {
			teacherDao.createTeacherInfo(user);
		}
		UserCourse insertUserCourse = new UserCourse();
		insertUserCourse.setCourseId(userCourseVO.getCourseId());
		insertUserCourse.setUserId(user.getUserId());
		String id = UUID.randomUUID().toString();
		insertUserCourse.setId(id);
		insertUserCourse.setCreateTime(new Date());
		insertUserCourse.setIsEnable("1");
		userCourseDao.insert(insertUserCourse);
		result.setCode("200");
		result.setData(user);
		result.setSuccess(true);
		return result;
	}

	@Override
	public ResponVO<String> deleteCourseManager(UserCourseVO userCourseVO) {
		ResponVO<String> result = new ResponVO<String>();
		if(userCourseVO.getCourseId() == null || userCourseVO.getUserId() == null || userCourseVO.getCourseId().isEmpty() || userCourseVO.getUserId().isEmpty()) {
			result.setCode("500");
			result.setMessage("删除失败");
			return result;
		}
		userCourseDao.deleteCourseManager(userCourseVO);
		result.setCode("200");
		result.setSuccess(true);
		return result;
	}

}
