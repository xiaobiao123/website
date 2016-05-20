package com.goujia.website.base.entity.orderlog;

import java.util.Date;
import java.util.List;

public class OrderLog {
    private Integer id;             //主键id

    private Integer orderId;        //订单id

    private String content;         //日志内容

    private Integer labelId;        //标签id

    private Date gmtCreate;         //创建时间

    private Date gmtModified;       //修改时间
    
    private String labelName;       //标签名称（状态）
    
    private List<String> imageList; //图片地址字符串
    
    private String relationBuilder; //施工人员

    public String getRelationBuilder() {
        return relationBuilder;
    }

    public void setRelationBuilder(String relationBuilder) {
        this.relationBuilder = relationBuilder;
    }

    public List<String> getImageList() {
        return imageList;
    }

    public void setImageList(List<String> imageList) {
        this.imageList = imageList;
    }

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

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getLabelId() {
        return labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
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
}