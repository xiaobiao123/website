/**
 * Copyright 2014-2015 goujia.com
 * All rights reserved.
 * 
 * @project
 * @author Flouny.Caesar
 * @version 1.0
 * @date 2014-05-21
 */
package com.goujia.website.base.ges.vo;
import java.math.BigDecimal;
import java.util.List;

import com.goujia.goujiabao.OrderStatus;
import com.goujia.goujiabao.PayWay;
import com.goujia.website.base.entity.comment.OrderReview;
import com.goujia.website.base.entity.orderlog.OrderLog;
import com.goujia.website.base.ges.OrderActionCommon;
import com.goujia.website.base.ges.entity.AreaResource;
import com.goujia.website.base.ges.entity.Order;

/**
 * Order 实例 view
 * 
 * @author caoqi
 *
 */
public class OrderVO extends Order{
	/**
	 * 定金金额
	 */
	private BigDecimal earnestAmount;
	/**
	 * 订金支付状态  'paying'|'payed':\n'待买家确认支付'|'买家已支付'
	 */
	private String earnestStatus;
	
	
	
	private String statusName;
	private String payingName;
	private BigDecimal payingAmount;
	//4S店编号
    private String shopCode;
	private String photoPath;
	private AreaResource city;


	public AreaResource getCity() {
		return city;
	}

	public void setCity(AreaResource city) {
		this.city = city;
	}


	//添加操作
	private List<OrderActionCommon> actions;
	
	
	//订单日志
	private OrderLog lastlogList;
	
	//评论
	private List<OrderReview> reviewList;
	
	//用户头像
	private String avator;
	
	private String goodsType;
	
	public String getAvator() {
        return avator;
    }

    public void setAvator(String avator) {
        this.avator = avator;
    }


    private Integer reviewCount;

    public Integer getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(Integer reviewCount) {
        this.reviewCount = reviewCount;
    }

    public List<OrderReview> getReviewList() {
        return reviewList;
    }

    public void setReviewList(List<OrderReview> reviewList) {
        this.reviewList = reviewList;
    }

    public OrderLog getLastlogList() {
        return lastlogList;
    }

    public void setLastlogList(OrderLog lastlogList) {
        this.lastlogList = lastlogList;
    }

    public List<OrderActionCommon> getActions() {
        return actions;
    }

    public void setActions(List<OrderActionCommon> actions) {
        this.actions = actions;
    }


    public String getStatusName() {
        if(null != this.getStatus()){
            statusName = OrderStatus.valueOf(this.getStatus()).getText();
            return this.statusName;
        }else{
            return null;
        }
	}


	public String getPayingName() {
		if(OrderStatus.prepaying.equals(this.getStatus())) {
			payingName = PayWay.getNameByIndex(0);
		}else if(OrderStatus.accepted_AZZC.equals(this.getStatus())){
			payingName = "担保交易金";
		}else if(OrderStatus.paying_AZZC.equals(this.getStatus())){
			//int i = this.getPayedNum()+1;
			//if(i>this.getTotalPaymentNum()) return null;
			
			payingName = "第"+1+"期 "+PayWay.getNameByIndex(1);
		}else if(OrderStatus.accepted_JZFZ.equals(this.getStatus())){
			payingName = "第"+2+"期 "+PayWay.getNameByIndex(2);
		}else if(OrderStatus.accepted_YSCS.equals(this.getStatus())){
			payingName = "第"+3+"期 "+PayWay.getNameByIndex(3);
		}
		
		return payingName;
	}


	public BigDecimal getPayingAmount() {
		if(OrderStatus.prepaying.equals(this.getStatus())) {
			payingAmount = PayWay.getMoneyByIndex(0, this.getTotalAmount());
		}else if(OrderStatus.accepted_AZZC.equals(this.getStatus())){
			BigDecimal rate = BigDecimal.ONE.subtract(PayWay.getRateByIndex(0));
			payingAmount = rate.multiply(this.getTotalAmount());
		}else if(OrderStatus.paying_AZZC.equals(this.getStatus())){
			//int i = this.getPayedNum()+1;
			//if(i>this.getTotalPaymentNum()) return null;
			
			payingAmount = PayWay.getMoneyByIndex(1, this.getTotalAmount());
		}else if(OrderStatus.accepted_JZFZ.equals(this.getStatus())){
			payingAmount = PayWay.getMoneyByIndex(2, this.getTotalAmount());
		}else if(OrderStatus.accepted_YSCS.equals(this.getStatus())){
			payingAmount = PayWay.getMoneyByIndex(3, this.getTotalAmount());
		}
		
		return payingAmount;
	}


	public BigDecimal getEarnestAmount() {
		return earnestAmount;
	}


	public void setEarnestAmount(BigDecimal earnestAmount) {
		this.earnestAmount = earnestAmount;
	}


	public String getEarnestStatus() {
		return earnestStatus;
	}


	public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    public void setEarnestStatus(String earnestStatus) {
		this.earnestStatus = earnestStatus;
	}


	public String getPhotoPath() {
		return photoPath;
	}


	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }
	
	

	
}
