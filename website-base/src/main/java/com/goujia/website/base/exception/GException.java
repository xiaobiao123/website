package com.goujia.website.base.exception;

public class GException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2600466729736495593L;
	private String errorCode;
	public GException(){
		
	}
	public GException(String message){
		this(message,null);
	}
	public GException(String message,String errorCode){
		super(message);
		this.errorCode=errorCode;
	}
	public String getErrorCode(){
		return this.errorCode;
	}
	
}
