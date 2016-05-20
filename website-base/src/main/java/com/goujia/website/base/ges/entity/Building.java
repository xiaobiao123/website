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
 * 楼盘
 * 
 * @author caoqi
 * @date 2014-06-12
 *
 */
public class Building {
	/**
	 * 主键ID
	 */
	private Integer id;
	
	/**
	 * 楼盘名称
	 */
	private String name;

	/**
	 * 开发商名称
	 */
	private String developer;

	/**
	 * 图片路径
	 */
	private String photoPath;

	/**
	 * 楼盘简介
	 */
	private String summary;
	
	/**
	 * 联系人
	 */
	private String contactName;
	
	/**
	 * 联系电话
	 */
	private String phone;
	
	/**
	 * 楼盘所在地址
	 */
	private String address;
	
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
	 * G_AREA.ID
	 */
	private Integer provinceId;

	/**
	 * 市ID
	 * G_AREA.ID
	 */
	private Integer cityId;

	/**
	 * 区县ID
	 * G_AREA.ID
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
	 * 拥有者
	 */
	private Integer ownerId;

	/**
	 * 修改时间
	 */
	private Date gmtModified;

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

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public Integer getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}

	public Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getPhotoPath() {
		return photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
}
