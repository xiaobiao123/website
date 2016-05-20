package com.goujia.website.base.vo.system;

import com.goujia.website.base.vo.BaseSearchParam;

public class BookSearchParam extends BaseSearchParam{
    private Integer id;
    private String  model;
    private String city;
    private String province;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getProvince() {
        return province;
    }
    public void setProvince(String province) {
        this.province = province;
    }
    

}
