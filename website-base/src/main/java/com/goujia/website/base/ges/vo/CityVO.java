package com.goujia.website.base.ges.vo;


import com.goujia.website.base.ges.entity.AreaResource;

/**
 * Created by Archer on 2015/3/19.
 */
public class CityVO extends AreaResource {
    /**
     * 父节点名称
     */
    private String parentname;

    public String getParentname() {
        return parentname;
    }

    public void setParentname(String parentname) {
        this.parentname = parentname;
    }
}
