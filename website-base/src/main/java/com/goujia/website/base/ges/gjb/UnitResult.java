package com.goujia.website.base.ges.gjb;

import java.io.Serializable;

/**
 * 统一的返回值实体
 * @author User
 *
 */
public class UnitResult<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	//编码 0：成功 1：失败
	private String retCode;
	
	//失败信息
	private String retMsg;
	
	//返回的值
	private T retValue;
	
	public UnitResult() {
		
	}
	
	public UnitResult(String retCode, String retMsg, T retValue) {
		this.retCode = retCode;
		this.retMsg = retMsg;
		this.retValue = retValue;
	}

	public UnitResult(T retValue){
		this.retCode="0";
		this.retMsg="success";
		this.retValue=retValue;
	}

	public String getRetCode() {
		return retCode;
	}

	public void setRetCode(String retCode) {
		this.retCode = retCode;
	}

	public String getRetMsg() {
		return retMsg;
	}

	public void setRetMsg(String retMsg) {
		this.retMsg = retMsg;
	}

	public T getRetValue() {
		return retValue;
	}

	public void setRetValue(T retValue) {
		this.retValue = retValue;
	}
	
	
	
}
