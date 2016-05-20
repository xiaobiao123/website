/**
 * Copyright 2014-2015 goujia.com
 * All rights reserved.
 * 
 * @project
 * @author Flouny.Caesar
 * @version 1.0
 * @date 2014-06-13
 */
package com.goujia.website.base.ges.vo;

import java.math.BigDecimal;

import com.goujia.website.base.ges.entity.Goods;

public class GoodsVO extends Goods{
	/**
	 * 产品价格类型，如：水电，软装价格等
	 */
	private Integer priceType;
	
	/**
	 * 产品价格名称
	 */
	private String priceName;
	
	/**
	 * 产品价格
	 */
	private BigDecimal price;
	
	/**
	 * 排序
	 */
	private Integer orderIndex;
	
	/**
	 * 4S店ID
	 */
	private Integer shopId;
	
	/**
	 * 楼盘ID
	 */
	private Integer buildingId=0;
	
	/**
	 * 省份
	 */
	private Integer provinceId;
	
	/**
	 * 城市
	 */
	private Integer cityId;
	
	/**
	 * 县区
	 */
	private Integer countyId=0;
	
	/**
	 * 原始户型图
	 */
	private String oriPhotoPath;
	
	/**
	 * 楼盘名称
	 */
	private String buildingName;
	
	/**
	 * 面积
	 */
	private String floorArea;
	
	/**
	 * 最小价格
	 */
	private BigDecimal minPrice;
	
	/**
	 * 最大价格
	 */
	private BigDecimal maxPrice;
	
	/**
	 * 最小面积
	 */
	private Double minArea;
	
	/**
	 * 最大面积
	 */
	private Double maxArea;
	
	/**
	 * 全文参数
	 */
	private String q;
	
	/**
	 * 价格排序标志
	 */
	private String orderName="default";
	
	/**
	 * 排序类型，倒序或者正序
	 */
	private String orderType;
	
	/**
	 * 销售数量
	 */
	private Integer saleNum;
	
	/**
	 * 产品ids
	 */
	private String ids;
	private Integer priceId=0;
	private Integer areaId=0;
	/**
	 * 搜索房间属性
	 */
	private Integer roomId;
	
	public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getPriceId() {
        return priceId;
    }

    public void setPriceId(Integer priceId) {
        this.priceId = priceId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getPriceType() {
		return priceType;
	}

	public void setPriceType(Integer priceType) {
		this.priceType = priceType;
	}

	public String getPriceName() {
		return priceName;
	}

	public void setPriceName(String priceName) {
		this.priceName = priceName;
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

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public Integer getBuildingId() {
		return buildingId;
	}

	public void setBuildingId(Integer buildingId) {
		this.buildingId = buildingId;
	}

	public Integer getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public Integer getCountyId() {
		return countyId;
	}

	public void setCountyId(Integer countyId) {
		this.countyId = countyId;
	}

	public String getOriPhotoPath() {
		return oriPhotoPath;
	}

	public void setOriPhotoPath(String oriPhotoPath) {
		this.oriPhotoPath = oriPhotoPath;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getFloorArea() {
		return floorArea;
	}

	public void setFloorArea(String floorArea) {
		this.floorArea = floorArea;
	}

	public BigDecimal getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(BigDecimal minPrice) {
		this.minPrice = minPrice;
	}

	public BigDecimal getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(BigDecimal maxPrice) {
		this.maxPrice = maxPrice;
	}

	public Double getMinArea() {
		return minArea;
	}

	public void setMinArea(Double minArea) {
		this.minArea = minArea;
	}

	public Double getMaxArea() {
		return maxArea;
	}

	public void setMaxArea(Double maxArea) {
		this.maxArea = maxArea;
	}

	public String getQ() {
		return q;
	}

	public void setQ(String q) {
		this.q = q;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public Integer getSaleNum() {
		return saleNum;
	}

	public void setSaleNum(Integer saleNum) {
		this.saleNum = saleNum;
	}

	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}
	
}