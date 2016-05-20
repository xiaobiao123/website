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

import com.goujia.website.base.ges.entity.GoodsRoom;

/**
 * 商品房间View
 * @author jipengfei
 *
 */
public class GoodsRoomVO extends GoodsRoom{

	/**
	 * 房间锚点列表
	 */
	private List<GoodsMarkVO> markList;
	
	/**
	 * 收藏数
	 */
	private Integer collectionNumber;
	
	/**
	 *  是否收藏  0 :否
	 */
	private Integer hadCollect;
	
	/**
	 *  点赞数
	 */
	private Integer supportNumber;
	
	/**
	 * 是否点赞  0 :否
	 */
	private Integer hadSupport;
	
	/**
     * 房间属性
     */
    private String roomAttributeName;
	
	public String getRoomAttributeName() {
        return roomAttributeName;
    }

    public void setRoomAttributeName(String roomAttributeName) {
        this.roomAttributeName = roomAttributeName;
    }

    public Integer getHadCollect() {
        return hadCollect;
    }

    public void setHadCollect(Integer hadCollect) {
        this.hadCollect = hadCollect;
    }

    public Integer getHadSupport() {
        return hadSupport;
    }

    public void setHadSupport(Integer hadSupport) {
        this.hadSupport = hadSupport;
    }

    public Integer getCollectionNumber() {
        return collectionNumber;
    }

    public void setCollectionNumber(Integer collectionNumber) {
        this.collectionNumber = collectionNumber;
    }

    public Integer getSupportNumber() {
        return supportNumber;
    }

    public void setSupportNumber(Integer supportNumber) {
        this.supportNumber = supportNumber;
    }

    public List<GoodsMarkVO> getMarkList() {
		return markList;
	}

	public void setMarkList(List<GoodsMarkVO> markList) {
		this.markList = markList;
	}
}
