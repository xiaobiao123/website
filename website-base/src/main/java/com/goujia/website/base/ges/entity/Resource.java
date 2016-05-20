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

/**
 * 资源 实例 Entity
 * 
 * @author jipengfei
 *
 */
public class Resource{
	/**
	 * 主键ID
	 */
	private Integer id;
	
	/**
	 * 名称
	 */
	private String name;
	
	/**
	 * 排序
	 */
	private Integer orderIndex;
	
	/**
	 * 类型
	 * 'house_type'|'house_style'|'goods_room' '户型'|'风格'|'房间类型（主卧）'
	 */
	private String type;
	
    /**
     * 是否删除
     */
    private String isDeleted;
    
    /**
     * 是否标记
     */
    private int is_enabel=0;
    
    
    public int getIs_enabel() {
        return is_enabel;
    }

    public void setIs_enabel(int is_enabel) {
        this.is_enabel = is_enabel;
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
		this.name = name;
	}

	public Integer getOrderIndex() {
		return orderIndex;
	}

	public void setOrderIndex(Integer orderIndex) {
		this.orderIndex = orderIndex;
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
}
