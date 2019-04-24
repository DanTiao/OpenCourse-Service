package com.cc.open.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cc.open.dao.AccountInfoMapper;
import com.cc.open.service.IUserService;
import com.cc.open.vo.ResponVO;
import com.cc.open.vo.UserVO;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;


@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	private IUserService userService;
	
	@Autowired
	private AccountInfoMapper accountInfoMapper;
	
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
	public ResponVO<List<UserVO>> findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
		ResponVO<List<UserVO>> result = new ResponVO<List<UserVO>>();
		PageHelper.startPage(pageNum, pageSize);
		List<UserVO> listUser = accountInfoMapper.findAllUser();
		return result;
	}

}
