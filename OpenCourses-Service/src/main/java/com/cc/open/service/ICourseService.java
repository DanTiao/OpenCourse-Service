package com.cc.open.service;

import java.util.List;

import com.cc.open.vo.CourseVO;
import com.cc.open.vo.ResponVO;
import com.github.pagehelper.PageInfo;

public interface ICourseService {

	ResponVO<CourseVO> createCourse(CourseVO courseVO);

	ResponVO<String> deleteCourses(List<String> courseIds);

	ResponVO<String> restCourses(List<String> courseIds);

	ResponVO<PageInfo> findCourseByParam(CourseVO data, String isEnable);

	ResponVO<String> deleteCoursePhy(List<String> courseIds);

}
