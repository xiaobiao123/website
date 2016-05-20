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
 * 物料类目 实例 Entity
 * 
 * @author jipengfei
 *
 */
public class MaterialsCategory {
	/**
	 * 主键ID
	 */
	private Integer id;
	
	/**
	 * 类目名称
	 */
	private String name;

    /**
     * 分类编码
     */
    private String code;

	/**
	 * 所属父类型 ，一级分类默认为0
	 */
	private Integer parentId;
	
	/**
	 * 是否删除 'y'|'n' '是'|'否' 
	 */
	private String isDeleted;
	
	/**
	 * 创建时间
	 */
	private Date gmtCreate;
	
	/**
	 * 修改时间
	 */
	private Date gmtModified;

	/**
	 * 拥有者
	 */
	private Integer ownerId;
	
	/**
	 * 是否加入对比
	 */
	private String isCompared;

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
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
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

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

	public String getIsCompared() {
		return isCompared;
	}

	public void setIsCompared(String isCompared) {
		this.isCompared = isCompared;
	}
}
