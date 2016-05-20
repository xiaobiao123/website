/**
 * Copyright 2014-2015 goujia.com
 * All rights reserved.
 * 
 * @project
 * @author Flouny.Caesar
 * @version 1.0
 * @date 2014-06-13
 */
package com.goujia.website.base.ges.vo;

import com.goujia.website.base.ges.entity.Member;

/**
 * 会员 VO
 * 
 * @author Flouny.Caesar
 *
 */
public class MemberVO extends Member{

    /**
	 * 帐号
	 */
	private String account;
	
	/**
	 * 
	 */
	private String openKey;
	
	/**
	 * 
	 */
	private String newLoginName;
	
	/**
	 * 
	 */
	private String newRealName;
	
	/**
	 * 
	 */
	private String newEmail;

	/**
	 * 用户登录IP
	 */
	private String loginIp;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getOpenKey() {
		return openKey;
	}

	public void setOpenKey(String openKey) {
		this.openKey = openKey;
	}

	public String getLoginIp() {
		return loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}
	
	public String getNewLoginName() {
		return newLoginName;
	}

	public void setNewLoginName(String loginName) {
		this.newLoginName = loginName;
	}
	
	public String getNewRealName() {
		return newRealName;
	}

	public void setNewRealName(String realName) {
		this.newRealName =realName;
	}
	
	public String getNewEmail() {
		return newEmail;
	}

	public void setNewEmail(String email) {
		this.newEmail =email;
	}
}