package com.cc.open.vo;

import java.io.Serializable;

public class ResponVO<T> implements Serializable {

	private static final long serialVersionUID = 1L;
	private String code;
	private boolean success;
	private String message;
	private T data;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	

}
