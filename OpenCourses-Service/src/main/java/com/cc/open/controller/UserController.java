package com.cc.open.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cc.open.service.IUserService;
import com.cc.open.vo.ResponVO;
import com.cc.open.vo.UserLoginVO;


@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	private IUserService iUserService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json")
	public ResponVO<UserLoginVO> stringTest(@RequestBody UserLoginVO userLoginVO)
	{
		ResponVO<UserLoginVO> result = iUserService.userLogin(userLoginVO);
		return result;
	}
	

}
