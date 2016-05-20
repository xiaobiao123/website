package com.goujia.website.base.ges;

import java.math.BigDecimal;

public enum PayWay {
	
	pay0("订金", new BigDecimal("0.1")),
	pay1("安装总成", new BigDecimal("0.3")),
	pay2("建筑附着总成", new BigDecimal("0.3")),
	pay3("艺术陈设总成", new BigDecimal("0.3")),
	;
	
	private String name;
	private BigDecimal rate;
	
	PayWay(String name, BigDecimal rate){
		this.name = name;
		this.rate = rate;
	}

	public String getName(){
		return this.name;
	}

	public BigDecimal getRate() {
		return rate;
	}
	
	public static int getTotalBatchOfCRET() {
		return 3;
	}
	
	public static BigDecimal getRateByIndex(int index) {
		PayWay way = null;
		switch (index) {
		case 0:
			way = PayWay.pay0;
			break;
		case 1:
			way = PayWay.pay1;
			break;
		case 2:
			way = PayWay.pay2;
			break;
		case 3:
			way = PayWay.pay3;
			break;
		}
		
		return way!=null?way.rate:null;
	}
	
	public static String getNameByIndex(int index) {
		PayWay way = null;
		switch (index) {
		case 0:
			way = PayWay.pay0;
			break;
		case 1:
			way = PayWay.pay1;
			break;
		case 2:
			way = PayWay.pay2;
			break;
		case 3:
			way = PayWay.pay3;
			break;
		}
		
		return way!=null?way.name:null;
	}
	
	public static BigDecimal getMoneyByIndex(int index, BigDecimal totalMoney) {
		BigDecimal rate = getRateByIndex(index);
		if(rate==null) return null;
		
		return totalMoney.multiply(rate);
	}
	
}
