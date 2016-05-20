package com.goujia.website.base.entity.shop;

import java.io.Serializable;
import java.util.Date;

/**
 * 4S店
 * 
 *
 */
public class Shop implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 主键ID
	 */
	private Integer id;
	
	/**
	 * 运营商ID
	 */
	private Integer operatorId;
	
	/**
	 * 4S店名称
	 */
	private String name;
	
	/**
	 * 图片路径
	 */
	private String photoPath;
	
	/**
	 * 类型
	 */
	private String shopType;
	
	/**
	 * Banner路径
	 */
	private String bannerPath;
	
	/**
	 * 4S店简介
	 */
	private String summary;

	/**
	 * 4S店联系人
	 */
	private String contactName;

	/**
	 * 联系电话
	 */
	private String phone;

	/**
	 * 4S店联系地址
	 * 回填'省市县'+街道信息
	 */
	private String address;

	/**
	 * 成立时间
	 */
	private Date foundDate;
	
	/**
	 * 4S店经度坐标
	 */
	private Double longitude;
	
	/**
	 * 4S维度坐标
	 */
	private Double latitude;

	/**
	 * 省份ID
	 * G_AREA_RESOURCE.ID
	 */
	private Integer provinceId;
	
	/**
	 * 市ID
	 * G_AREA_RESOURCE.ID
	 */
	private Integer cityId;

	/**
	 * 区县ID
	 * G_AREA_RESOURCE.ID
	 */
	private Integer countyId;

	/**
	 * 是否删除
	 */
	private String isDeleted;

	/**
	 * 创建时间
	 */
	private Date gmtCreate;

	/**
	 * 创建人
	 */
	private Integer ownerId;

	/**
	 * 修改时间
	 */
	private Date gmtModified;
	
	/**
	 * 状态
	 */
	private String status;
	
	/**
	 * 工程督导评分
	 */
	private Double projectQuality;
	
	/**
	 * 客服部评分
	 */
	private Double customStatisfied;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getProjectQuality() {
		return projectQuality;
	}

	public void setProjectQuality(Double projectQuality) {
		this.projectQuality = projectQuality;
	}

	public Double getCustomStatisfied() {
		return customStatisfied;
	}

	public void setCustomStatisfied(Double customStatisfied) {
		this.customStatisfied = customStatisfied;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(Integer operatorId) {
		this.operatorId = operatorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhotoPath() {
		return photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}
	
	public String getShopType() {
		return shopType;
	}

	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

	public String getBannerPath() {
		return bannerPath;
	}

	public void setBannerPath(String bannerPath) {
		this.bannerPath = bannerPath;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getFoundDate() {
		return foundDate;
	}

	public void setFoundDate(Date foundDate) {
		this.foundDate = foundDate;
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

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}
}
