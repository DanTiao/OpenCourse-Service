package com.cc.open.service.impl;


import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cc.open.common.SessionCommon;
import com.cc.open.common.ConstantCommon;
import com.cc.open.dao.UserInfoMapper;
import com.cc.open.domain.UserInfoExample;
import com.cc.open.domain.UserInfoExample.Criteria;
import com.cc.open.service.ITeacherService;
import com.cc.open.service.IUserService;
import com.cc.open.utils.AESUtil;
import com.cc.open.vo.ResponVO;
import com.cc.open.vo.UserVO;
import com.github.pagehelper.PageInfo;

@Service
public class userServiceImpl implements IUserService{
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private UserInfoMapper userInfoDao;
	
	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private ITeacherService teacherService;

	@Override
	public ResponVO<UserVO> userLogin(UserVO userVO) {
		ResponVO<UserVO> result = new ResponVO<UserVO>();
		result.setSuccess(false);
		result.setData(userVO);
		logger.info("########  Check account info...");
		userVO.setIsEnable("1");
		UserVO accontInfo = userInfoDao.findAccountInfo(userVO);
		if(accontInfo == null) {
			logger.info("########  Login fail----User is not exist");
			result.setCode("500");
			result.setMessage("User is not exist");
			return result;
		}
		if(AESUtil.decrypt(accontInfo.getSecretPassword()).equals(userVO.getUserPassword())) {
			logger.info("########  Login successful");
			request.getSession().setAttribute(ConstantCommon.USER, accontInfo);
			logger.info(request.getSession().getId());
			userVO.setLastLogin(new Date());
			userVO.setUserPassword(null);
			userInfoDao.updateUser(userVO);
			result.setCode("200");
			result.setSuccess(true);
			result.setData(accontInfo);
			return result;
		}
		logger.info("########  Login fail----Password is wrong");
		result.setCode("401");
		result.setMessage("Password is wrong");
		return result;
	}

	@Override
	public ResponVO<UserVO> createUser(UserVO userVO) {
		ResponVO<UserVO> result = new ResponVO<UserVO>();
		result.setSuccess(false);
		result.setData(userVO);
		logger.info("########  Create user");
		//用户名是否已存在
		UserVO user = userInfoDao.findAccountByAccount(userVO.getUserAccount());
		if(user != null) {
			logger.info("########  Username already exists");
			result.setMessage("用户名已存在");
			return result;
		}
		UserVO sessionUser = SessionCommon.checkUser(request);
		if(sessionUser == null) {
			logger.info("########  Username no login");
			result.setCode("401");
			result.setMessage("请登录 ");
			return result;
		}
		if(!(ConstantCommon.ADMIN.equals(sessionUser.getUserType()) || ConstantCommon.SUPADMIN.equals(sessionUser.getUserType()))) {
			logger.info("########  Username no Permission");
			result.setCode("500");
			result.setMessage("权限不足");
			return result;
		}
		result = createUser(ConstantCommon.TEACHER, userVO);
		if(result.isSuccess()) {
			teacherService.createTeacherInfo(userVO);
		}
		return result;
	}
	
	private ResponVO<UserVO> createUser(String userType, UserVO userVO) {
		ResponVO<UserVO> result = new ResponVO<UserVO>();
		result.setSuccess(false);
		result.setData(userVO);
		String id = UUID.randomUUID().toString();
		userVO.setUserId(id);
		userVO.setUserPassword(AESUtil.encrypt(userVO.getUserPassword()));
		userVO.setUserEmail(AESUtil.encrypt(userVO.getUserEmail()));
		userVO.setUserTel(AESUtil.encrypt(userVO.getUserTel()));
		userVO.setUserType(userType);
		userVO.setCreateTime(new Date());
		userVO.setUpdateTime(new Date());
		userVO.setIsEnable("1");
		userVO.setIsValid("1");
		int flag = userInfoDao.createUser(userVO);
		if(flag>0) {
			result.setCode("200");
			result.setMessage("增加成功");
			result.setSuccess(true);
			logger.info("########  Create user successful");
		}else {
			result.setCode("500");
			result.setMessage("增加失败");
			logger.info("########  Create user fail");
		}
		return result;
	}

	@Override
	public ResponVO<String> deleteUserByUserId(String userId) {
		ResponVO<String> result = new ResponVO<String>();
		result.setSuccess(false);
		if(StringUtils.isEmpty(userId)) {
			result.setCode("500");
			result.setMessage("The userId is null");
			return result;
		}
		userInfoDao.deleteUserById(userId);
		logger.info("########  Delete user successful");
		result.setCode("200");
		result.setSuccess(true);
		return result;
	}

	@Override
	public ResponVO<String> deleteUsers(List<String> ids) {
		ResponVO<String> result = new ResponVO<String>();
		result.setSuccess(false);
		if(ids == null || ids.isEmpty()) {
			logger.info("########  The userIds is null");
			result.setCode("500");
			result.setMessage("The userIds is null");
			return result;
		}
		userInfoDao.deleteUsersByIds(ids);
		logger.info("########  Delete user successful");
		result.setCode("200");
		result.setSuccess(true);
		return result;
	}

	@Override
	public ResponVO<PageInfo> findUserByAccount(String userAccount, String isEnable) {
		ResponVO<PageInfo> result = new ResponVO<>();
		result.setSuccess(false);
		if(userAccount.isEmpty()) {
			logger.info("########  Account is null");
			result.setCode("500");
			result.setMessage("Account is null");
			return result;
		}
		UserVO userInfo = new UserVO();
		userInfo.setUserAccount(userAccount);
		userInfo.setIsEnable(isEnable);
		UserVO user = userInfoDao.findAccountInfo(userInfo);
		if(user != null) {
			List<UserVO> list = new ArrayList<UserVO>();
			list.add(user);
			PageInfo pageInfo = new PageInfo(list);
			logger.info("########  Find account successful");
			result.setCode("200");
			result.setSuccess(true);
			result.setMessage("Find account successful");
			result.setData(pageInfo);
			return result;
		}
		logger.info("########  User is not exist");
		result.setCode("500");
		result.setMessage("用户不存在");
		return result;
	}

	@Override
	public ResponVO<UserVO> findUserById(String userId) {
		ResponVO<UserVO> result = new ResponVO<>();
		result.setSuccess(false);
		if(userId.isEmpty()) {
			logger.info("########  userId is null");
			result.setCode("500");
			result.setMessage("userId is null");
			return result;
		}
		UserVO user = userInfoDao.findAccountById(userId);
		if(user != null) {
			logger.info("########  Find account successful");
			if(StringUtils.isNotEmpty(user.getUserEmail())) {
				user.setUserEmail(AESUtil.decrypt(user.getUserEmail()));
			}
			if(StringUtils.isNotEmpty(user.getUserTel())) {
				user.setUserTel(AESUtil.decrypt(user.getUserTel()));
			}
			result.setCode("200");
			result.setSuccess(true);
			result.setMessage("Find account successful");
			result.setData(user);
			return result;
		}
		logger.info("########  User is not exist");
		result.setCode("500");
		result.setMessage("用户不存在");
		return result;
	}

	@Override
	public ResponVO<String> updateUser(UserVO userVO) {
		logger.info(request.getSession().getId());
		ResponVO<String> result = new ResponVO<>();
		result.setSuccess(false);
		UserVO userSession = SessionCommon.checkUser(request);
		if(userSession == null) {
			result.setCode("401");
			result.setMessage("请登录");
			return result;
		}
		//用户名是否已存在
		UserVO user = userInfoDao.findAccountByAccount(userVO.getUserAccount());
		if (user == null) {
			logger.info("########  Username is not exists");
			result.setMessage("用户名不存在");
			return result;
		}
		if(!(ConstantCommon.SUPADMIN.equals(userSession.getUserType()) || user.getUserType().equals(userSession.getUserType()))) {
			result.setMessage("当前登录用户权限不足");
			return result;
		}
		logger.info("########  Update user");
		
		userVO.setLastLogin(null);
		userVO.setUserEmail(AESUtil.encrypt(userVO.getUserEmail()));
		userVO.setUserTel(AESUtil.encrypt(userVO.getUserTel()));
		userVO.setUpdateTime(new Date());
		int flag = userInfoDao.updateUser(userVO);
		if(flag>0) {
			result.setCode("200");
			result.setMessage("修改成功");
			result.setSuccess(true);
			logger.info("########  Update user successful");
		}else {
			result.setCode("500");
			result.setMessage("修改失败");
			logger.info("########  Update user fail");
		}
		return result;
	}

	@Override
	public ResponVO<String> deleteUser(List<String> userId) {
		ResponVO<String> result = new ResponVO<String>();
		result.setSuccess(false);
		if(userId.isEmpty() || userId == null) {
			result.setCode("500");
			result.setMessage("The userId is null");
			return result;
		}
		userInfoDao.deleteLogically(userId);
		logger.info("########  Delete user successful");
		result.setCode("200");
		result.setSuccess(true);
		return result;
	}

	@Override
	public ResponVO<String> restUsersByUserId(List<String> ids) {
		ResponVO<String> result = new ResponVO<String>();
		result.setSuccess(false);
		if(ids.isEmpty() || ids == null) {
			result.setCode("500");
			result.setMessage("The userId is null");
			return result;
		}
		userInfoDao.restLogically(ids);
		logger.info("########  Rest user successful");
		result.setCode("200");
		result.setSuccess(true);
		return result;
	}

	@Override
	public ResponVO<String> restPssword(String userId) {
		ResponVO<String> result = new ResponVO<String>();
		result.setSuccess(false);
		result.setCode("500");
		UserVO user = SessionCommon.checkUser(request);
		if(user == null) {
			result.setCode("401");
			result.setMessage("请登录");
			return result;
		}
		if(!ConstantCommon.SUPADMIN.equals(user.getUserType())) {
			result.setMessage("当前登录用户权限不足");
			return result;
		}
		int randNum = 0;
		try {
			randNum = SecureRandom.getInstance("SHA1PRNG").nextInt(999999999);
		} catch (NoSuchAlgorithmException e) {
			logger.info("NoSuchAlgorithmException"+e);
		}
		UserVO userVO = new UserVO();
		String password = Integer.toString(randNum);
		String secuPwd = AESUtil.encrypt(password);
		userVO.setUserId(userId);
		userVO.setUserPassword(secuPwd);
		userVO.setUpdateTime(new Date());
		userInfoDao.updateUser(userVO);
		result.setCode("200");
		result.setSuccess(true);
		result.setMessage("重置密码成功");
		result.setData(password);
		return result;
	}

	@Override
	public ResponVO<UserVO> getUserInfo() {
		ResponVO<UserVO> result = new ResponVO<>();
		result.setSuccess(false);
		UserVO nowUser = SessionCommon.checkUser(request);
		if(nowUser == null) {
			logger.info("########  No user login");
			result.setCode("401");
			result.setMessage("请登录");
			return result;
		}
		UserVO user = userInfoDao.findAccountById(nowUser.getUserId());
		if(user != null) {
			logger.info("########  Find account successful");
			if(StringUtils.isNotEmpty(user.getUserEmail())) {
				user.setUserEmail(AESUtil.decrypt(user.getUserEmail()));
			}
			if(StringUtils.isNotEmpty(user.getUserTel())) {
				user.setUserTel(AESUtil.decrypt(user.getUserTel()));
			}
			result.setCode("200");
			result.setSuccess(true);
			result.setMessage("Find account successful");
			result.setData(user);
			return result;
		}
		logger.info("########  User is not exist");
		result.setCode("500");
		return result;
	}

	@Override
	public ResponVO<String> updatePassword(UserVO userVO) {
		ResponVO<String> result = new ResponVO<>();
		result.setSuccess(false);
		UserVO userSession = SessionCommon.checkUser(request);
		if(userSession == null) {
			result.setCode("401");
			result.setMessage("请登录");
			return result;
		}
		//用户名是否已存在
		UserVO user = userInfoDao.findAccountByAccount(userVO.getUserAccount());
		if (user == null) {
			logger.info("########  Username is not exists");
			result.setMessage("用户名不存在");
			return result;
		}
		if(!(ConstantCommon.SUPADMIN.equals(userSession.getUserType()) || user.getUserType().equals(userSession.getUserType()))) {
			result.setMessage("当前登录用户权限不足");
			return result;
		}
		String oldpwd = AESUtil.decrypt(userSession.getSecretPassword());
		if(!(userVO.getUserPassword().equals(oldpwd))) {
			result.setCode("201");
			result.setMessage("旧密码错误");
			return result;
		}
		if(userVO.getNewPassword().isEmpty()) {
			result.setCode("500");
			result.setMessage("新密码为空");
			return result;
		}
		logger.info("########  Update user");
		
		userVO.setLastLogin(null);
		String pwd = userVO.getNewPassword();
		userVO.setUserPassword(AESUtil.encrypt(pwd));
		userVO.setUpdateTime(new Date());
		int flag = userInfoDao.updateUser(userVO);
		if(flag>0) {
			result.setCode("200");
			result.setMessage("修改成功");
			result.setSuccess(true);
			request.getSession().invalidate();
			logger.info("########  Update user successful");
		}else {
			result.setCode("500");
			result.setMessage("修改失败");
			logger.info("########  Update user fail");
		}
		return result;
	}

	@Override
	public ResponVO<UserVO> createAdmin(UserVO userVO) {
		ResponVO<UserVO> result = new ResponVO<UserVO>();
		result.setSuccess(false);
		result.setData(userVO);
		logger.info("########  Create user");
		//用户名是否已存在
		UserVO user = userInfoDao.findAccountByAccount(userVO.getUserAccount());
		if(user != null) {
			logger.info("########  Username already exists");
			result.setMessage("用户名已存在");
			return result;
		}
		UserVO sessionUser = SessionCommon.checkUser(request);
		if(sessionUser == null) {
			logger.info("########  Username no login");
			result.setCode("401");
			result.setMessage("请登录 ");
			return result;
		}
		if(!ConstantCommon.SUPADMIN.equals(sessionUser.getUserType())) {
			logger.info("########  Username no Permission");
			result.setCode("500");
			result.setMessage("权限不足");
			return result;
		}
		return createUser(ConstantCommon.ADMIN, userVO);
	}

}
