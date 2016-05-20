package com.goujia.website.base.entity.question;

import java.util.Date;

public class QuestionAnswer {
	private Integer id;   				//主键(ID)
	private Integer questionId;			//问题ID(QUESTION_ID)
	private Integer userId;				//用户ID(USER_ID)
	private String userType;			//用户分类(客户:member 管理员:admin)
	private String content;				//答案内容(CONTENT)
	private String isEssence;			//是否加精 n/y
	private Date gmtCreate;				//创建时间
	private Date gmtModified;			//修改时间
	private String isDeleted;			//是否删除(IS_DELETED) y/n
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getIsEssence() {
		return isEssence;
	}

	public void setIsEssence(String isEssence) {
		this.isEssence = isEssence == null ? null : isEssence.trim();
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