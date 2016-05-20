package com.goujia.website.base.entity.orderlog;

import java.util.Date;

/**
 * 
 * @Description: 日志对应图片基础类
 * @author zhaoyonglian
 * @date 2015年8月6日 下午4:56:26
 * 
 */
public class OrderLogImage {
    private Integer id;             //主键id
    private String imagePath;       //图片地址
    private Integer logId;          //日志id
    private Date gmtCreate;         //创建时间
    private Date gmtModified;       //修改时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath == null ? null : imagePath.trim();
    }

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
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