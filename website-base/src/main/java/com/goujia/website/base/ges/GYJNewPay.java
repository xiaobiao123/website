package com.goujia.website.base.ges;

import java.lang.reflect.Field;

import com.goujia.goujiabao.util.Tool;

public class GYJNewPay {
	
	private String transtime = null;//<!--和服务器时间间隔前后不超过15分钟,必输-->
	private String orderid = null;//订单编号 <!--长度不超过35位,一个商户永不重复,必输-->
	private String mername = null;//商户简称 <!--长度不超过20位,会进行较验,必输-->
	private String userid = null;//买家编号    <!--长度不超过20位,必输-->
	private String username = null;//买家名称 <!--长度不超过100位,必输,对构家网来说，为客户姓名-->
	private String sellerid = null;//二级商户编号 <!--长度不超过20位,没有二级商户默认为merid，选输，购家网该字段不输-->装修公司编号
	private String sellername = null;//二级商户名称 <!--长度不超过100位,选输,承诺书中页面展示-->
	private String selleracct = null;//B2B收款方账号 <!--长度不超过20位,选输，当B2B的收款帐号由商户自己决定时输入-->
	private String selleracctname = null;//B2B收款方户名
	private String selleracctc = null;//C2C收款方账号
	private String selleracctnamec = null;//C2C收款方账号
	private String settleacct;//<settleacct>清算商户代码</settleacct><!--长度不超过10位,必输，购家网定金支付送购家网代码“gjw”，保证金支付送装修公司代码，二级商户按此代码清算>
	private String payamount = null;//支付金额
	private String jumpurl = null;//商户跳转url
	private String noticeurl = null;//后台通知url
	private String goodsid = null;//	<goodsid>商品编号</goodsid>	<!--长度不超过20位,选输，购家网合同编号-->
	private String goodsinfo = null;//商品信息
	private String amtinfo = null;//金额信息
	private String b2bdate = null;//订单时间
	private String mervar = null;//商户自定义字段
	private String enabledpmd = null;//需要的支付方式<!--对于构家网来说，开通方式为B2C在线支付和易付，所以该字段上送1000000000100即可-->
	private String installment= null;//<installment>是否分期</installment> 选输，0为不分期，1为分期，默认不分期
	private String remark1 = null;//<!--长度不超过255位，对构家网来说，该字段为：手机号（11位）|支付类型（0为定金支付，1为保证金支付）|合同号|合同总金额|门店号|，以“|”分隔-->
	private String remark2 = null;
	private String remark3 = null;
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
	public String getSelleracct() {
		return selleracct;
	}
	public void setSelleracct(String selleracct) {
		this.selleracct = selleracct;
	}
	public String getSelleracctname() {
		return selleracctname;
	}
	public void setSelleracctname(String selleracctname) {
		this.selleracctname = selleracctname;
	}
	public String getSelleracctc() {
		return selleracctc;
	}
	public void setSelleracctc(String selleracctc) {
		this.selleracctc = selleracctc;
	}
	public String getSelleracctnamec() {
		return selleracctnamec;
	}
	public void setSelleracctnamec(String selleracctnamec) {
		this.selleracctnamec = selleracctnamec;
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
	
	public String getSettleacct() {
		return settleacct;
	}
	public void setSettleacct(String settleacct) {
		this.settleacct = settleacct;
	}
	
	public String getGoodsid() {
		return goodsid;
	}
	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}
	public String getInstallment() {
		return installment;
	}
	public void setInstallment(String installment) {
		this.installment = installment;
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
