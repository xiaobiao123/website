package com.goujia.website.base.dto.base;

import java.io.Serializable;

public class ResultDto<T> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8472504372064505648L;
	private boolean result;
	private T obj;
	private String errorCode;
	private String msg;
	
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}
	public Boolean getResult() {
		return result;
	}
	public void setResult(Boolean result) {
		this.result = result;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
