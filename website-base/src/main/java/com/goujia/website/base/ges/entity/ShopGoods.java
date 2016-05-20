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
 * 4S店产品关系 实例 Entity
 * 
 * @author jipengfei
 * 
 */
public class ShopGoods {

	/**
	 * 4S店ID
	 */
	private Integer shopId;
	
	/**
	 * 产品包ID
	 */
	private Integer goodsId;
	
	/**
	 * 已销售数量
	 */
	private Integer saleNum;
	
	/**
	 * 排序
	 */
	private Integer orderIndex;
	
	/**
	 * 状态 'enable'|'disable'|'deleted' '可用的'|'不可用'|'删除'
	 */
	private String status;
	
	/**
	 * 创建时间
	 */
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	private Date gmtModified;

	/**
	 * 拥有者
	 */
	private Integer ownerId;

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public Integer getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public Integer getOrderIndex() {
		return orderIndex;
	}

	public void setOrderIndex(Integer orderIndex) {
		this.orderIndex = orderIndex;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Integer getSaleNum() {
		return saleNum;
	}

	public void setSaleNum(Integer saleNum) {
		this.saleNum = saleNum;
	}

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }
}
