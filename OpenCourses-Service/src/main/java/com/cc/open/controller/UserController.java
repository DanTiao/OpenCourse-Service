package com.cc.open.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cc.open.service.UserService;
import com.cc.open.vo.RequestVO;
import com.cc.open.vo.UserLoginVO;



@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json")
	public RequestVO<UserLoginVO> stringTest(UserLoginVO userLoginVO)
	{
		return userService.userLogin(userLoginVO);
//		Map<String,Object> map = new HashMap<String,Object>();
//		map.put("code", 400);
//		map.put("data", "successfully");
//		logger.info("进来了"+userLoginVO+"------"+userLoginVO.getUserPassword());
//		return map;
	}

}
