package com.goujia.website.base.entity.comment;

import java.util.Date;

/**
 * 
 * @Description: 图片评论基础类
 * @author zhaoyonglian
 * @date 2015年8月6日 下午4:50:34
 * 
 */
public class ImageReview {
    private Integer id;         // 主键id
    private Integer imageId;    // 图片id
    private String content;     //评论内容
    private Integer userId;     //用户id
    private Date gmtCreate;     //评论时间
    private String isDeleted;   //是否删除 n:否 y:是
    private Date gmtModify;     //修改时间
    private String imagePath;   //图片路径

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted == null ? null : isDeleted.trim();
    }

    public Date getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    public String getImagePath() {
        return imagePath;
    }
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}