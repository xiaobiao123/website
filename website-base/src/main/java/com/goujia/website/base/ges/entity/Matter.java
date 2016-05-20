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

import java.util.Date;

/**
 * 物料 实例 Entity
 * 
 * @author jipengfei
 * 
 */
public class Matter {

    /**
     * 主键 ID
     */
    private Integer id;

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
     * 市场标价
     */
    private Double pric;

    /**
     * 市场销售价
     */
    private Double salesPrice;

    /**
     * 图片地址
     */
    private String imagePath;

    /**
     * 品牌ID
     */
    private Integer brandId;

    /**
     * 类目ID
     */
    private Integer categoryId;

    /**
     * 拥有者ID
     */
    private Integer ownerId;

    /**
     * 备注
     */
    private String memo;

    /**
     * 是否删除
     */
    private String isDeleted;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;

    /**
     * 使用性质（大宗、零星、辅助）
     */
    private Integer useNature;

    /**
     * 加工性质
     */
    private Integer processProp;

    /**
     * 配送阶段
     */
    private Integer distributionPhase;

    /**
     * 配送方式
     */
    private Integer shippingMethods;

    /**
     * 加工方式
     */
    private Integer processingMethods;

    /**
     * 转化单位
     */
    private Integer conversionUnit;

    /**
     * 转化单位
     */
    private String conversionFormula;

    /**
     * 安装方
     */
    private Integer installer;
    /**
     * 是否是备库存的物料
     */
    private String isHaveInventory;
    /**
     * 收货地址类型 1 运营商 2 工地'
     */
    private Integer takeAddressType;

    /**
     * 构家网价格
     */
    private Double goujiaPrice;

    private Integer amount;
    /**
     * 构家采购价格
     */
    private Double buyPrice;

    /**
     * 效果图路径
     */
    private String effectPath;
    
    /**
     * 效果图宽度
     * 
     */
    private Integer effectWidth;
    
    /**
     * 效果图高度
     * 
     */
    private Integer effectHeight;
    
    public Integer getEffectWidth() {
        return effectWidth;
    }

    public void setEffectWidth(Integer effectWidth) {
        this.effectWidth = effectWidth;
    }

    public Integer getEffectHeight() {
        return effectHeight;
    }

    public void setEffectHeight(Integer effectHeight) {
        this.effectHeight = effectHeight;
    }

    public String getEffectPath() {
        return effectPath;
    }

    public void setEffectPath(String effectPath) {
        this.effectPath = effectPath;
    }

    public Double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getIsHaveInventory() {
        return isHaveInventory;
    }

    public void setIsHaveInventory(String isHaveInventory) {
        this.isHaveInventory = isHaveInventory;
    }

    public Integer getTakeAddressType() {
        return takeAddressType;
    }

    public void setTakeAddressType(Integer takeAddressType) {
        this.takeAddressType = takeAddressType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Double getPric() {
        return pric;
    }

    public void setPric(Double pric) {
        this.pric = pric;
    }

    public Double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(Double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
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

    public Integer getUseNature() {
        return useNature;
    }

    public void setUseNature(Integer useNature) {
        this.useNature = useNature;
    }

    public Integer getProcessProp() {
        return processProp;
    }

    public void setProcessProp(Integer processProp) {
        this.processProp = processProp;
    }

    public Integer getDistributionPhase() {
        return distributionPhase;
    }

    public void setDistributionPhase(Integer distributionPhase) {
        this.distributionPhase = distributionPhase;
    }

    public Integer getShippingMethods() {
        return shippingMethods;
    }

    public void setShippingMethods(Integer shippingMethods) {
        this.shippingMethods = shippingMethods;
    }

    public Integer getProcessingMethods() {
        return processingMethods;
    }

    public void setProcessingMethods(Integer processingMethods) {
        this.processingMethods = processingMethods;
    }

    public Integer getConversionUnit() {
        return conversionUnit;
    }

    public void setConversionUnit(Integer conversionUnit) {
        this.conversionUnit = conversionUnit;
    }

    public String getConversionFormula() {
        return conversionFormula;
    }

    public void setConversionFormula(String conversionFormula) {
        this.conversionFormula = conversionFormula;
    }

    public Integer getInstaller() {
        return installer;
    }

    public void setInstaller(Integer installer) {
        this.installer = installer;
    }

    public Double getGoujiaPrice() {
        return goujiaPrice;
    }

    public void setGoujiaPrice(Double goujiaPrice) {
        this.goujiaPrice = goujiaPrice;
    }
}