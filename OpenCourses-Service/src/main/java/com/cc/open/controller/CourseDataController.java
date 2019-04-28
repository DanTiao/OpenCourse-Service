package com.cc.open.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cc.open.common.ConstantCommon;
import com.cc.open.service.ICourseDataService;
import com.cc.open.utils.FileUploadUtil;
import com.cc.open.vo.CourseDataVO;
import com.cc.open.vo.ResponVO;

@RestController
@RequestMapping(value = "/course/data")
public class CourseDataController {

	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private ICourseDataService courseDataService;
	
	@RequestMapping(value = "/upload/file", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<String> uploadCourseFile(@RequestParam("file") MultipartFile file){
		ResponVO<String> result = new ResponVO<>();
		result.setCode("500");
		result.setSuccess(false);
		if(file == null){
			result.setMessage("文件上传失败");
	    }else{
	    	String path = FileUploadUtil.uploadFile(file, ConstantCommon.SAVE_URL, ConstantCommon.FILE_TYPE_DOC);
	    	if(path != null) {
	    		result.setCode("200");
	    		result.setSuccess(true);
	    		result.setMessage("文件上传成功");
	    		result.setData(path);
	    	}
	    }
		return result;
	}
	
	@RequestMapping(value = "/upload/files", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<List<String>> uploadCourseVideo(@RequestParam("file") MultipartFile[] files){
		ResponVO<List<String>> result = new ResponVO<>();
		result.setCode("500");
		result.setSuccess(false);
		if(files == null){
			result.setMessage("文件上传失败");
	    }else{
	    	List<String> paths = FileUploadUtil.uploadFileS(files, ConstantCommon.SAVE_URL, ConstantCommon.FILE_TYPE_VIDEO);
	    	if(paths != null) {
	    		result.setCode("200");
	    		result.setSuccess(true);
	    		result.setMessage("文件上传成功");
	    		result.setData(paths);
	    	}
	    }
		return result;
	}
}
