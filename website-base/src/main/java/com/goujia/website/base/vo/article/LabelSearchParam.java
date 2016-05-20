package com.goujia.website.base.vo.article;

import java.util.Date;

import com.goujia.website.base.entity.dict.Dictionary;
import com.goujia.website.base.vo.BaseSearchParam;


/**
 * Copyright 2014-2015 www.goujiawang.com
 * All rights reserved.
 * 
 * @project website-base
 * @author jiqijie
 * @version 2.0
 * @date 2015年6月4日
 */
public class LabelSearchParam extends BaseSearchParam{
	private Integer id;					//主键
    private String name;				//标签名称(NAME)
    private Dictionary peroperty;			//标签属性(PROPERTY)
    public Dictionary getPeroperty() {
		return peroperty;
	}

	public void setPeroperty(Dictionary peroperty) {
		this.peroperty = peroperty;
	}

	private Integer parentId;			//父标签ID(PARENT_ID)
    private Integer userdAmount;		//使用次数(USERD_AMOUNT)
    private Date gmtCreate;				//创建时间(GMT_CREATE)
    private String isDeleted;			//是否删除(IS_DELETED) n/y
    private Integer type;
   
    public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

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
