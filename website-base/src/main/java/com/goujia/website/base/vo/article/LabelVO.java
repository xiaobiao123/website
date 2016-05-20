package com.goujia.website.base.vo.article;

import java.util.List;

import com.goujia.website.base.entity.article.Label;


/**
 * Copyright 2014-2015 www.goujiawang.com
 * All rights reserved.
 * 
 * @project website-base
 * @author jiqijie
 * @version 2.0
 * @date 2015年6月2日
 */

public class LabelVO extends Label{
	private String parentName;
	private List<LabelVO> childList;


	public List<LabelVO> getChildList() {
		return childList;
	}

	public void setChildList(List<LabelVO> childList) {
		this.childList = childList;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	
}

