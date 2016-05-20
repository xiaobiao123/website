package com.goujia.website.base.vo.system;

import com.goujia.website.base.vo.BaseSearchParam;

public class EnterSearchParam extends BaseSearchParam{
  private  Integer entertype ;
  private  String  city;
  private  String company;
    public Integer getEntertype() {
        return entertype;
    }
    public void setEntertype(Integer entertype) {
        this.entertype = entertype;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
      
}
