/**
 * Copyright 2014-2015 goujia.com
 * All rights reserved.
 * 
 * @project
 * @author jipengfei
 * @version 1.0
 * @date 2014-06-12
 */
package com.goujia.website.base.ges.entity;

/**
 * 产品包物料 实例 Entity
 * 
 * @author jipengfei
 * 
 */
public class GoodsMatter {
	/**
	 * 主键
	 */
	private Integer id;
	
	/**
	 * 产品包ID
	 */
	private Integer goodsId;
	
	/**
	 * 物料ID
	 */
	private Integer matterId;
	
	/**
	 * 标记ID
	 */
	private Integer markId;
	
	/**
	 * 状态
	 */
	private String type;

    /**
     * 采购天数
     */
    private Integer purchaseDays;

    /**
     * 供应商ID
     */
    private Integer supplierId;

    /**
     * 数量
     */
    private Integer amount;

    /**
     * 房间ID
     */
    private Integer roomId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public Integer getMatterId() {
		return matterId;
	}

	public void setMatterId(Integer matterId) {
		this.matterId = matterId;
	}

	public Integer getMarkId() {
		return markId;
	}

	public void setMarkId(Integer markId) {
		this.markId = markId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

    public Integer getPurchaseDays() {
        return purchaseDays;
    }

    public void setPurchaseDays(Integer purchaseDays) {
        this.purchaseDays = purchaseDays;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }
}
