package com.cc.open.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cc.open.domain.UserInfo;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	//@Autowired
//	private final Logger logger = LoggerFactory.
	
	@RequestMapping(value = "/testConnect", method = RequestMethod.GET, produces = "application/json")
	public UserInfo getConnect()
	{
		System.out.println("qweqweqew");
		UserInfo userInfo = new UserInfo();
		userInfo.setUserAccount("1231214214");
		userInfo.setUserPassword("213sadadsa");
		return userInfo;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json")
	public Map<String,Object> stringTest(String form)
	{
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("code", 200);
		map.put("data", "successfully");
		System.out.println("进来了"+form);
		return map;
	}

}
