package com.cc.open.service.impl;


import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cc.open.dao.AccountInfoMapper;
import com.cc.open.service.IUserService;
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
		logger.info("########  Create user...");
		String id = UUID.randomUUID().toString();
		userVO.setUserId(id);
		return null;
	}

}
