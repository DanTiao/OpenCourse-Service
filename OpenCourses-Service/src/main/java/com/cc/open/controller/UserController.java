package com.cc.open.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import com.cc.open.common.ConstantCommon;
import com.cc.open.common.SessionCommon;
import com.cc.open.dao.UserInfoMapper;
import com.cc.open.service.IUserService;
import com.cc.open.vo.ResponVO;
import com.cc.open.vo.UserVO;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	private IUserService userService;
	
	@Autowired
	private UserInfoMapper userInfoDao;
	
	@Autowired
	private HttpServletRequest request;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<UserVO> userLogin(@RequestBody UserVO userVO)
	{
		ResponVO<UserVO> result = userService.userLogin(userVO);
		return result;
	}
	
	@RequestMapping(value = "/add/user", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<UserVO> createUser(@RequestBody UserVO userVO){
		return userService.createTeacher(userVO);
	}
	
	@RequestMapping(value = "/add/admin", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<UserVO> createAdmin(@RequestBody UserVO userVO){
		return userService.createAdmin(userVO);
	}
	
	@RequestMapping(value = "/findAll/teachers/{pageNum}/{pageSize}", method = RequestMethod.GET, produces = "application/json")
	public ResponVO<PageInfo> findAllTeachers(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize, @RequestParam("isEnable") String isEnable){
		ResponVO<PageInfo> result = new ResponVO<>();
		PageHelper.startPage(pageNum, pageSize);
		logger.info("########  Paging query");
		List<UserVO> listUser = userInfoDao.findAllUser(isEnable,ConstantCommon.TEACHER);
		PageInfo pageInfo = new PageInfo(listUser);
		result.setData(pageInfo);
		result.setSuccess(true);
		result.setCode("200");
		return result;
	}
	
	@RequestMapping(value = "/findAll/admin/{pageNum}/{pageSize}", method = RequestMethod.GET, produces = "application/json")
	public ResponVO<PageInfo> findAllAdmins(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize, @RequestParam("isEnable") String isEnable){
		ResponVO<PageInfo> result = new ResponVO<>();
		if(!SessionCommon.isLogin(request)) {
			result.setSuccess(false);
			result.setCode("401");
			result.setMessage("请登录");
			return result;
		}
		if(!SessionCommon.isSupAdmin(request)) {
			result.setSuccess(false);
			result.setCode("500");
			result.setMessage("登录用户权限不足");
			return result;
		}
		PageHelper.startPage(pageNum, pageSize);
		logger.info("########  Paging query");
		List<UserVO> listUser = userInfoDao.findAllUser(isEnable,ConstantCommon.ADMIN);
		PageInfo pageInfo = new PageInfo(listUser);
		result.setData(pageInfo);
		result.setSuccess(true);
		result.setCode("200");
		return result;
	}
	
	/**
	 * 逻辑删除
	 * @param userId
	 * @return
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<String> deleteUser(@RequestBody List<String> userId){
		return userService.deleteUser(userId);
	}
	
//	@RequestMapping(value = "/delete/user", method = RequestMethod.POST, produces = "application/json")
//	public ResponVO<String> deleteUserByUserId(@RequestBody String userId){
//		return userService.deleteUserByUserId(userId);
//	}
	
	/**
	 * 物理删除
	 * @param ids
	 * @return
	 */
	@RequestMapping(value = "/delete/users", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<String> deleteUsersByUserId(@RequestBody List<String> ids){
		return userService.deleteUsers(ids);
	}
	
	@RequestMapping(value = "/rest_enable", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<String> restUsersByUserId(@RequestBody List<String> ids){
		return userService.restUsersByUserId(ids);
	}
	
	@RequestMapping(value = "/find/{isEnable}", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<PageInfo> findUserByAccount(@PathVariable("isEnable") String isEnable, @RequestBody String userAccount){
		return userService.findUserByAccount(userAccount, isEnable);
	}
	
	/**
	 * 通过用户id获取用户信息
	 * @param userId
	 * @return
	 */
	@RequestMapping(value = "/find/info/{userId}", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<UserVO> findUserById(@PathVariable("userId") String userId){
		return userService.findUserById(userId);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<String> updateUser(@RequestBody UserVO userVO){
		return userService.updateUser(userVO);
	}
	
	@RequestMapping(value = "/update/password", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<String> updatePassword(@RequestBody UserVO userVO){
		return userService.updatePassword(userVO);
	}
	
	
	@RequestMapping(value = "/rest_password", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<String> restPssword(@RequestBody String userId){
		return userService.restPssword(userId);
	}
	
	@RequestMapping(value = "/get/info", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<UserVO> getUserInfo(){
		return userService.getUserInfo();
	}
	
	@RequestMapping(value = "/set_admin", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<UserVO> setUserToAdmin(@RequestBody UserVO userVO){
		return userService.setUserToAdmin(userVO);
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET, produces = "application/json")
	public ResponVO<String> userLogout(){
		return userService.userLogout();
	}
	
	@RequestMapping(value = "/pwd/rest", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<UserVO> userRestPwd(@RequestBody UserVO userVO)
	{
		ResponVO<UserVO> result = userService.userRestPwd(userVO);
		return result;
	}

}
