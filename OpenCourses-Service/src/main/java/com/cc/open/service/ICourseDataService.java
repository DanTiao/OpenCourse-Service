package com.cc.open.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.cc.open.vo.CourseDataVO;
import com.cc.open.vo.ResponVO;

public interface ICourseDataService {

	ResponVO<String> updateCourseData(CourseDataVO courseDataVO);

	ResponVO<List<String>> uploadCourseDatas(String courseId, MultipartFile[] files);

	ResponVO<CourseDataVO> uploadCourseDataOne(String courseId, String saveUrlDoc, MultipartFile file);

	ResponVO<CourseDataVO> getCourseData(String courseId);

	ResponVO<String> deleteCourseDataUrl(CourseDataVO courseDataVO);

	ResponVO<CourseDataVO> getCourseDetails(String courseId);

}
