/**
 * Copyright 2014-2015 goujia.com
 * All rights reserved.
 * 
 */
package com.goujia.website.base.ges.entity;

import java.util.Date;

/**
 * 运营商
 * 
 * @author caoqi
 * @date 2014-06-12
 * 
 */
public class CityOperator {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 名称
     */
    private String contactName;

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 法人代表
     */
    private String legalName;

    /**
     * 运营商电话
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 省份ID
     */
    private Integer provinceId;

    /**
     * 城市ID
     */
    private Integer cityId;

    /**
     * 地址
     */
    private String address;

    /**
     * 开户银行
     */
    private String accountName;

    /**
     * 银行卡号
     */
    private String accountNum;

    /**
     * 星级
     */
    private Integer star;

    /**
     * 标注
     */
    private String remark;

    /**
     * 是否删除
     */
    private String isDeleted;

    /**
     * 项目质量
     */
    private Double projectQuality;

    /**
     * 客户满意度
     */
    private Double customSatisfied;

    /**
     * 是否急需
     */
    private String urgentNeed;

    /**
     * 状态
     */
    private String status;

    /**
     * 拥有者ID
     */
    private Integer ownerId;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;

    /**
     * 身份证号码
     */
    private String idCard;
    /**
     * 县级城市编号
     */
    private Integer countryId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Double getProjectQuality() {
        return projectQuality;
    }

    public void setProjectQuality(Double projectQuality) {
        this.projectQuality = projectQuality;
    }

    public Double getCustomSatisfied() {
        return customSatisfied;
    }

    public void setCustomSatisfied(Double customSatisfied) {
        this.customSatisfied = customSatisfied;
    }

    public String getUrgentNeed() {
        return urgentNeed;
    }

    public void setUrgentNeed(String urgentNeed) {
        this.urgentNeed = urgentNeed;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
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

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }
    
}