package com.goujia.website.base.vo.rec;

import com.goujia.website.base.vo.BaseSearchParam;

/**
 * Copyright 2014-2015 www.goujiawang.com
 * All rights reserved.
 * 
 * @project website-base
 * @author Wangfeng
 * @version 2.0
 * @date 2015年6月4日
 */
public class RecommendInfoSearchParam extends BaseSearchParam {
	private String infoType;		//推荐信息类型
	private Integer posId;			//推荐位Id
	private String posCode;		//推荐位Code
	private String posName;     //推荐位名称
	private String infoTitle;
	
	
	/** 
     * @return infoTitle 
     */
    
    public String getInfoTitle() {
        return infoTitle;
    }

    /** 
     * @param infoTitle 要设置的 infoTitle 
     */
    
    public void setInfoTitle(String infoTitle) {
        this.infoTitle = infoTitle;
    }

    /** 
     * @return posName 
     */
    
    public String getPosName() {
        return posName;
    }

    /** 
     * @param posName 要设置的 posName 
     */
    
    public void setPosName(String posName) {
        this.posName = posName;
    }

    public String getInfoType() {
		return infoType;
	}

	public void setInfoType(String infoType) {
		this.infoType = infoType;
	}

	public Integer getPosId() {
		return posId;
	}

	public void setPosId(Integer posId) {
		this.posId = posId;
	}

	public String getPosCode() {
		return posCode;
	}

	public void setPosCode(String posCode) {
		this.posCode = posCode;
	}
}
