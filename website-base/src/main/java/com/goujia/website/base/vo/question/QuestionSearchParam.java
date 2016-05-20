package com.goujia.website.base.vo.question;

import com.goujia.website.base.vo.BaseSearchParam;

/**
 *  含义：问题搜索类
 * @author  zhaoyonglian 15-6-3
 *
 */
public class QuestionSearchParam extends BaseSearchParam{
	private String subject;					//标题
	private String questionCategory;		//问题类型
	private String state;   				//问题状态(STATE) 等待解答:WaitingForAnswer 已确认:Confirmed
	private String isEssence;				//是否加精 n/y
	private Integer userId;					//创建人(USER_ID)
	private String isDeleted;				//是否删除(IS_DELETED) n/y
	
	public String getQuestionCategory() {
		return questionCategory;
	}

	public void setQuestionCategory(String questionCategory) {
		this.questionCategory = questionCategory;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getIsEssence() {
		return isEssence;
	}

	public void setIsEssence(String isEssence) {
		this.isEssence = isEssence;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}
