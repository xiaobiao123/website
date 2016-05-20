/**
 * Copyright 2014-2015 www.goujiawang.com
 * All rights reserved.
 * 
 * @project
 * @author xieshangzhen
 * @version 3.0
 * @date 2015-07-23
 */
package com.goujia.website.base.ges.entity;

/**
 * 产品包销售订单关联的物料(采购清单)
 * 
 * @author xieshangzhen
 * @date 2015-07-23
 * 
 */
public class SoMatter{
	/**
	 * primary key
	 */
	private Integer id;
	
	/**
	 * 销售订单id
	 */
	private Integer soId;
	/**
	 * 材料id
	 */
	private Integer matterId;
	/**
	 * 房间id
	 */
	private Integer roomId;
	/**
	 * 物料类型 'standard'|'optional' '标配'|'选配'
	 */
	private String type;
	/**
	 * 关联标配的物料id
	 */
	private Integer relativeMatterId;
	/**
	 * 数量
	 */
	private double quantity;
	/**
	 * 已采购数量
	 */
	private double purQuantity;
	/**
	 * 已入库数量
	 */
	private double stockInQuantity;
	/**
	 * 已发货数量
	 */
	private double deliveryQuantity;
	/**
	 * 已出库数量
	 */
	private double stockOutQuantity;
	/**
	 * 市场价（物料中的市场价）
	 */
	private double marketPrice;
	/**
	 * 销售价（4s销售，目前没有）
	 */
	private double salesPrice;
	/**
	 * 采购价（构家网销售价，4s成本价，物料中的销售价）
	 */
	private double purchasePrice;
	/**
	 * 成本价（构家网的采购价，物料中的成本价）
	 */
	private double costPrice;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMatterId() {
		return matterId;
	}

	public void setMatterId(Integer matterId) {
		this.matterId = matterId;
	}

	public Integer getRoomId() {
		return roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getRelativeMatterId() {
		return relativeMatterId;
	}

	public void setRelativeMatterId(Integer relativeMatterId) {
		this.relativeMatterId = relativeMatterId;
	}

	public Integer getSoId() {
		return soId;
	}

	public void setSoId(Integer soId) {
		this.soId = soId;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getPurQuantity() {
		return purQuantity;
	}

	public void setPurQuantity(double purQuantity) {
		this.purQuantity = purQuantity;
	}

	public double getStockInQuantity() {
		return stockInQuantity;
	}

	public void setStockInQuantity(double stockInQuantity) {
		this.stockInQuantity = stockInQuantity;
	}

	public double getDeliveryQuantity() {
		return deliveryQuantity;
	}

	public void setDeliveryQuantity(double deliveryQuantity) {
		this.deliveryQuantity = deliveryQuantity;
	}

	public double getStockOutQuantity() {
		return stockOutQuantity;
	}

	public void setStockOutQuantity(double stockOutQuantity) {
		this.stockOutQuantity = stockOutQuantity;
	}

	public double getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(double marketPrice) {
		this.marketPrice = marketPrice;
	}

	public double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}

	public double getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public double getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(double costPrice) {
		this.costPrice = costPrice;
	}

}
