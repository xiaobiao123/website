package com.goujia.website.base.entity.membercollection;

import java.util.Date;

public class MemberCollection {
    private Integer id;					//主键
    private Integer userId;				//用户ID
    private String propertyType;		//收藏类型   产品包：100601 专题:100605 话题:100606 文章:100603 图片:100602  方案100604
    private Integer collectionContentId;//收藏内容ID
    private Date gmtCreate;				//创建时间
    private Date gmtModified;			//修改时间
    private String isDeleted;           //是否删除
    private String name;                //收藏对应的名称
    private String image;               //收藏对应的图片
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType=propertyType;
    }

    public Integer getCollectionContentId() {
        return collectionContentId;
    }

    public void setCollectionContentId(Integer collectionContentId) {
        this.collectionContentId = collectionContentId;
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

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }
    
}