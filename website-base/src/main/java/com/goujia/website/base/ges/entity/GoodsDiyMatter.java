/**
 * Copyright 2014-2015 goujia.com
 * All rights reserved.
 * 
 * @project
 * @author guojianbin
 * @version 3.0
 * @date 2015-09-17
 */
package com.goujia.website.base.ges.entity;


/**
 * DIY清单实体
 * @author guojianbin
 *
 */
public class GoodsDiyMatter {

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
	 * 房间ID
	 */
	private Integer roomId;
	
	/**
	 * 变化数量
	 */
	private Integer amount;
	
	/**
	 *  物料类型
	 */
	private String type;
	
	/**
	 *  采购天数
	 */
	private Integer purchaseDays;
	
	/**
	 *  供应商ID
	 */
	private Integer supplierId;
	
	/**
	 * 是否标配，Y|是  N|否
	 * @return
	 */
    private String isStandard;

	/**
	 * 操作类型 , 0|1|2 增加|减少|更换
	 */
    private Integer oprateType;

	/**
	 * 原g_goods_matter的ID
	 */
    private Integer originalId;

	/**
	 * 减少后的数量
	 */
    private Integer finalAmount;

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
        this.type = type == null ? null : type.trim();
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

    public String getIsStandard() {
        return isStandard;
    }

    public void setIsStandard(String isStandard) {
        this.isStandard = isStandard == null ? null : isStandard.trim();
    }

    public Integer getOprateType() {
        return oprateType;
    }

    public void setOprateType(Integer oprateType) {
        this.oprateType = oprateType;
    }

    public Integer getOriginalId() {
        return originalId;
    }

    public void setOriginalId(Integer originalId) {
        this.originalId = originalId;
    }

    public Integer getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(Integer finalAmount) {
        this.finalAmount = finalAmount;
    }
}