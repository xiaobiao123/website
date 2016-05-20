package com.goujia.website.base.vo.question;

import java.util.Date;
import java.util.List;

import com.goujia.website.base.entity.article.Label;
import com.goujia.website.base.entity.question.Question;
import com.goujia.website.base.utils.DateUtil;

/**
 * 含义：问题VO层数据存储及展示
 * 
 * @author zhaoyonglian 15-6-3
 * 
 */
public class QuestionVO extends Question {
    private String createTime; // 创建时间字符串
    private String editTime; // 修改时间字符串
    private List<QuestionAnswerVO> answers; // 答案列表
    private String userName; // 问题的提问者
    private String headImage; // 提问者头像
    private List<Label> labels;
    private QuestionAnswerVO bestAnswer;

    public QuestionAnswerVO getBestAnswer() {
		return bestAnswer;
	}

	public void setBestAnswer(QuestionAnswerVO bestAnswer) {
		this.bestAnswer = bestAnswer;
	}

	public List<Label> getLabels() {
		return labels;
	}

	public void setLabels(List<Label> labels) {
		this.labels = labels;
	}

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

    public List<QuestionAnswerVO> getAnswers() {
        return answers;
    }

    public void setAnswers(List<QuestionAnswerVO> answers) {
        this.answers = answers;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setEditTime(String editTime) {
        this.editTime = editTime;
    }

    public String getCreateTime() {
        return createTime;
    }

    public String getEditTime() {
        return editTime;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
        this.createTime = DateUtil.formatYYYYMMDD(gmtCreate);
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
        this.editTime = DateUtil.formatYYYYMMDD(gmtModified);
    }

}
