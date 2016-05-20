package com.goujia.website.base.ges.entity;

import java.util.Date;


/**
 * 多次支付时，记录每一次支付的金额及支付阶段
 *
 */
public class MultiplePayment {
    
    private static final long serialVersionUID = 1L;
    
    private Long id;
    
    private Integer orderId;
    
    private String orderStatus;
    
    private Long money;
    
    private Integer period;
    
    private Integer payWay;
    
    private Integer payStatus;
    
    private Boolean isDelete;
    
    private Date createTime;
    
    private Date modifyTime;
    
    private Integer modifyUser;
    
    private Date systemUpdateTime;
    
    private Date paySuccessTime;
    
    private String serialPayNo;
    
    private Integer recordSource;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
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

    public Integer getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(Integer modifyUser) {
        this.modifyUser = modifyUser;
    }

    public Date getSystemUpdateTime() {
        return systemUpdateTime;
    }

    public void setSystemUpdateTime(Date systemUpdateTime) {
        this.systemUpdateTime = systemUpdateTime;
    }

    public Integer getPayWay() {
        return payWay;
    }

    public void setPayWay(Integer payWay) {
        this.payWay = payWay;
    }

    public Date getPaySuccessTime() {
        return paySuccessTime;
    }

    public void setPaySuccessTime(Date paySuccessTime) {
        this.paySuccessTime = paySuccessTime;
    }

    public String getSerialPayNo() {
        return serialPayNo;
    }

    public void setSerialPayNo(String serialPayNo) {
        this.serialPayNo = serialPayNo;
    }

    public Integer getRecordSource() {
        return recordSource;
    }

    public void setRecordSource(Integer recordSource) {
        this.recordSource = recordSource;
    }
    
    
}
