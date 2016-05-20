/**
 * Copyright 2014-2015 goujiawang.com
 * All rights reserved.
 * 
 * @project
 * @author jipengfei
 * @version 2.0
 * @date 2014-07-1
 */
package com.goujia.website.base.ges.vo;

import com.goujia.website.base.ges.entity.Goods;

/**
 * 产品包楼盘信息VO
 * @author jipengfei
 *
 */
public class GoodsBuildingVO extends Goods {
	/**
	 * 原始户型图
	 */
	private String oriPhotoPath;
	
	/**
	 * 楼盘ID
	 */
	private Integer buildingId;
	
	/**
	 * 楼盘名称
	 */
	private String buildingName;
	
	/**
	 * 面积
	 */
	private String floorArea;
	
	/**
	 * 已售出销售数量
	 */
	private Integer saleNum;
	/**
	 * 区域名称
	 */
	private String countyName;
	
	private Boolean checked;
	
	/**
	 * 点赞数
	 */
	private Integer supportNum;
	
	/**
	 * 是否点赞过 0：否
	 */
	private Integer hadSupport;
	
	/**
	 * 收藏数
	 */
	private Integer collectNum;
	
	/**
	 * 是否收藏过 0：否
	 */
	private Integer hadCollect;
	
	/**
	 * diy PK数量
	 */
	private Integer diyCount;
	
	public Integer getDiyCount() {
        return diyCount;
    }

    public void setDiyCount(Integer diyCount) {
        this.diyCount = diyCount;
    }

    public Integer getHadSupport() {
        return hadSupport;
    }

    public void setHadSupport(Integer hadSupport) {
        this.hadSupport = hadSupport;
    }

    public Integer getHadCollect() {
        return hadCollect;
    }

    public void setHadCollect(Integer hadCollect) {
        this.hadCollect = hadCollect;
    }

    public Integer getSupportNum() {
        return supportNum;
    }

    public void setSupportNum(Integer supportNum) {
        this.supportNum = supportNum;
    }

    public Integer getCollectNum() {
        return collectNum;
    }

    public void setCollectNum(Integer collectNum) {
        this.collectNum = collectNum;
    }

    public Boolean getChecked() {
		return checked;
	}

	public void setChecked(Boolean checked) {
		this.checked = checked;
	}

	public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getOriPhotoPath() {
		return oriPhotoPath;
	}

	public void setOriPhotoPath(String oriPhotoPath) {
		this.oriPhotoPath = oriPhotoPath;
	}

	public Integer getBuildingId() {
		return buildingId;
	}

	public void setBuildingId(Integer buildingId) {
		this.buildingId = buildingId;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getFloorArea() {
		return floorArea;
	}

	public void setFloorArea(String floorArea) {
	    this.floorArea = floorArea == null ? null : floorArea.substring(0,
                floorArea.length() - 2);
	}

	public Integer getSaleNum() {
		return saleNum;
	}

	public void setSaleNum(Integer saleNum) {
		this.saleNum = saleNum;
	}
}
