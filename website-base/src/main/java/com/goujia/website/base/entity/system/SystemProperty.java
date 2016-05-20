package com.goujia.website.base.entity.system;

import java.util.Date;

/**
 * 
* @Description: 系统属性
* @author  zhaoyonglian
* @date 2015年11月20日 下午1:54:01
*
 */
public class SystemProperty {
    private Integer id;             //主键

    private String key;             //属性

    private String value;           //值  		

    private String remark;          //备注

    private Date createTime;      //创建时间

    private Date modifyTime;     //修改时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

}