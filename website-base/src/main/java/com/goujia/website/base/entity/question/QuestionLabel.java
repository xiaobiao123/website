package com.goujia.website.base.entity.question;

public class QuestionLabel {
    private Integer id;             //主键id

    private Integer questionId;     //问题id

    private Integer labelId;        //标签id

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

    public Integer getLabelId() {
        return labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }
}