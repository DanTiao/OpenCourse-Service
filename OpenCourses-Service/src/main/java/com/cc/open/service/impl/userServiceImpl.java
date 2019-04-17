package com.cc.open.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cc.open.domain.AccountInfo;
import com.cc.open.service.IUserService;
import com.cc.open.vo.ResponVO;
import com.cc.open.vo.UserLoginVO;

@Service
public class userServiceImpl implements IUserService{
	
	@Autowired
	private AccountInfo accountInfo;

	@Override
	public ResponVO<UserLoginVO> userLogin(UserLoginVO userLoginVO) {
		ResponVO<UserLoginVO> result = new ResponVO<UserLoginVO>();
		result.setSuccess(false);
		result.setData(userLoginVO);
		
		return result;
	}

}
