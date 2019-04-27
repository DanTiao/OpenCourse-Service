package com.cc.open.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cc.open.service.IUserCourseService;
import com.cc.open.vo.ResponVO;
import com.cc.open.vo.UserCourseVO;
import com.cc.open.vo.UserVO;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping(value = "/user_course")
public class UserCourseController {

	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private IUserCourseService userCourseService;
	
	@RequestMapping(value = "/find/{courseId}", method = RequestMethod.GET, produces = "application/json")
	public ResponVO<List<UserCourseVO>> findCourseManager(@PathVariable("courseId") String courseId){
		return userCourseService.findCourseManager(courseId);
	}
	
	@RequestMapping(value = "/find", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<UserVO> findUserByAccount(@RequestBody UserCourseVO userCourseVO){
		return userCourseService.findUserByAccount(userCourseVO);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<String> deleteCourseManager(@RequestBody UserCourseVO userCourseVO){
		return userCourseService.deleteCourseManager(userCourseVO);
	}
	
	
}
