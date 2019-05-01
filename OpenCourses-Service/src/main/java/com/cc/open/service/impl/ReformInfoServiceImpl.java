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
import com.cc.open.common.SessionCommon;
import com.cc.open.dao.ReformInfoMapper;
import com.cc.open.domain.ReformInfo;
import com.cc.open.domain.ReformInfoExample;
import com.cc.open.domain.ReformInfoExample.Criteria;
import com.cc.open.service.IReformInfoService;
import com.cc.open.utils.FileUploadUtil;
import com.cc.open.vo.ResponVO;
import com.cc.open.vo.UserVO;

@Service
public class ReformInfoServiceImpl implements IReformInfoService {

	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private ReformInfoMapper reformInfoDao;

	@Override
	public ResponVO<ReformInfo> createReformInfo(ReformInfo reformInfo, MultipartFile file) {
		ResponVO<ReformInfo> result = new ResponVO<ReformInfo>();
		result.setSuccess(false);
		result.setData(reformInfo);
//		UserVO user = SessionCommon.checkUser(request);
//		if(user == null) {
//			result.setCode("401");
//			result.setMessage("请登录");
//			return result;
//		}
		logger.info("star create reform info...");
		if(file == null){
			logger.info("附件为空");
			result.setMessage("附件为空");
	    }
		String id = UUID.randomUUID().toString();
		String url = FileUploadUtil.uploadFile(file, ConstantCommon.SAVE_URL_FILE, id);
		if(url == null) {
			result.setMessage("附件上传失败");
		}
		String fileName = file.getOriginalFilename();
		
		reformInfo.setFileName(fileName);
		reformInfo.setFileUrl(url);
		reformInfo.setReformId(id);
		Date date = new Date();
		reformInfo.setCreateTime(date);
		reformInfo.setUpdateTime(date);
		reformInfo.setIsEnable("1");
		reformInfoDao.insertSelective(reformInfo);
		logger.info("create reform info successful...");
		result.setData(reformInfo);
		result.setCode("200");
		result.setSuccess(true);
		result.setData(reformInfo);
		return result;
	}

	@Override
	public ResponVO<ReformInfo> updateReformInfo(ReformInfo reformInfo) {
		ResponVO<ReformInfo> result = new ResponVO<ReformInfo>();
		result.setSuccess(false);
		result.setData(reformInfo);
		UserVO user = SessionCommon.checkUser(request);
		if(user == null) {
			result.setCode("401");
			result.setMessage("请登录");
			return result;
		}if(user.getUserType() == ConstantCommon.TEACHER) {
			result.setCode("500");
			result.setMessage("登录用户权限不足");
			return result;
		}
		logger.info("star update reform info...");
		reformInfo.setUpdateTime(new Date());
		reformInfo.setCreateBy(user.getUserAccount());
		reformInfoDao.updateByPrimaryKeySelective(reformInfo);
		logger.info("update reform info successful...");
		result.setCode("200");
		result.setSuccess(true);
		result.setData(reformInfo);
		return result;
	}

	@Override
	public ResponVO<String> deleteReformInfo(List<String> reformId) {
		ResponVO<String> result = new ResponVO<>();
		result.setSuccess(false);
		UserVO user = SessionCommon.checkUser(request);
		if(user == null) {
			result.setCode("401");
			result.setMessage("请登录");
			return result;
		}if(user.getUserType() == ConstantCommon.TEACHER) {
			result.setCode("500");
			result.setMessage("登录用户权限不足");
			return result;
		}
		logger.info("start delete reform info...");
		ReformInfoExample example = new ReformInfoExample();
		Criteria cria = example.createCriteria();
		cria.andReformIdIn(reformId);
		reformInfoDao.deleteByExample(example);
		logger.info("delete reform info successful...");
		result.setCode("200");
		result.setSuccess(true);
		return result;
	}

	@Override
	public ResponVO<ReformInfo> getReformInfodetalis(String reformId) {
		ResponVO<ReformInfo> result = new ResponVO<ReformInfo>();
		result.setSuccess(false);
		ReformInfo peformInfo = reformInfoDao.selectByPrimaryKey(reformId);
		if(peformInfo == null) {
			result.setCode("500");
			result.setMessage("暂无数据");
			return result;
		}
		result.setCode("200");
		result.setSuccess(true);
		result.setData(peformInfo);
		return result;
	}
}
