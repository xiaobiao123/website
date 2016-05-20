/**
 * Copyright 2014-2015 goujia.com
 * All rights reserved.
 * 
 * @project
 * @author caoqi
 * @version 1.0
 * @date 2014-06-12
 */
package com.goujia.website.base.ges.entity;

import java.util.Date;

/**
 * 会员重置密码
 * 
 * @author zhangjl
 * @date 2014-11-14
 *
 */
public class MemberFindPwd  {
	/**
	 * 主键ID
	 */
	private Integer id;
	
	/**
	 * 会员ID
	 */
	private Integer memberId;
	
	/**
	 * 会员ID
	 */
	private String uuid;
	
	/**
	 * 创建人
	 */
	private Date gmtCreate;
	
	/**
	 * 是否删除
	 */
	private String isDeleted;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}
}