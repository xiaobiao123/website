package com.goujia.website.base.entity.topic;

public class TopicLabel {
    private Integer id;

    private Integer topicId;

    private Integer labelId;
    
    private String name;
    
    
    /** 
     * @return name 
     */
    
    public String getName() {
        return name;
    }

    /** 
     * @param name 要设置的 name 
     */
    
    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public Integer getLabelId() {
        return labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }
}