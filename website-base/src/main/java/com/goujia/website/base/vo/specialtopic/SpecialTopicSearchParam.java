package com.goujia.website.base.vo.specialtopic;

import com.goujia.website.base.vo.BaseSearchParam;

/**
 * Copyright 2014-2015 www.goujiawang.com
 * All rights reserved.
 * 
 * @project website-base
 * @author Wangfeng
 * @version 2.0
 * @date 2015年6月2日
 */
	
public class SpecialTopicSearchParam extends BaseSearchParam {
	private String isDeleted;			//是否删除
	private String specialTopicName;	//专题名称
	private Integer userId;				//用户id
	private String labelId; 			//标签id
	
	public String getLabelId() {
		return labelId;
	}

	public void setLabelId(String labelId) {
		this.labelId = labelId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public SpecialTopicSearchParam() {
		this.isDeleted = "n";
	}

	public String getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getSpecialTopicName() {
		return specialTopicName;
	}

	public void setSpecialTopicName(String specialTopicName) {
		this.specialTopicName = specialTopicName;
	}
	
	
}
