package com.goujia.website.base.entity.specialtopic;

public class SpecialTopicLabel {
    private Integer id;                 //主键id

    private Integer specialTopicId;     //专题id

    private Integer labelId;            //标签id

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSpecialTopicId() {
        return specialTopicId;
    }

    public void setSpecialTopicId(Integer specialTopicId) {
        this.specialTopicId = specialTopicId;
    }

    public Integer getLabelId() {
        return labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }
}