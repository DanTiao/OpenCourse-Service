package com.cc.open.service.impl;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Date;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cc.open.dao.CourseMapper;
import com.cc.open.service.ICourseService;
import com.cc.open.vo.CourseVO;
import com.cc.open.vo.ResponVO;

@Service
public class CourseServiceImpl implements ICourseService {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private CourseMapper courseDao;

	@Override
	public ResponVO<CourseVO> createCourse(CourseVO courseVO) {
		ResponVO<CourseVO> result = new ResponVO<>();
		result.setSuccess(false);
		result.setData(courseVO);
		logger.info("########  Create course");
		//用户名是否已存在
		CourseVO course = courseDao.findCourseByName(courseVO);
		if(course != null) {
			logger.info("########  Course already exists");
			result.setMessage("课程已存在");
			return result;
		}
		String id = UUID.randomUUID().toString();
		courseVO.setCourseId(id);
		courseVO.setCreatTime(new Date());
		courseVO.setIsEnable("1");
		int randNum = 0;
		try {
			randNum = SecureRandom.getInstance("SHA1PRNG").nextInt(999999);
		} catch (NoSuchAlgorithmException e) {
			logger.info("NoSuchAlgorithmException"+e);
		}
		String num = "C"+Integer.toString(randNum);
		courseVO.setCourseNum(num);
		
		int flag = courseDao.createCourse(courseVO);
		if(flag>0) {
			result.setCode("200");
			result.setMessage("增加成功");
			result.setSuccess(true);
			result.setData(courseVO);
			logger.info("########  Create course successful");
		}else {
			result.setCode("500");
			result.setMessage("增加失败");
			logger.info("########  Create course fail");
		}
		return result;
	}

}
