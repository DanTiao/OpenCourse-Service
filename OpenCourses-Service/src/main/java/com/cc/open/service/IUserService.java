package com.cc.open.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

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
	ResponVO<UserVO> createTeacher(UserVO userVO);

	/**
	 * 根据用户id删除用户
	 * @param userId
	 * @return
	 */
	ResponVO<String> deleteUserByUserId(String userId);

	/**
	 * 物理批量删除
	 * @param ids
	 * @return
	 */
	ResponVO<String> deleteUsers(List<String> ids);

	ResponVO<PageInfo> findUserByAccount(String userAccount, String isEnable);

	ResponVO<UserVO> findUserById(String userId);

	ResponVO<String> updateUser(UserVO userVO);

	/**
	 * 逻辑删除
	 * @param userId
	 * @return
	 */
	ResponVO<String> deleteUser(List<String> userId);

	ResponVO<String> restUsersByUserId(List<String> ids);

	ResponVO<String> restPssword(String userId);

	ResponVO<UserVO> getUserInfo();

	ResponVO<String> updatePassword(UserVO userVO);

	ResponVO<UserVO> createAdmin(UserVO userVO);

	ResponVO<UserVO> setUserToAdmin(UserVO userVO);

	ResponVO<String> userLogout();

	ResponVO<UserVO> userRestPwd(UserVO userVO);

}
