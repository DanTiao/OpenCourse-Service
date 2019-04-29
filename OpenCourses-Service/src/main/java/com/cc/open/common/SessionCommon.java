package com.cc.open.common;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.cc.open.vo.UserVO;

public class SessionCommon {

	@Autowired
	private static HttpServletRequest request;
	
	private static final Logger logger = LoggerFactory.getLogger(SessionCommon.class);
	
	public static UserVO checkUser(HttpServletRequest re) {
		try {
			logger.info(re.getSession().getId());
			return (UserVO) re.getSession().getAttribute(ConstantCommon.USER);
		}catch(Exception e){
			logger.error("check loging user error:"+e);
		}
		return null;
	}
	
	public static boolean isLogin(HttpServletRequest re) {
		try {
			logger.info(re.getSession().getId());
			return re.getSession().getAttribute(ConstantCommon.USER) != null;
		}catch(Exception e){
			logger.error("check loging user error:"+e);
		}
		return false;
	}
	
	public static boolean isAdmin(HttpServletRequest re) {
		if(isLogin(re)) {
			UserVO user = checkUser(re);
			String type = user.getUserType();
			if(ConstantCommon.ADMIN.equals(type)) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean isSupAdmin(HttpServletRequest re) {
		if(isLogin(re)) {
			UserVO user = checkUser(re);
			String type = user.getUserType();
			if(ConstantCommon.SUPADMIN.equals(type)) {
				return true;
			}
		}
		return false;
	}
}
