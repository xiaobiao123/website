package com.goujia.website.base.ges.vo;

import java.math.BigDecimal;

public class CountPayedVO {
	
	private Integer payedNumber;
	
	private BigDecimal payedAmounts;

	private BigDecimal payedInterest;

	public Integer getPayedNumber() {
		return payedNumber;
	}

	public void setPayedNumber(Integer payedNumber) {
		this.payedNumber = payedNumber;
	}

	public BigDecimal getPayedAmounts() {
		return payedAmounts;
	}

	public void setPayedAmounts(BigDecimal payedAmounts) {
		this.payedAmounts = payedAmounts;
	}

	public BigDecimal getPayedInterest() {
		return payedInterest;
	}

	public void setPayedInterest(BigDecimal payedInterest) {
		this.payedInterest = payedInterest;
	}
	
	

}
