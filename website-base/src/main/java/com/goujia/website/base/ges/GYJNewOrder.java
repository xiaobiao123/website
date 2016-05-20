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

import java.lang.reflect.Field;

import com.goujia.goujiabao.util.Tool;

/**
 * 信用支付订单提交
 * @author fengchun
 *
 */
public class GYJNewOrder {
	
	/**
	 * 交易时间yyyyMMddHHmmss
	 * <!--和服务器时间间隔前后不超过15分钟,必输-->
	 */
	private String transtime;;
	
	/**
	 * 订单编号
	 * <!--长度不超过35位,一个商户永不重复,必输-->
	 */
	private String orderid;
	
	/**
	 * 商户简称
	 * <!--长度不超过20位,会进行较验,必输-->
	 */
	private String mername;
	
	/**
	 * 买家编号
	 * <!--长度不超过20位,必输-->
	 */
	private String userid;
	
	/**
	 * 买家名称
	 * <!--长度不超过100位,必输-->
	 */
	private String username;
	
	/**
	 * 二级商户编号
	 * <!--长度不超过20位,没有二级商户默认为merid，选输-->
	 */
	private String sellerid = null;
	
	/**
	 * 二级商户名称
	 * <!--长度不超过100位,选输-->
	 */
	private String sellername;
	
	/**
	 * 商户收款账号
	 * <!--长度不超过19位,必输-->
	 */
	private String settleacct;
	
	/**
	 * 商户收款账号户名
	 * <!--长度不超过100位,必输-->
	 */
	private String settlename;
	
	/**
	 * 支付金额
	 * <!--单位:元,必输-->
	 */
	private String payamount;
	
	/**
	 * 商户跳转url
	 * <!--长度不超过200位,选输-->
	 */
	private String jumpurl;
	
	/**
	 * 后台通知url
	 * <!--长度不超过200位,必输-->
	 */
	private String noticeurl;
	
	/**
	 * 商品信息
	 * <!--长度不超过20位,选输，-->
	 */
	private String goodsinfo;
	
	/**
	 * 金额信息
	 * <!--长度不超过20位,选输-->
	 */
	private String amtinfo;
	
	/**
	 * 订单时间
	 * <!--订单生成时间,长度不超过20位,选输-->
	 */
	private String b2bdate;
	
	/**
	 * 商户自定义字段
	 * <!--平台返回结果时,原样返回,长度不超过255位,选输->
	 */
	private String mervar;
	
	/**
	 * 需要的支付方式
	 * <!--需要的支付方式,0 - 不需要,1- 需要 3位,一位代表一种支付方式,顺序为B2C，B2B，银联，不输默认111-->
	 */
	private String enabledpmd;
	
	private String installment;
	
	private 	String goodsId;
	/**
	 * 备注字段
	 */
	private String remark1;
	
	/**
	 * 备注字段
	 */
	private String remark2;
	
	/**
	 * 备注字段
	 */
	private String remark3;

	public String getTranstime() {
		return transtime;
	}

	public void setTranstime(String transtime) {
		this.transtime = transtime;
	}

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getMername() {
		return mername;
	}

	public void setMername(String mername) {
		this.mername = mername;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSellerid() {
		return sellerid;
	}

	public void setSellerid(String sellerid) {
		this.sellerid = sellerid;
	}

	public String getSellername() {
		return sellername;
	}

	public void setSellername(String sellername) {
		this.sellername = sellername;
	}

	public String getSettleacct() {
		return settleacct;
	}

	public void setSettleacct(String settleacct) {
		this.settleacct = settleacct;
	}

	public String getSettlename() {
		return settlename;
	}

	public void setSettlename(String settlename) {
		this.settlename = settlename;
	}

	public String getPayamount() {
		return payamount;
	}

	public void setPayamount(String payamount) {
		this.payamount = payamount;
	}

	public String getJumpurl() {
		return jumpurl;
	}

	public void setJumpurl(String jumpurl) {
		this.jumpurl = jumpurl;
	}

	public String getNoticeurl() {
		return noticeurl;
	}

	public void setNoticeurl(String noticeurl) {
		this.noticeurl = noticeurl;
	}

	public String getGoodsinfo() {
		return goodsinfo;
	}

	public void setGoodsinfo(String goodsinfo) {
		this.goodsinfo = goodsinfo;
	}

	public String getAmtinfo() {
		return amtinfo;
	}

	public void setAmtinfo(String amtinfo) {
		this.amtinfo = amtinfo;
	}

	public String getB2bdate() {
		return b2bdate;
	}

	public void setB2bdate(String b2bdate) {
		this.b2bdate = b2bdate;
	}

	public String getMervar() {
		return mervar;
	}

	public void setMervar(String mervar) {
		this.mervar = mervar;
	}

	public String getEnabledpmd() {
		return enabledpmd;
	}

	public void setEnabledpmd(String enabledpmd) {
		this.enabledpmd = enabledpmd;
	}

	public String getRemark1() {
		return remark1;
	}

	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}

	public String getRemark2() {
		return remark2;
	}

	public void setRemark2(String remark2) {
		this.remark2 = remark2;
	}

	public String getRemark3() {
		return remark3;
	}

	public void setRemark3(String remark3) {
		this.remark3 = remark3;
	}
	
	
	public String getInstallment() {
		return installment;
	}

	public void setInstallment(String installment) {
		this.installment = installment;
	}

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	/**
	 * 将model转化为XML
	 * @return
	 */
	public String toXMLString(){
		StringBuffer sb = new StringBuffer();
		
		Field[] fields = this.getClass().getDeclaredFields();
		for (Field field : fields) {
			try {
				field.setAccessible(true);
				sb.append("<"+field.getName()+">"+Tool.nullToEmpty((String)field.get(this))+"</"+field.getName()+">");
			} catch (Exception e) {
				return null;
			} 
		}
		
		return "<GYJ>"+sb.toString()+"</GYJ>";
	}


}