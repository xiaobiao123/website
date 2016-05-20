package com.goujia.website.base.vo.question;

import com.goujia.website.base.vo.BaseSearchParam;

/**
 *  含义：答案搜索条件
 * @author  zhaoyonglian 15-6-3
 *
 */
public class QuestionAnswerSearchParam extends BaseSearchParam{
	private String isDeleted;		//是否废弃
	private String isEssence;		//是否加精
	private Integer userId;			//用户ID
	private Integer questionId;		//问题ID
	private String questionSubject; //问题标题
	
	public String getQuestionSubject() {
		return questionSubject;
	}
 	public void setQuestionSubject(String questionSubject) {
		this.questionSubject = questionSubject;
	}
	public String getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
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
	public Integer getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}
	
	
}
