package com.cc.open.service.impl;

import com.cc.open.service.UserService;
import com.cc.open.vo.RequestVO;
import com.cc.open.vo.UserLoginVO;

public class userServiceImpl implements UserService{

	@Override
	public RequestVO<UserLoginVO> userLogin(UserLoginVO userLoginVO) {
		RequestVO<UserLoginVO> result = new RequestVO<UserLoginVO>();
		result.setSuccess(false);
		
		
		return null;
	}

}
