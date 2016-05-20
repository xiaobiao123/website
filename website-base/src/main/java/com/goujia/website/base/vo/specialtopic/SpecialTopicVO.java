package com.goujia.website.base.vo.specialtopic;

import com.goujia.website.base.entity.specialtopic.SpecialTopic;


/**
 * Copyright 2014-2015 www.goujiawang.com
 * All rights reserved.
 * 
 * @project website-base
 * @author Wangfeng
 * @version 2.0
 * @date 2015年6月1日
 */
public class SpecialTopicVO extends SpecialTopic {
	private int collectId;		//是否收藏

	public int getCollectId() {
		return collectId;
	}

	public void setCollectId(int collectId) {
		this.collectId = collectId;
	}
	
}
