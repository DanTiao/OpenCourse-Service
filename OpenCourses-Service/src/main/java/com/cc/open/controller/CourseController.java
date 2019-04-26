package com.cc.open.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cc.open.service.ICourseService;
import com.cc.open.vo.CourseVO;
import com.cc.open.vo.ResponVO;
import com.cc.open.vo.UserVO;

@RestController
@RequestMapping(value = "/course")
public class CourseController {

	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private ICourseService courseService;
	
	@RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<CourseVO> createCourse(@RequestBody CourseVO courseVO){
		return courseService.createCourse(courseVO);
	}
	
}
