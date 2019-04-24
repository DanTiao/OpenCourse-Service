package com.cc.open.service.impl;


import java.util.Date;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cc.open.common.UserRoleConstant;
import com.cc.open.dao.AccountInfoMapper;
import com.cc.open.domain.AccountInfo;
import com.cc.open.service.IUserService;
import com.cc.open.utils.AESUtil;
import com.cc.open.vo.ResponVO;
import com.cc.open.vo.UserVO;

@Service
public class userServiceImpl implements IUserService{
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private AccountInfoMapper accountInfoMapper;

	@Override
	public ResponVO<UserVO> userLogin(UserVO userVO) {
		ResponVO<UserVO> result = new ResponVO<UserVO>();
		result.setSuccess(false);
		result.setData(userVO);
		logger.info("########  Check account info...");
		UserVO accontInfo = accountInfoMapper.findAccountInfo(userVO);
		if(accontInfo != null) {
			logger.info("########  Login successful");
			result.setCode("200");
			result.setSuccess(true);
			result.setData(accontInfo);
		}else {
			logger.info("########  Login fail");
			result.setCode("401");
		}
		return result;
	}

	@Override
	public ResponVO<UserVO> createUser(UserVO userVO) {
		ResponVO<UserVO> result = new ResponVO<UserVO>();
		result.setSuccess(false);
		result.setData(userVO);
		logger.info("########  Create user");
		//用户名是否已存在
		UserVO user = accountInfoMapper.findAccountByAccount(userVO.getUserAccount());
		if(user != null) {
			logger.info("########  Username already exists");
			result.setMessage("用户名已存在");
			return result;
		}
		String id = UUID.randomUUID().toString();
		userVO.setUserId(id);
		userVO.setUserPassword(AESUtil.encrypt(userVO.getUserPassword()));
		userVO.setUserEmail(AESUtil.encrypt(userVO.getUserEmail()));
		userVO.setUserTel(AESUtil.encrypt(userVO.getUserTel()));
		userVO.setUserType(UserRoleConstant.TEACHER);
		userVO.setCreateTime(new Date());
		userVO.setUpdateTime(new Date());
		int flag = accountInfoMapper.createUser(userVO);
		if(flag>0) {
			result.setCode("200");
			result.setMessage("增加成功");
			result.setSuccess(true);
			logger.info("########  Create user successful");
		}else {
			result.setCode("500");
			result.setMessage("增加失败");
			logger.info("########  Create user fail");
		}
		return result;
	}

}
