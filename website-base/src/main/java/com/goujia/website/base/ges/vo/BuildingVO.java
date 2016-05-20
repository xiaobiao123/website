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

import com.goujia.website.base.ges.entity.Building;

/**
 * 楼盘 实例 Entity
 *
 * @author caoqi
 */
public class BuildingVO extends Building {
    /**
     * 省份名
     */
    public String provinceName;

    /**
     * 城市名
     */
    private String cityName;

    /**
     * 区域名
     */
    private String countyName;

    /**
     * 4S店ID
     */
    private int shopId;

    /**
     * 页面条数
     */
    private Integer pageSize;

    /**
     * 排序
     */
    private String sort;
    
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

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }
}