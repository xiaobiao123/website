package com.goujia.website.base.ges.entity;

import java.util.Date;

public class Customer {
    private Integer id;

    private String name;

    private String accountId;

    private String accountType;

    private String gender;

    private Integer age;

    private String phone;

    private String email;

    private String buildingName;

    private Integer province;

    private Integer city;

    private String address;

    private String company;

    private String idNo;

    private String remark;

    private String isDeleted;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer ownerId;

    private Integer jobType;

    private Double idealPrice;

    private Integer customerFocus;

    private Integer industryUnderstandingLevel;

    private Date expectedDecorationDate;

    private Integer livingCondition;

    private String expectedDecorationStyle;

    private Integer operatorId;

    private Integer shopId;

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
        this.name = name == null ? null : name.trim();
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType == null ? null : accountType.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName == null ? null : buildingName.trim();
    }

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo == null ? null : idNo.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted == null ? null : isDeleted.trim();
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

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Integer getJobType() {
        return jobType;
    }

    public void setJobType(Integer jobType) {
        this.jobType = jobType;
    }

    public Double getIdealPrice() {
        return idealPrice;
    }

    public void setIdealPrice(Double idealPrice) {
        this.idealPrice = idealPrice;
    }

    public Integer getCustomerFocus() {
        return customerFocus;
    }

    public void setCustomerFocus(Integer customerFocus) {
        this.customerFocus = customerFocus;
    }

    public Integer getIndustryUnderstandingLevel() {
        return industryUnderstandingLevel;
    }

    public void setIndustryUnderstandingLevel(Integer industryUnderstandingLevel) {
        this.industryUnderstandingLevel = industryUnderstandingLevel;
    }

    public Date getExpectedDecorationDate() {
        return expectedDecorationDate;
    }

    public void setExpectedDecorationDate(Date expectedDecorationDate) {
        this.expectedDecorationDate = expectedDecorationDate;
    }

    public Integer getLivingCondition() {
        return livingCondition;
    }

    public void setLivingCondition(Integer livingCondition) {
        this.livingCondition = livingCondition;
    }

    public String getExpectedDecorationStyle() {
        return expectedDecorationStyle;
    }

    public void setExpectedDecorationStyle(String expectedDecorationStyle) {
        this.expectedDecorationStyle = expectedDecorationStyle == null ? null : expectedDecorationStyle.trim();
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }
}