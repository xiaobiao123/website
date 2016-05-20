package com.goujia.website.base.ges.vo;

import com.goujia.website.base.ges.entity.LoanApplyInfo;



/**
 * 贷款申请扩展
 * @author User
 *
 */
public class LoanApplyInfoExt extends LoanApplyInfo {
	
    //订单编号
    private String orderCode;
    
    //产品包名称
    private String goodsName;
    
    //产品包面积
    private Double goodsSize;
    
    //产品包是否为爆款
    private String isPromotion;
    
    //订单状态
    private String orderStatus;
    
    private Integer buyerId;
    
	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public Double getGoodsSize() {
		return goodsSize;
	}

	public void setGoodsSize(Double goodsSize) {
		this.goodsSize = goodsSize;
	}

	public String getIsPromotion() {
		return isPromotion;
	}

	public void setIsPromotion(String isPromotion) {
		this.isPromotion = isPromotion;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

    public Integer getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }


	
}
