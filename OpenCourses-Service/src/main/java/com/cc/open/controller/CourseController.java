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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cc.open.dao.CourseMapper;
import com.cc.open.service.ICourseService;
import com.cc.open.vo.AcademyVO;
import com.cc.open.vo.CourseVO;
import com.cc.open.vo.ResponVO;
import com.cc.open.vo.UserVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping(value = "/course")
public class CourseController {

	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private ICourseService courseService;
	
	@Autowired
	private CourseMapper courseDao;
	
	@RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<CourseVO> createCourse(@RequestBody CourseVO courseVO){
		return courseService.createCourse(courseVO);
	}
	
	@RequestMapping(value = "/findAll/{pageNum}/{pageSize}", method = RequestMethod.GET, produces = "application/json")
	public ResponVO<PageInfo> findAllAcademy(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize, @RequestParam("isEnable") String isEnable){
		ResponVO<PageInfo> result = new ResponVO<>();
		PageHelper.startPage(pageNum, pageSize);
		logger.info("########  Paging query");
		List<CourseVO> listCourses = courseDao.findAllCourse(isEnable);
		PageInfo pageInfo = new PageInfo(listCourses);
		result.setData(pageInfo);
		result.setSuccess(true);
		result.setCode("200");
		return result;
	}
	
	/**
	 * 逻辑删除
	 * @param courseIds
	 * @return
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<String> deleteCourseLogically(@RequestBody List<String> courseIds){
		return courseService.deleteCourses(courseIds);
	}
	
	/**
	 * 物理删除
	 * @param courseIds
	 * @return
	 */
	@RequestMapping(value = "/delete/courses", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<String> deleteCoursePhysically(@RequestBody List<String> courseIds){
		return courseService.deleteCoursePhy(courseIds);
	}
	
	/**
	 * 逻辑恢复
	 * @param courseIds
	 * @return
	 */
	@RequestMapping(value = "/rest", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<String> restCourseLogically(@RequestBody List<String> courseIds){
		return courseService.restCourses(courseIds);
	}
	
	@RequestMapping(value = "/find/{isEnable}", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<PageInfo> findCourseByParam(@PathVariable("isEnable") String isEnable, @RequestBody CourseVO data){
		return courseService.findCourseByParam(data, isEnable);
	}
	
	@RequestMapping(value = "/find/info/{courseId}", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<CourseVO> findCourseById(@PathVariable("courseId") String courseId){
		return courseService.findCourseById(courseId);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<String> updateCourse(@RequestBody CourseVO courseVO){
		return courseService.updateCourse(courseVO);
	}
	
}
