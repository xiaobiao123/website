package com.goujia.website.base.ges.entity;

import java.util.Date;

public class OrderPay  {
    
    private static final long serialVersionUID = 1L;
    
    private Long id;
    
    private Integer orderId;
    
    private Long earnest=0l;
    
    private Long deposit=0l;
    
    private Long batchPay=0l;
    
    private Date createTime;
    
    private Date modifyTime;
    
    private Boolean isDelete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Long getEarnest() {
        return earnest;
    }

    public void setEarnest(Long earnest) {
        this.earnest = earnest;
    }

    public Long getDeposit() {
        return deposit;
    }

    public void setDeposit(Long deposit) {
        this.deposit = deposit;
    }

    public Long getBatchPay() {
        return batchPay;
    }

    public void setBatchPay(Long batchPay) {
        this.batchPay = batchPay;
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

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

}
