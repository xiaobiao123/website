/**
 * Copyright 2014-2015 goujia.com
 * All rights reserved.
 * 
 * @project
 * @author jipengfei
 * @version 1.0
 * @date 2014-06-12
 */
package com.goujia.website.base.ges.vo;


import java.util.List;

import com.goujia.website.base.ges.entity.Matter;
import com.goujia.website.base.ges.entity.MatterAlbum;

/**
 * 物料 实例 View
 * 
 * @author caoqi
 *
 */
public class MatterVO extends Matter {
	
	
	/**
	 * 类目名称
	 */
	private String categoryName;
	
	/**
	 * 产品包ID
	 */
	private Integer goodsId;
	
	/**
	 * 物料类目父ID
	 */
	private Integer parentCategoryId;
	
	/**
	 * 产品物料关系ID
	 */
	private Integer goodsMatterId;
	
	/**
	 * 品牌名称
	 */
	private String brandName;
	
	/**
	 * 物料类型
	 */
	private String type;
	
	//物料相册
    private List<MatterAlbum> matterAlbumList;
    //房间id
    private Integer roomId;
    //物料数量
    private Integer matterAmount;
    //是否为标配
    private String isStandard;

    public String getIsStandard() {
        return isStandard;
    }

    public void setIsStandard(String isStandard) {
        this.isStandard = isStandard;
    }

    public Integer getMatterAmount() {
        return matterAmount;
    }

    public void setMatterAmount(Integer matterAmount) {
        this.matterAmount = matterAmount;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public List<MatterAlbum> getMatterAlbumList() {
        return matterAlbumList;
    }

    public void setMatterAlbumList(List<MatterAlbum> matterAlbumList) {
        this.matterAlbumList = matterAlbumList;
    }

    public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Integer getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public Integer getParentCategoryId() {
		return parentCategoryId;
	}

	public void setParentCategoryId(Integer parentCategoryId) {
		this.parentCategoryId = parentCategoryId;
	}

	public Integer getGoodsMatterId() {
		return goodsMatterId;
	}

	public void setGoodsMatterId(Integer goodsMatterId) {
		this.goodsMatterId = goodsMatterId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
