package com.goujia.website.base.vo.rec;

import com.goujia.website.base.vo.BaseSearchParam;

/**
 * Copyright 2014-2015 www.goujiawang.com
 * All rights reserved.
 * 
 * @project website-base
 * @author Wangfeng
 * @version 2.0
 * @date 2015年6月3日
 */
public class RecommendPositionSearchParam extends BaseSearchParam {
	
	private String posName;			//推荐位名称
	
	private String posCode;			//推荐位代码

	public String getPosName() {
		return posName;
	}

	public String getPosCode() {
		return posCode;
	}

	public void setPosCode(String posCode) {
		this.posCode = posCode;
	}

	public void setPosName(String posName) {
		this.posName = posName;
	}
	
}
