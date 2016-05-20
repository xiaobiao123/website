/**
 * Copyright 2014-2015 www.goujiawang.com
 * All rights reserved.
 * 
 * @project
 * @author xieshangzhen
 * @version 3.0
 * @date 2015-07-23
 */
package com.goujia.website.base.ges.vo;

import com.goujia.website.base.ges.entity.SoMatter;

/**
 * 
 * @author xieshangzhen
 * @date 2015年7月23日
 * 
 */
public class SoMatterVO extends SoMatter {
	/**
	 * so_matter_id
	 */
	private Integer smId;

	/**
	 * 物料编码
	 */
	private String code;

	/**
	 * 物料名称
	 */
	private String name;

	/**
	 * 型号
	 */
	private String model;

	/**
	 * 颜色
	 */
	private String color;

	/**
	 * 材质
	 */
	private String materials;

	/**
	 * 状态
	 */
	private String status;

	/**
	 * 尺寸
	 */
	private String dimension;

	/**
	 * 单位
	 */
	private String unit;

	/**
	 * 类目名称
	 */
	private String categoryName;

	/**
	 * 品牌名称
	 */
	private String brandName;
	/**
	 * 房间名称
	 */
	private String roomName;
	/**
	 * 库存数量
	 */
	private double stockNum;
	/**
	 * 4S店id
	 */
	private Integer shopId;
	/**
	 * 城运商id
	 */
	private Integer operatorId;
	/**
	 * 仓库id
	 */
	private Integer storeId;

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterials() {
		return materials;
	}

	public void setMaterials(String materials) {
		this.materials = materials;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Integer getSmId() {
		return smId;
	}

	public void setSmId(Integer smId) {
		this.smId = smId;
	}

	public double getStockNum() {
		return stockNum;
	}

	public void setStockNum(double stockNum) {
		this.stockNum = stockNum;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public Integer getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(Integer operatorId) {
		this.operatorId = operatorId;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

}
