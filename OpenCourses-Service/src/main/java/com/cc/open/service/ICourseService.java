package com.cc.open.service;

import com.cc.open.vo.CourseVO;
import com.cc.open.vo.ResponVO;

public interface ICourseService {

	ResponVO<CourseVO> createCourse(CourseVO courseVO);

}
