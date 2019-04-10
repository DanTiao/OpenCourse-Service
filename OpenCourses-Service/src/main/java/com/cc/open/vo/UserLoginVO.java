package com.cc.open.vo;

import java.io.Serializable;

public class UserLoginVO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String userName;
	private String secretUserName;
	private String password;
	private String secretPassword;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSecretUserName() {
		return secretUserName;
	}
	public void setSecretUserName(String secretUserName) {
		this.secretUserName = secretUserName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSecretPassword() {
		return secretPassword;
	}
	public void setSecretPassword(String secretPassword) {
		this.secretPassword = secretPassword;
	}
	
}
