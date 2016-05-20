package com.goujia.website.base.entity.system;

import java.util.Date;

public class Enter {
    private Integer id;                    //id

    private String company;                //公司名称

    private String province;               //省

    private Date gmtCreate;                //创建时间

    private String isDeleted;              //是否删除

    private Date gmtModify;                //修改时间

    private Integer enterType;             //入驻类型 100701：供应商入驻   100702：城运商入驻 100703：4S店入驻

    private String city;                   //城市

    private String linkman;                //联系人

    private String address;                //详细地址

    private String phone;                  //手机号码

    private String memo;                   //其他补充信息

    private String brand;                  //品牌

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted == null ? null : isDeleted.trim();
    }

    public Date getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    public Integer getEnterType() {
        return enterType;
    }

    public void setEnterType(Integer enterType) {
        this.enterType = enterType;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo.contains("undefined") ? null : memo.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand.contains("undefined") ? null : brand.trim();
    }
}