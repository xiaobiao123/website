package com.goujia.website.base.entity.rec;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class RecommendInfo {
	private Integer recId;					//推荐ID
	private Integer posId;					//推荐位ID
	private Integer infoId;					//推荐内容ID,可能是商品ID，也有可能是信息ID
	private String infoTitle;				//内容标题
	private String infoImage;				//图片地址
	private String infoStatus;				//发布状态
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date availableTime;				//生效时间
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date expireTime;				//失效时间
	private Date createTime;				//创建时间
	private String createUser;				//创建人名称
	private Integer sortOrder;				//排序值
	private String infoContent;				//推荐内容
	private String infoUrl;					//推荐信息访问地址

	public Integer getRecId() {
		return recId;
	}

	public void setRecId(Integer recId) {
		this.recId = recId;
	}

	public Integer getPosId() {
		return posId;
	}

	public void setPosId(Integer posId) {
		this.posId = posId;
	}

	public Integer getInfoId() {
		return infoId;
	}

	public void setInfoId(Integer infoId) {
		this.infoId = infoId;
	}

	public String getInfoTitle() {
		return infoTitle;
	}

	public void setInfoTitle(String infoTitle) {
		this.infoTitle = infoTitle == null ? null : infoTitle.trim();
	}

	public String getInfoImage() {
		return infoImage;
	}

	public void setInfoImage(String infoImage) {
		this.infoImage = infoImage == null ? null : infoImage.trim();
	}

	public String getInfoStatus() {
		return infoStatus;
	}

	public void setInfoStatus(String infoStatus) {
		this.infoStatus = infoStatus;
	}

	public Date getAvailableTime() {
	    if(null==availableTime){
	        availableTime = new Date();
	    }
		return availableTime;
	}

	public void setAvailableTime(Date availableTime) {
	    if(null==availableTime){
	        this.availableTime = new Date();
	    }else{
	        this.availableTime = availableTime;
	    }
	}

	public Date getExpireTime() {
	    if(null==expireTime){
	        expireTime=new Date();
	    }
		return expireTime;
	}

	public void setExpireTime(Date expireTime) {
	    if(null==expireTime){
	        this.expireTime=new Date();
	    }else{
	        this.expireTime = expireTime;
	    }
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser == null ? null : createUser.trim();
	}

	public Integer getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getInfoContent() {
		return infoContent;
	}

	public void setInfoContent(String infoContent) {
		this.infoContent = infoContent == null ? null : infoContent.trim();
	}

	public String getInfoUrl() {
		return infoUrl;
	}

	public void setInfoUrl(String infoUrl) {
		this.infoUrl = infoUrl;
	}
}