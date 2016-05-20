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
 * 产品包描点 实例 Entity
 * 
 * @author jipengfei
 * 
 */
public class GoodsMark{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 主键ID
	 */
	private Integer id;
	
	/**
	 * 产品包房间表
	 */
	private Integer goodsRoomId;
	
	/**
	 * 相对于房间图片左上角X坐标
	 */
	private Double relativeX;
	
	/**
	 * 相对于房间图片左上角X坐标
	 */
	private Double relativeY;
	
	/**
	 * 标记类型  1|2|3 物料标记|功能细节|工艺标准
	 */
	private String type;
	
	/**
	 * 是否删除 'y'|'n' '是'|'否'
	 */
	private String isDeleted;
	
	private Date gmtCreate;
	
	private Date gmtModified;
	
	private Integer ownerId;
	/*
     * 是否可减配  'y'|'n' '是'|'否'
     */
    private String isCut;
    
    /**
     * 相对于效果图左上角X坐标
     */
    private Double effectX;
    
    /**
     * 相对于效果图左上角X坐标
     */
    private Double effectY;
    
    /**
     * 效果图路径
     */
    private String effectPath;
    
    /**
     * 效果图样式
     */
    private String effectStyle;
    
    /**
     * 物料ID
     */
    private Integer matterId;
    
    public Double getEffectX() {
        return effectX;
    }

    public void setEffectX(Double effectX) {
        this.effectX = effectX;
    }

    public Double getEffectY() {
        return effectY;
    }

    public void setEffectY(Double effectY) {
        this.effectY = effectY;
    }

    public String getEffectPath() {
        return effectPath;
    }

    public void setEffectPath(String effectPath) {
        this.effectPath = effectPath;
    }

    public String getEffectStyle() {
        return effectStyle;
    }

    public void setEffectStyle(String effectStyle) {
        this.effectStyle = effectStyle;
    }

    public Integer getMatterId() {
        return matterId;
    }

    public void setMatterId(Integer matterId) {
        this.matterId = matterId;
    }

    public String getIsCut() {
        return isCut;
    }

    public void setIsCut(String isCut) {
        this.isCut = isCut;
    }
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getGoodsRoomId() {
		return goodsRoomId;
	}

	public void setGoodsRoomId(Integer goodsRoomId) {
		this.goodsRoomId = goodsRoomId;
	}

	public Double getRelativeX() {
		return relativeX;
	}

	public void setRelativeX(Double relativeX) {
		this.relativeX = relativeX;
	}

	public Double getRelativeY() {
		return relativeY;
	}

	public void setRelativeY(Double relativeY) {
		this.relativeY = relativeY;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
}
