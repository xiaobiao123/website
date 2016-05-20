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

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 产品包 实例 Entity
 * 
 * @author jipengfei
 * 
 */
public class Goods implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 产品包名称
     */
    private String name;

    /**
     * 风格ID
     */
    private Integer styleId = 0;

    /**
     * 风格名称
     */
    private String styleName;

    /**
     * 房屋ID
     */
    private Integer houseId;

    /**
     * 户型ID
     */
    private Integer houseTypeId = 0;

    /**
     * 户型名称
     */
    private String houseTypeName;

    /**
     * 是否推荐
     */
    private String isRecommend;

    /**
     * 图片路径
     */
    private String photoPath;

    /**
     * 平面设计图
     */
    private String floorPlanPath;

    /**
     * 原价
     */
    private BigDecimal originalPrice;

    /**
     * 折扣价
     */
    private BigDecimal discountPrice;

    /**
     * 简介
     */
    private String summary;

    /**
     * 状态 'designing'|'published'|'deleted' '设计中'|'就绪'|'已删除'
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

    /**
     * 销售文件保存地址
     */
    private String salesFilePath;

    /**
     * 效果图压缩包路径
     */
    private String effectFilePath;

    /**
     * 效果图路径
     */
    private String effectPath;

    /**
     * 是否为爆款
     */
    private String isPromotion;

    /**
     * 爆款的均价
     */
    private Double averagePrice;

    /**
     * 产品类型  整装产品包：z,软装包:r 阳台景观包 :y
     */
    private String goodsType;

    /**
     * 可否DIY
     */
    private String canDiy;
    /**
     *  0|1|2 产品包|标准DIY方案|用户DIY方案
     */
    private Integer isDiy;
    
    public String getCanDiy() {
        return canDiy;
    }

    public void setCanDiy(String canDiy) {
        this.canDiy = canDiy;
    }

    public Integer getIsDiy() {
        return isDiy;
    }

    public void setIsDiy(Integer isDiy) {
        this.isDiy = isDiy;
    }

    public String getIsPromotion() {
        return isPromotion;
    }

    public void setIsPromotion(String isPromotion) {
        this.isPromotion = isPromotion;
    }

    public Double getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(Double averagePrice) {
        this.averagePrice = averagePrice;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStyleId() {
        return styleId;
    }

    public void setStyleId(Integer styleId) {
        this.styleId = styleId;
    }

    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public String getFloorPlanPath() {
        return floorPlanPath;
    }

    public void setFloorPlanPath(String floorPlanPath) {
        this.floorPlanPath = floorPlanPath;
    }

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
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

    public Integer getHouseTypeId() {
        return houseTypeId;
    }

    public void setHouseTypeId(Integer houseTypeId) {
        this.houseTypeId = houseTypeId;
    }

    public String getHouseTypeName() {
        return houseTypeName;
    }

    public void setHouseTypeName(String houseTypeName) {
        this.houseTypeName = houseTypeName;
    }

    public String getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(String isRecommend) {
        this.isRecommend = isRecommend;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getSalesFilePath() {
        return salesFilePath;
    }

    public void setSalesFilePath(String salesFilePath) {
        this.salesFilePath = salesFilePath;
    }

    public String getEffectFilePath() {
        return effectFilePath;
    }

    public void setEffectFilePath(String effectFilePath) {
        this.effectFilePath = effectFilePath;
    }

    public String getEffectPath() {
        return effectPath;
    }

    public void setEffectPath(String effectPath) {
        this.effectPath = effectPath;
    }
}
