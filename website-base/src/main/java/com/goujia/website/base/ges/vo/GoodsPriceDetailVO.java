package com.goujia.website.base.ges.vo;

import com.goujia.website.base.ges.entity.GoodsPriceDetail;

/**
 * 预算管理
 * @author caorz
 *
 */
public class GoodsPriceDetailVO extends GoodsPriceDetail{
	private String imgPath;

	private Integer parentId;
	
	private String name;
	
	private String goodsPriceJson;
	
	
	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGoodsPriceJson() {
		return goodsPriceJson;
	}

	public void setGoodsPriceJson(String goodsPriceJson) {
		this.goodsPriceJson = goodsPriceJson;
	}
	
	
}
