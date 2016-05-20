package com.goujia.website.base.ges;


/**
 * 构家宝 确认支付
 * 
 * @author gwb
 * 
 */
public class GJWCashDeposit {
	private String orgcode;// 机构号，构架网送“GJW”
	private String txcode;// 交易码 20280
	private String cmpdate;// 公司交易日期 YYYYMMDD
	private String cmptime;// 公司交易时间
	private String cmptxsno;// 公司方流水号 公司方必须保证流水号的唯一性。本次确认交易的流水号
	
	
	private String paytype;// 支付类型 0-确认支付；1-确认退货
	private String contractno;// 合同号(对应构家网的订单号)
	private String subsellerid;// 二级商户编号，对应构家网装修公司编号
	private String orderno;// 原保证金交易支付流水号
	private String amount;// 确认支付、退货金额
	private String mobile;// 原保证金交易登记的手机号
	private String orderstatus;

//	private String cmptxsno;// 对应20280交易中的cmptxsno字段(GJWPubAffirm)
	private String settledate;// 该笔交易的清算日
	
	private String signature;
	
	public String getOrgcode() {
		return orgcode;
	}


	public void setOrgcode(String orgcode) {
		this.orgcode = orgcode;
	}


	public String getTxcode() {
		return txcode;
	}


	public void setTxcode(String txcode) {
		this.txcode = txcode;
	}


	public String getCmpdate() {
		return cmpdate;
	}


	public void setCmpdate(String cmpdate) {
		this.cmpdate = cmpdate;
	}


	public String getCmptime() {
		return cmptime;
	}


	public void setCmptime(String cmptime) {
		this.cmptime = cmptime;
	}


	public String getCmptxsno() {
		return cmptxsno;
	}


	public void setCmptxsno(String cmptxsno) {
		this.cmptxsno = cmptxsno;
	}


	public String getPaytype() {
		return paytype;
	}


	public void setPaytype(String paytype) {
		this.paytype = paytype;
	}


	public String getContractno() {
		return contractno;
	}


	public void setContractno(String contractno) {
		this.contractno = contractno;
	}


	public String getSubsellerid() {
		return subsellerid;
	}


	public void setSubsellerid(String subsellerid) {
		this.subsellerid = subsellerid;
	}


	public String getOrderno() {
		return orderno;
	}


	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}


	public String getAmount() {
		return amount;
	}


	public void setAmount(String amount) {
		this.amount = amount;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getSettledate() {
		return settledate;
	}


	public void setSettledate(String settledate) {
		this.settledate = settledate;
	}


	public void setSignature(String signature) {
		this.signature=signature;
	}
	

	public String getSignature() {
		return signature;
	}

	public String getOrderstatus() {
		return orderstatus;
	}

	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}

	
	/**
	 * 确认保证金支付生成xml
	 * @param gJWCashDeposit
	 * @return
	 */
	public String toStringXml (GJWCashDeposit gJWCashDeposit){
	StringBuffer sb = new StringBuffer();
	sb.append("<pub>"
				+ "<orgcode>"+gJWCashDeposit.getOrgcode()+"</orgcode>"
				+"<txcode>"+	gJWCashDeposit.getTxcode()+"</txcode>"
				+"<cmpdate>"+gJWCashDeposit.getCmpdate()+"</cmpdate>"
				+"<cmptime>"+gJWCashDeposit.getCmptime()+"</cmptime>"
				+"<cmptxsno>"+gJWCashDeposit.getCmptxsno()+"</cmptxsno>"
			+"</pub>"
			+"<req>"	
				+"<paytype>"+gJWCashDeposit.getPaytype()+"</paytype>"
				+"<contractno>"+gJWCashDeposit.getContractno()+"</contractno>"
				+"<subsellerid>"+gJWCashDeposit.getSubsellerid()+"</subsellerid>"
				+"<orderno>"+gJWCashDeposit.getOrderno()+"</orderno>"
				+"<amount>"+gJWCashDeposit.getAmount()+"</amount>"
				+"<mobile>"+gJWCashDeposit.getMobile()+"</mobile>"
				+"<orderstatus >"+gJWCashDeposit.getOrderstatus()+"</orderstatus>"
			+"</req>"
			);
	return sb.toString();
	}
	
	
	/**
	 * 生成base64（xml）
	 * @param toStringXml
	 * @return
	 */
	public  String toStringXmlEncode(String toStringXml){
		return "<?xml version=\"1.0\" encoding=\"UTF-8\"?><package>"+toStringXml+"</package>";
	}
	
	
	
	
	
}
