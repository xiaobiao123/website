package com.goujia.website.base.ges.vo;

import com.goujia.website.base.ges.entity.Resource;

public class ResourceVO extends Resource {
    public int buildingId; // 楼盘id
    public int provinceId; // 省份id
    public int cityId; // 城市id
    public int countyId; // 区域id

    public int getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(int buildingId) {
        this.buildingId = buildingId;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getCountyId() {
        return countyId;
    }

    public void setCountyId(int countyId) {
        this.countyId = countyId;
    }
}
