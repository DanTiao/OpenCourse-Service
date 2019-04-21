package com.cc.open.service.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cc.open.dao.AccountInfoMapper;
import com.cc.open.service.IUserService;
import com.cc.open.vo.ResponVO;
import com.cc.open.vo.LoginVO;

@Service
public class userServiceImpl implements IUserService{
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private AccountInfoMapper accountInfoMapper;

	@Override
	public ResponVO<LoginVO> userLogin(LoginVO loginVO) {
		ResponVO<LoginVO> result = new ResponVO<LoginVO>();
		result.setSuccess(false);
		result.setData(loginVO);
		logger.info("########  Check account info...");
		LoginVO accontInfo = accountInfoMapper.findAccountInfo(loginVO);
		if(accontInfo != null) {
			logger.info("########  Login successful");
			result.setSuccess(true);
			result.setData(accontInfo);
		}else {
			logger.info("########  Login fail");
			result.setCode("401");
		}
		return result;
	}

}
