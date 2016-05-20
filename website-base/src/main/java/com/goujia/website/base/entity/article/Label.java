package com.goujia.website.base.entity.article;

import java.util.Date;

import com.goujia.website.base.entity.dict.Dictionary;

public class Label {
    private Integer id;					//主键
    private String name;				//标签名称(NAME)
    private Dictionary peroperty;			//标签属性(PROPERTY)
    private Integer parentId;			//父标签ID(PARENT_ID)
    private Integer userdAmount;		//使用次数(USERD_AMOUNT)
    private Date gmtCreate;				//创建时间(GMT_CREATE)
    private String isDeleted;			//是否删除(IS_DELETED) n/y
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Dictionary getPeroperty() {
        return peroperty;
    }

    public void setPeroperty(Dictionary peroperty) {
        this.peroperty = peroperty;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getUserdAmount() {
        return userdAmount;
    }

    public void setUserdAmount(Integer userdAmount) {
        this.userdAmount = userdAmount;
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
}