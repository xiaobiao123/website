package com.goujia.website.base.ges.vo;

import java.math.BigDecimal;

import com.goujia.website.base.ges.entity.MultiplePayment;


public class MultiplePaymentVO extends MultiplePayment {
    
    private BigDecimal payMoney;
    
    private String realName;
    
    private String payWayName;
    
    private String payStatusName;
    
    private Long payedMoney;
    
    private String havePayedMoney;

    public BigDecimal getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(BigDecimal payMoney) {
        this.payMoney = payMoney;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPayWayName() {
        return payWayName;
    }

    public void setPayWayName(String payWayName) {
        this.payWayName = payWayName;
    }

    public String getPayStatusName() {
        return payStatusName;
    }

    public void setPayStatusName(String payStatusName) {
        this.payStatusName = payStatusName;
    }

    public Long getPayedMoney() {
        return payedMoney;
    }

    public void setPayedMoney(Long payedMoney) {
        this.payedMoney = payedMoney;
    }

    public String getHavePayedMoney() {
        return havePayedMoney;
    }

    public void setHavePayedMoney(String havePayedMoney) {
        this.havePayedMoney = havePayedMoney;
    }
    
}
