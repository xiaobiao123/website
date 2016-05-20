package com.goujia.website.base.entity.article;

import java.util.Date;

public class Article {
	private Integer id;					//主键
	private String imagePath;			//图片地址(IMAGE_PATH)
	private String articleName;			//文章名
	private Integer userId;				//用户ID(USER_ID)包含前台和后台用户共同创建的文章
	private String userType;			//用户类型(member:会员;admin:管理员)
	private Integer hitNum=0;				//点击量(HIT_NUM)
	private Integer reportNumber=0;		//举报次数(REPORT_NUMBER)
	private Integer loveNum=0;			//点赞人数(LOVE_NUM)
	private Integer shareNum=0;			//分享数量
	private Integer collectionNum=0;		//收藏数量
	private String isEssence;			//是否加精 n/y
	private String isTop;				//置顶 n/y
	private Date gmtCreate;				//创建时间(GMT_CREATE)
	private Date gmtModified;			//修改时间(GMT_MODIFIED)
	private String isDeleted;			//是否删除 n/y
	private String content;				//文章内容
	private String introduction;		//文章简介
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath == null ? null : imagePath.trim();
	}

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName == null ? null : articleName.trim();
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType == null ? null : userType.trim();
	}

	public Integer getHitNum() {
		return hitNum;
	}

	public void setHitNum(Integer hitNum) {
		this.hitNum = hitNum;
	}

	public Integer getReportNumber() {
		return reportNumber;
	}

	public void setReportNumber(Integer reportNumber) {
		this.reportNumber = reportNumber;
	}

	public Integer getLoveNum() {
		return loveNum;
	}

	public void setLoveNum(Integer loveNum) {
		this.loveNum = loveNum;
	}

	public Integer getShareNum() {
		return shareNum;
	}

	public void setShareNum(Integer shareNum) {
		this.shareNum = shareNum;
	}

	public Integer getCollectionNum() {
		return collectionNum;
	}

	public void setCollectionNum(Integer collectionNum) {
		this.collectionNum = collectionNum;
	}

	public String getIsEssence() {
		return isEssence;
	}

	public void setIsEssence(String isEssence) {
		this.isEssence = isEssence == null ? null : isEssence.trim();
	}

	public String getIsTop() {
		return isTop;
	}

	public void setIsTop(String isTop) {
		this.isTop = isTop == null ? null : isTop.trim();
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

	public String getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted == null ? null : isDeleted.trim();
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
}