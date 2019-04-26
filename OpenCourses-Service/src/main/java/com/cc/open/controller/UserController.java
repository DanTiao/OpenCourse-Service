package com.cc.open.controller;

import java.util.List;

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
	
	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<UserVO> userLogin(@RequestBody UserVO userVO)
	{
		ResponVO<UserVO> result = userService.userLogin(userVO);
		return result;
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<UserVO> createUser(@RequestBody UserVO userVO){
		return userService.createUser(userVO);
	}
	
	@RequestMapping(value = "/findAll/{pageNum}/{pageSize}", method = RequestMethod.GET, produces = "application/json")
	public ResponVO<PageInfo> findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
		ResponVO<PageInfo> result = new ResponVO<>();
		PageHelper.startPage(pageNum, pageSize);
		logger.info("########  Paging query");
		List<UserVO> listUser = userInfoDao.findAllUser();
		PageInfo pageInfo = new PageInfo(listUser);
		result.setData(pageInfo);
		result.setSuccess(true);
		result.setCode("200");
		return result;
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<String> deleteUserByUserId(@RequestBody String userId){
		return userService.deleteUserByUserId(userId);
	}
	
	@RequestMapping(value = "/delete/users", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<String> deleteUsersByUserId(@RequestBody List<String> ids){
		return userService.deleteUsers(ids);
	}
	
	@RequestMapping(value = "/find", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<PageInfo> findUserByAccount(@RequestBody String userAccount){
		return userService.findUserByAccount(userAccount);
	}

}
