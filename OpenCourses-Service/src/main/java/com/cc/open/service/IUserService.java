package com.cc.open.service;

import com.cc.open.vo.ResponVO;
import com.cc.open.vo.UserVO;


public interface IUserService {

	/**
	 * 用户登录
	 * @param userVO
	 * @return
	 */
	ResponVO<UserVO> userLogin(UserVO userVO);

	/**
	 * 创建用户
	 * @param userVO
	 * @return
	 */
	ResponVO<UserVO> createUser(UserVO userVO);

}
