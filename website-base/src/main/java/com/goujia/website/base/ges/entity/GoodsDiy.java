/**
 * Copyright 2014-2015 goujia.com
 * All rights reserved.
 * 
 * @project
 * @author guojianbin
 * @version 3.0
 * @date 2015-09-17
 */
package com.goujia.website.base.ges.entity;

import java.util.Date;

/**
 * DIY方案实体
 * @author guojianbin
 *
 */
public class GoodsDiy {

	/**
	 * 主键ID
	 */
    private Integer id;

	/**
	 * DIY方案的ID
	 */
    private Integer diyId;

	/**
	 * DIY方案的关联产品包的ID
	 */
    private Integer relationGoodsId;

	/**
	 * DIY方案的关联DIY方案的ID
	 */
    private Integer relationDiyId;

	/**
	 * 创建者ID
	 */
    private Integer creatorId;

	/**
	 * 创建者类型 , 0|1 业主|管理员
	 */
    private Integer creatorType;

	/**
	 * 创建时间
	 */
    private Date gmtCreate;

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

    public Integer getDiyId() {
        return diyId;
    }

    public void setDiyId(Integer diyId) {
        this.diyId = diyId;
    }

    public Integer getRelationGoodsId() {
        return relationGoodsId;
    }

    public void setRelationGoodsId(Integer relationGoodsId) {
        this.relationGoodsId = relationGoodsId;
    }

    public Integer getRelationDiyId() {
        return relationDiyId;
    }

    public void setRelationDiyId(Integer relationDiyId) {
        this.relationDiyId = relationDiyId;
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public Integer getCreatorType() {
        return creatorType;
    }

    public void setCreatorType(Integer creatorType) {
        this.creatorType = creatorType;
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