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

import java.math.BigDecimal;

/**
 * 产品价格明细
 * 
 * @author caoqi
 * @date 2014-06-12
 *
 */
public class GoodsPriceDetail{
	/**
	 * 产品ID
	 * G_GOODS.ID
	 */
	private Integer goodsId;
	
	/**
	 * 价格类型
	 */
	private Integer typeId;

	/**
	 * 价格类型名称
	 */
	private String typeName;

	/**
	 * 价格
	 */
	private BigDecimal price;

	/**
	 * 排序
	 */
	private Integer orderIndex;

	public Integer getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getOrderIndex() {
		return orderIndex;
	}

	public void setOrderIndex(Integer orderIndex) {
		this.orderIndex = orderIndex;
	}
	
}