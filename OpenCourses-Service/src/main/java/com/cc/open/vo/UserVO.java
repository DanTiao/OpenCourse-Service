package com.cc.open.vo;

import java.io.Serializable;

public class UserVO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String userId;
	private String userName;
	private String account;
	private String secretAccount;
	private String password;
	private String secretPassword;
	private String userType;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getSecretAccount() {
		return secretAccount;
	}
	public void setSecretAccount(String secretAccount) {
		this.secretAccount = secretAccount;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
}
