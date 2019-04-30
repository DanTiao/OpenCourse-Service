package com.cc.open.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cc.open.common.ConstantCommon;
import com.cc.open.dao.CourseDataMapper;
import com.cc.open.service.ICourseDataService;
import com.cc.open.utils.FileUploadUtil;
import com.cc.open.vo.CourseDataVO;
import com.cc.open.vo.ResponVO;

@Service
public class CourseDataServiceImpl implements ICourseDataService {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private CourseDataMapper courseDataDao;

	@Override
	public ResponVO<String> updateCourseData(CourseDataVO courseDataVO) {
		ResponVO<String> result = new ResponVO<String>();
		result.setSuccess(false);
		if(courseDataVO.getCourseId() == null || courseDataVO.getCourseId().isEmpty()) {
			logger.info("课程ID为空");
			result.setCode("500");
			result.setMessage("课程ID为空");
			return result;
		}
		CourseDataVO courseData = courseDataDao.findCourseDataByCourseId(courseDataVO.getCourseId());
		Date nowDate = new Date();
		if(courseData == null) {
			String id = UUID.randomUUID().toString();
			courseDataVO.setId(id);		
			courseDataVO.setCreateTime(nowDate);
			courseDataVO.setUpdateTime(nowDate);
			courseDataDao.createCourseData(courseDataVO);
			logger.info("创建课程信息成功");
			result.setCode("200");
			result.setSuccess(true);
		}else {
			courseDataVO.setId(courseData.getId());
			courseDataVO.setUpdateTime(nowDate);
			courseDataDao.updateCourseData(courseDataVO);
			logger.info("更新课程信息成功");
			result.setCode("200");
			result.setSuccess(true);
		}
		return result;
	}

	@Override
	public ResponVO<List<String>> uploadCourseDatas(String courseId, MultipartFile[] files) {
		ResponVO<List<String>> result = new ResponVO<List<String>>();
		String filePath = null;
		List<String> paths = FileUploadUtil.uploadFileS(files, ConstantCommon.SAVE_URL_IMAGES, courseId);
    	if(paths != null) {
    		result.setCode("200");
    		result.setSuccess(true);
    		result.setMessage("文件上传成功");
    		result.setData(paths);
    		filePath = String.join(",", paths);
    	}
    	CourseDataVO courseData = courseDataDao.findCourseDataByCourseId(courseId);
		Date nowDate = new Date();
		CourseDataVO courseDataVO = new CourseDataVO();
		courseDataVO.setUpdateTime(nowDate);
		courseDataVO.setFilePath(filePath);
		if(courseData == null) {	
			String id = UUID.randomUUID().toString();
			courseDataVO.setId(id);		
			courseDataVO.setCreateTime(nowDate);
			courseDataDao.createCourseData(courseDataVO);
			logger.info("创建课程信息成功");
			result.setCode("200");
			result.setSuccess(true);
		}else {
			courseDataVO.setId(courseData.getId());
			courseDataDao.updateCourseData(courseDataVO);
			logger.info("更新课程信息成功");
			result.setCode("200");
			result.setSuccess(true);
		}
		result.setData(paths);
		return result;
	}

	@Override
	public ResponVO<CourseDataVO> uploadCourseDataOne(String courseId, String saveUrl, MultipartFile file) {
		ResponVO<CourseDataVO> result = new ResponVO<>();
		result.setSuccess(false);
		String path = FileUploadUtil.uploadFile(file, saveUrl, courseId);
    	if(path == null) {
    		result.setCode("500");
    		result.setSuccess(false);
    		result.setMessage("文件上传失败");
    	}
    	CourseDataVO courseData = courseDataDao.findCourseDataByCourseId(courseId);
		Date nowDate = new Date();
		CourseDataVO courseDataVO = new CourseDataVO();
		courseDataVO.setUpdateTime(nowDate);
		String fileName = file.getOriginalFilename();
		if(ConstantCommon.SAVE_URL_VIDEOS.equals(saveUrl)) {
			courseDataVO.setVideoName(fileName);
			courseDataVO.setVideoPath(path);
		}
		if(ConstantCommon.SAVE_URL_DOC.equals(saveUrl)) {
			courseDataVO.setFileName(fileName);
			courseDataVO.setFilePath(path);
		}	
		if(courseData == null) {	
			String id = UUID.randomUUID().toString();
			courseDataVO.setId(id);		
			courseDataVO.setCreateTime(nowDate);
			courseDataVO.setCourseId(courseId);
			courseDataDao.createCourseData(courseDataVO);
			logger.info("文件路径插入成功");
			result.setCode("200");
			result.setSuccess(true);
		}else {
			courseDataVO.setId(courseData.getId());
			courseDataDao.updateCourseData(courseDataVO);
			logger.info("文件路径更新成功");
			result.setCode("200");
			result.setSuccess(true);
		}
		result.setData(courseDataVO);
		return result;
	}

	@Override
	public ResponVO<CourseDataVO> getCourseData(String courseId) {
		ResponVO<CourseDataVO> result = new ResponVO<>();
		result.setSuccess(false);
		CourseDataVO courseData = courseDataDao.findCourseDataByCourseId(courseId);
		if(courseData != null) {
			result.setCode("200");
			result.setData(courseData);
			return result;
		}
		result.setCode("500");
		return result;
		
	}

	@Override
	public ResponVO<String> deleteCourseDataUrl(CourseDataVO courseDataVO) {
		ResponVO<String> result = new ResponVO<>();
		result.setSuccess(false);
		if(courseDataVO.getId() == null) {
			result.setCode("500");
			result.setMessage("信息表ID为空");
		}
		courseDataDao.deleteCourseDataUrl(courseDataVO);
		logger.info("删除资料路径成功");
		result.setCode("200");
		result.setSuccess(true);
		result.setData(courseDataVO.getId());
		return result;
	}

	@Override
	public ResponVO<CourseDataVO> getCourseDetails(String courseId) {
		ResponVO<CourseDataVO> result = new ResponVO<>();
		result.setSuccess(false);
		CourseDataVO courseDataVO = courseDataDao.findCourseDataByCourseId(courseId);
		if(courseDataVO != null) {
			result.setCode("200");
			result.setSuccess(true);
			result.setData(courseDataVO);
		}
		return result;
	}

}
