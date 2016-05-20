/**
 * Copyright 2014-2015 goujia.com
 * All rights reserved.
 * 
 * @project
 * @author fengchun
 * @version 1.0
 * @date 2014-07-02
 */
package com.goujia.website.base.ges;

import com.goujia.goujiabao.IsHTTPS;

 /**
  * 交易码
  * @author fengchun
  *
  */
public enum GYJTradeCode {
	
	/**
	 * 在线支付
	 */
	@IsHTTPS
	GYJPAY,
	
	/**
	 * 信用支付订单提交
	 */
	@IsHTTPS
	GYJCREDPAY, 
	
	/**
	 * 订单作废
	 */
	GYJODRCANCEL, 
	
	/**
	 * 信用支付确认支付
	 */
	@IsHTTPS
	GYJCREDREPAY, 
	
	/**
	 * 查询订单结果
	 */
	GYJODRQRY, 
	
	/**
	 * 信用支付查询,
	 */
	GYJCREDQRY;
	
	/**
	 * 根据交易码动态拼装URL
	 * @return
	 */
	public String getTradeURL(String path){
		IsHTTPS isHTTPS = this.getClass().getAnnotation(IsHTTPS.class);
		
		return (isHTTPS==null?"http://":"https://")+path+this.name().toLowerCase()+".cas";
	}
}