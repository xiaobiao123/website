package com.goujia.website.base.ges.vo;

import com.goujia.website.base.ges.entity.Goods;

/**
 * Created by archer on 2014/9/11.
 */
public class GoodsShopVO extends Goods{

	/**
     * 楼盘ID
     */
    private String buildingId;

    /**
    * 楼盘名
    */
    private String buildingName;

    /**
    * 4s店名
    */
    private Integer shopId;

    /**
     * 关联
     */
    private Integer join;

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
    private Integer countyId;

    /**
     * 房屋编码
     */
    private String houseCode;

    /**
     * 房屋面积
     */
    private Double floorArea;

    /**
     * 4s
     */
    private String shopIds;

    /**
     * 4S店关联产品状态
     */
    private String shopGoodsStatus;

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(String buildingId) {
        this.buildingId = buildingId;
    }

    public Integer getJoin() {
        return join;
    }

    public void setJoin(Integer join) {
        this.join = join;
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

    public String getHouseCode() {
        return houseCode;
    }

    public void setHouseCode(String houseCode) {
        this.houseCode = houseCode;
    }

    public Double getFloorArea() {
        return floorArea;
    }

    public void setFloorArea(Double floorArea) {
        this.floorArea = floorArea;
    }

    public String getShopIds() {
        return shopIds;
    }

    public void setShopIds(String shopIds) {
        this.shopIds = shopIds;
    }

    public String getShopGoodsStatus() {
        return shopGoodsStatus;
    }

    public void setShopGoodsStatus(String shopGoodsStatus) {
        this.shopGoodsStatus = shopGoodsStatus;
    }
}
