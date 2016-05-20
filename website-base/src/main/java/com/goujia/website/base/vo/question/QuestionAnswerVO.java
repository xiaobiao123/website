package com.goujia.website.base.vo.question;

import com.goujia.website.base.entity.question.QuestionAnswer;

/**
 * 含义：问题答案VO存储及展示
 * 
 * @author zhaoyonglian 15-6-3
 * 
 */
public class QuestionAnswerVO extends QuestionAnswer {
	private String questionSubject; 	// 问题标题
	private String userName;			//回答问题人的名字
	private String headImage;			//回答者头像

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getHeadImage() {
		return headImage;
	}

	public void setHeadImage(String headImage) {
		this.headImage = headImage;
	}

	public String getQuestionSubject() {
		return questionSubject;
	}

	public void setQuestionSubject(String questionSubject) {
		this.questionSubject = questionSubject;
	}
	
}
