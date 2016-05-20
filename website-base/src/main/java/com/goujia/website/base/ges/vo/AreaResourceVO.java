package com.goujia.website.base.ges.vo;

import java.util.List;

import com.goujia.website.base.ges.entity.AreaResource;

/**
 * Created by Archer on 2015/3/19.
 */
public class AreaResourceVO extends AreaResource {
	/**
     * 省份名
     */
    private String provinceName;

    /**
     * 省份名
     */
    private String cityName;

    /**
     * 该地区的楼盘列表
     */
    private List<String> buildings;
    
    /**
     * 省份下的城市列表 
     */
    private List<AreaResourceVO> children;
    
    public List<AreaResourceVO> getChildren() {
        return children;
    }

    public void setChildren(List<AreaResourceVO> children) {
        this.children = children;
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

    public List<String> getBuildings() {
        return buildings;
    }

    public void setBuildings(List<String> buildings) {
        this.buildings = buildings;
    }
}
