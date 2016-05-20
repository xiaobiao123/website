/**
 * Copyright 2014-2015 goujia.com
 * All rights reserved.
 * 
 * @project
 * @author jipengfei
 * @version 1.0
 * @date 2014-06-12
 */
package com.goujia.website.base.ges.entity;

import java.util.Date;

/**
 * 产品包房间图片 实例 Entity
 * 
 * @author jipengfei
 * 
 */
public class GoodsRoom {
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 产品包ID
     */
    private Integer goodsId;

    /**
     * 图片名称
     */
    private String name;

    /**
     * 2D图片地址
     */
    private String photo2DPath;

    /**
     * 3D图片地址
     */
    private String photo3DPath;

    /**
     * 摘要
     */
    private String summary;

    /**
     * 顺序
     */
    private Integer orderIndex;

    /**
     * 是否删除
     */
    private String isDeleted;

    /**
     * 创建人
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;

    /**
     * 创建人
     */
    private Integer ownerId;
    
    /**
     * 效果图路径
     */
    private String effectPath;
    
    /**
     * 效果图宽度
     * 
     */
    private Integer effectWidth;
    
    /**
     * 效果图高度
     * 
     */
    private Integer effectHeight;
    
    /**
     * 房间属性
     */
    private Integer roomAttribute;
    
    /**
     * 标准DIY方案房间ID
     */
    private Integer rootRoomId;
    
    /**
     * 是否可以diy
     */
    private String canDiy;
    
    public String getCanDiy() {
        return canDiy;
    }

    public void setCanDiy(String canDiy) {
        this.canDiy = canDiy;
    }

    public String getEffectPath() {
        return effectPath;
    }

    public void setEffectPath(String effectPath) {
        this.effectPath = effectPath;
    }

    public Integer getEffectWidth() {
        return effectWidth;
    }

    public void setEffectWidth(Integer effectWidth) {
        this.effectWidth = effectWidth;
    }

    public Integer getEffectHeight() {
        return effectHeight;
    }

    public void setEffectHeight(Integer effectHeight) {
        this.effectHeight = effectHeight;
    }

    public Integer getRootRoomId() {
        return rootRoomId;
    }

    public void setRootRoomId(Integer rootRoomId) {
        this.rootRoomId = rootRoomId;
    }

    public Integer getRoomAttribute() {
        return roomAttribute;
    }

    public void setRoomAttribute(Integer roomAttribute) {
        this.roomAttribute = roomAttribute;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto2DPath() {
        return photo2DPath;
    }

    public void setPhoto2DPath(String photo2dPath) {
        photo2DPath = photo2dPath;
    }

    public String getPhoto3DPath() {
        return photo3DPath;
    }

    public void setPhoto3DPath(String photo3dPath) {
        photo3DPath = photo3dPath;
    }

    public Integer getOrderIndex() {
        return orderIndex;
    }

    public void setOrderIndex(Integer orderIndex) {
        this.orderIndex = orderIndex;
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

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }
}
