package com.cc.open.service;

import java.util.List;

import com.cc.open.vo.ResponVO;
import com.cc.open.vo.UserVO;
import com.github.pagehelper.PageInfo;


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

	/**
	 * 根据用户id删除用户
	 * @param userId
	 * @return
	 */
	ResponVO<String> deleteUserByUserId(String userId);

	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	ResponVO<String> deleteUsers(List<String> ids);

	ResponVO<PageInfo> findUserByAccount(String userAccount);

}
