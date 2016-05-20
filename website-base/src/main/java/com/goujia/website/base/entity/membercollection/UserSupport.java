package com.goujia.website.base.entity.membercollection;

import java.util.Date;

public class UserSupport {
    private Integer id;                         //主键

    private Integer userId;                     //用户ID

    private String propertyType;                //点赞类型  产品包点赞:100501 专题点赞:100505 话题点赞:100506 文章点赞:100503 图片点赞:100502，方案点赞：100504

    private Integer infoId;                     //信息id

    private Date gmtCreate;                     //创建时间

    private Date gmtModified;                   //修改时间
    
    private String isDeleted;                    //是否删除
    
    private String name;                        //赞对应的名称
    private String image;                       //赞对应的图片

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
        this.propertyType = propertyType ;
    }

    public Integer getInfoId() {
        return infoId;
    }

    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
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