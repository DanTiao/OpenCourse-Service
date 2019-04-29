package com.cc.open.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cc.open.domain.Teacher;
import com.cc.open.service.ITeacherService;
import com.cc.open.vo.ResponVO;

@RestController
@RequestMapping(value = "/teacher")
public class TeacherController {

	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private ITeacherService teacherService;
	
	@RequestMapping(value = "/get/info", method = RequestMethod.GET, produces = "application/json")
	public ResponVO<Teacher> getTeacherInfo(){
		return teacherService.getTeacherInfo();	
	}
	
	@RequestMapping(value = "/update/info", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<String> updateTeacherInfo(@RequestBody Teacher teacher){
		return teacherService.updateTeacherInfo(teacher);
		
	}
}
