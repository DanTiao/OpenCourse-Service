package com.cc.open.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cc.open.domain.Teacher;
import com.cc.open.service.ITeacherService;
import com.cc.open.vo.ResponVO;
import com.cc.open.vo.TeacherVO;

@RestController
@RequestMapping(value = "/teacher")
public class TeacherController {

	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private ITeacherService teacherService;
	
	/**
	 * 教师后台修改个人信息
	 * @return
	 */
	@RequestMapping(value = "/get/info", method = RequestMethod.GET, produces = "application/json")
	public ResponVO<Teacher> getTeacherInfo(){
		return teacherService.getTeacherInfo();	
	}
	
	@RequestMapping(value = "/update/info", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<String> updateTeacherInfo(@RequestBody Teacher teacher){
		return teacherService.updateTeacherInfo(teacher);		
	}
	
	/**
	 * 根据课程id获取教师信息
	 * @param courseId
	 * @return
	 */
	@RequestMapping(value = "/getTeacher/{courseId}", method = RequestMethod.GET, produces = "application/json")
	public ResponVO<List<TeacherVO>> getTeacherData(@PathVariable("courseId") String courseId){
		return teacherService.getTeacherData(courseId);	
	}
}
