package com.cc.open.service;

import org.springframework.stereotype.Service;

import com.cc.open.vo.ResponVO;
import com.cc.open.vo.UserLoginVO;


public interface IUserService {

	/**
	 * 用户登录
	 * @param userLoginVO
	 * @return
	 */
	ResponVO<UserLoginVO> userLogin(UserLoginVO userLoginVO);

}
