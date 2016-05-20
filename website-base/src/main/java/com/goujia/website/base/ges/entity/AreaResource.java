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

import java.io.Serializable;
import java.util.Date;

/**
 * 地区资源 实例 Entity
 * 
 * @author jipengfei
 * 
 */
public class AreaResource implements Serializable{
	/**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
	 * 主键ID
	 */
	private Integer id;

	/**
	 * 地址名称
	 */
	private String name;

	/**
	 * 排序
	 */
	private Integer orderIndex;

	/**
	 * 所属父节点，一级分类默认为 0
	 */
	private Integer parentId;

	/**
	 * 是否城市
	 */
	private String isCity;

	/**
	 * 是否添加
	 */
	private String isAdd;
	
	/**
	 * 记录添加时间
	 */
	private Date gmtAdd;
	
	/**
	 * 创建时间
	 */
	private Date gmtCreate;
	/**
	 * 是否标记
	 */
	private Integer is_enabel;
	
	private String spell;
	
	
	public Integer getIs_enabel() {
        return is_enabel;
    }

    public void setIs_enabel(Integer is_enabel) {
        this.is_enabel = is_enabel;
    }

    /**
	 * 修改时间
	 */
	private Date gmtModified;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	public Integer getOrderIndex() {
		return orderIndex;
	}

	public void setOrderIndex(Integer orderIndex) {
		this.orderIndex = orderIndex;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getIsCity() {
		return isCity;
	}

	public void setIsCity(String isCity) {
		this.isCity = isCity;
	}

	public String getIsAdd() {
		return isAdd;
	}

	public void setIsAdd(String isAdd) {
		this.isAdd = isAdd;
	}

	public Date getGmtAdd() {
		return gmtAdd;
	}

	public void setGmtAdd(Date gmtAdd) {
		this.gmtAdd = gmtAdd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }
	
}
