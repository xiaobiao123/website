package com.goujia.website.base.vo.topic;

import java.util.Date;

import com.goujia.website.base.entity.topic.TopicArticle;

public class TopicArticlePageVo extends TopicArticle{
     
	private String imagePath;			//图片地址(IMAGE_PATH)
	private String articleName;			//文章名
	private Integer userId;				//用户ID(USER_ID)包含前台和后台用户共同创建的文章
	private Integer shareNum;			//分享数量
	private Integer collectionNum;		//收藏数量
	private Date gmtCreate;				//创建时间(GMT_CREATE)
	private String introduction;		//文章简介
	private Integer loveNum;			//点赞人数(LOVE_NUM)
	private String headPortrait;        //QQ头像
	private Integer hitNum;				//点击量(HIT_NUM)
	private String labelIds;			//标签IDS(用','分隔)
    private String craftLabels;         //工艺标签
	private String materialLabels;      //材料标签
	private String styleLabels;         //风格标签
	private String categoryNames;		//分类标签名字字符串
	private String craftNames;			//工艺标签名字字符串
	private String materialNames;		//材料标签名字字符串
	private String styleNames;			//风格标签名字字符串
	
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getArticleName() {
		return articleName;
	}
	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
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
	public Date getGmtCreate() {
		return gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public Integer getLoveNum() {
		return loveNum;
	}
	public void setLoveNum(Integer loveNum) {
		this.loveNum = loveNum;
	}
	public String getHeadPortrait() {
		return headPortrait;
	}
	public void setHeadPortrait(String headPortrait) {
		this.headPortrait = headPortrait;
	}
	public Integer getHitNum() {
		return hitNum;
	}
	public void setHitNum(Integer hitNum) {
		this.hitNum = hitNum;
	}
	public String getLabelIds() {
		return labelIds;
	}
	public void setLabelIds(String labelIds) {
		this.labelIds = labelIds;
	}
	public String getCraftLabels() {
		return craftLabels;
	}
	public void setCraftLabels(String craftLabels) {
		this.craftLabels = craftLabels;
	}
	public String getMaterialLabels() {
		return materialLabels;
	}
	public void setMaterialLabels(String materialLabels) {
		this.materialLabels = materialLabels;
	}
	public String getStyleLabels() {
		return styleLabels;
	}
	public void setStyleLabels(String styleLabels) {
		this.styleLabels = styleLabels;
	}
	public String getCategoryNames() {
		return categoryNames;
	}
	public void setCategoryNames(String categoryNames) {
		this.categoryNames = categoryNames;
	}
	public String getCraftNames() {
		return craftNames;
	}
	public void setCraftNames(String craftNames) {
		this.craftNames = craftNames;
	}
	public String getMaterialNames() {
		return materialNames;
	}
	public void setMaterialNames(String materialNames) {
		this.materialNames = materialNames;
	}
	public String getStyleNames() {
		return styleNames;
	}
	public void setStyleNames(String styleNames) {
		this.styleNames = styleNames;
	}
	
	
}
