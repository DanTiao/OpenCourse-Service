package com.cc.open.service;

import com.cc.open.vo.ResponVO;
import com.cc.open.vo.LoginVO;


public interface IUserService {

	/**
	 * 用户登录
	 * @param loginVO
	 * @return
	 */
	ResponVO<LoginVO> userLogin(LoginVO loginVO);

}
