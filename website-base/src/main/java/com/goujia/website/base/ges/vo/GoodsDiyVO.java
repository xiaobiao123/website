/**
 * Copyright 2014-2015 goujia.com
 * All rights reserved.
 * 
 * @project
 * @author guojianbin
 * @version 3.0
 * @date 2015-09-18
 */
package com.goujia.website.base.ges.vo;

import java.util.Date;
import java.util.List;

import com.goujia.website.base.ges.entity.Goods;
import com.goujia.website.base.ges.entity.Shop;

/**
 * DIY方案VO
 * @author guojianbin
 *
 */
public class GoodsDiyVO extends Goods {

	private static final long serialVersionUID = 1L;

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
	 * 创建者名字
	 */
    private String creatorName;
    
    /**
     * 创建者头像
     */
    private String headPath;
    
    /**
     * 产品包的4S店列表
     */
    private List<Shop> shopList;
    
    /**
     * diy创建时间
     */
    private Date gmtCreate;
    
    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public List<Shop> getShopList() {
        return shopList;
    }

    public void setShopList(List<Shop> shopList) {
        this.shopList = shopList;
    }

    public String getHeadPath() {
        return headPath;
    }

    public void setHeadPath(String headPath) {
        this.headPath = headPath;
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

	public String getCreatorName() {
		return creatorName;
	}

	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}

}
