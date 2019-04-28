package com.cc.open.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import com.cc.open.vo.CourseDataVO;
import com.cc.open.vo.ResponVO;

public class FileUploadUtil {
	
	private final static Logger logger = LoggerFactory.getLogger(FileUploadUtil.class);

	/**
	 * 单文件上传
	 * @param file
	 * @param saveUrl
	 * @param fileType
	 * @return
	 */
	public static String uploadFile(MultipartFile file, String saveUrl, String courseId) {
		String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
	    String fileName = UUID.randomUUID() + suffix;
	    Date now = new Date(); 
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    String nowDate = dateFormat.format(now); 
	    String newUrl = saveUrl+"\\"+nowDate+"\\"+courseId+"\\"+fileName;
	    logger.info("文件路径：" + newUrl);
	    File saveFile = new File(newUrl);
	    if(!saveFile.getParentFile().exists()){
	        saveFile.getParentFile().mkdirs();
	    }
	    try {
	        file.transferTo(saveFile);
	    } catch (IOException e) {
	        e.printStackTrace();
	        logger.info("上传失败！");
	        return null;
	    }
	    return newUrl;
	}
	
	/**
	 * @function 多文件上传
	 * @return
	 */
	public static List<String> uploadFileS(MultipartFile[] files , String saveUrl, String courseId){
	    List<String> picUrl = new ArrayList<String>();
	    Date now = new Date(); 
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    String nowDate = dateFormat.format(now); 
	    String newUrl = saveUrl + "\\" + nowDate+"\\" +courseId+ "\\";
	    File saveDir = new File(newUrl);
	    if(!saveDir.exists()){
	        saveDir.mkdirs();
	    }
	    for(MultipartFile file : files){
	        if(file != null){
	            String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
	            String fileName = UUID.randomUUID() + suffix;
	            String newFileUrl = newUrl+fileName;
	            File saveFile = new File(newFileUrl);
	            try {
	                file.transferTo(saveFile);
	                picUrl.add(newFileUrl);
	            } catch (IOException e) {
	                e.printStackTrace();
	                logger.info("上传失败");
	                return null;
	            }
	        }
	    }
	    return picUrl;
	}

}
