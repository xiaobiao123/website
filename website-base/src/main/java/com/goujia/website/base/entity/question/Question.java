package com.goujia.website.base.entity.question;

import java.util.Date;

public class Question {
	private Integer id;						//主键
	private String subject;					//问题标题
	private String description;				//问题描述
	private String questionCategory;		//问题类型： 装修常识:RenovationCommonsense 施工规范:ConstructionSpecifications 材料购选:Materialpurchaseooption 
	private String label;					//标签IDS(用,分隔)
	private String state;   				//问题状态(STATE) 等待解答:WaitingForAnswer 已确认:Confirmed
	private Integer anwserAmount;			//答案数量(ANWSER_AMOUNT)
	private Integer hitNum;					//点击量(CLICK_TRAFFIC)
	private Integer shareNum;				//分享数量(预留)
	private Integer collectionNum;			//收藏数量(COLLECTION_NUM)
	private String isEssence;				//是否加精 n/y
	private String isTop;					//置顶(IS_TOP) n/y
	private Integer userId;					//创建人(USER_ID)
	protected Date gmtCreate;					//创建时间(GMT_CREATE)
	protected Date gmtModified;				//修改时间(GMT_MODIFIED)
	private String isDeleted;				//是否删除(IS_DELETED) n/y
	private String labelName;				//标签名字字符串
	
	public String getLabelName() {
		return labelName;
	}

	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject == null ? null : subject.trim();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	public String getQuestionCategory() {
		return questionCategory;
	}

	public void setQuestionCategory(String questionCategory) {
		this.questionCategory = questionCategory == null ? null
				: questionCategory.trim();
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label == null ? null : label.trim();
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state == null ? null : state.trim();
	}

	public Integer getAnwserAmount() {
		return anwserAmount;
	}

	public void setAnwserAmount(Integer anwserAmount) {
		this.anwserAmount = anwserAmount;
	}

	public Integer getHitNum() {
		return hitNum;
	}

	public void setHitNum(Integer hitNum) {
		this.hitNum = hitNum;
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

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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
}