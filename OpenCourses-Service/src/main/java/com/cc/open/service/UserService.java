package com.cc.open.service;



import com.cc.open.vo.RequestVO;
import com.cc.open.vo.UserLoginVO;

public interface UserService {

	/**
	 * 用户登录
	 * @param userLoginVO
	 * @return
	 */
	RequestVO<UserLoginVO> userLogin(UserLoginVO userLoginVO);

}
