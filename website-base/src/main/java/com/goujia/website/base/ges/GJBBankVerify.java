package com.goujia.website.base.ges;

/**
 * 银行确认支付/退款
 * 
 * @author gwb
 * 
 */
public class GJBBankVerify {

	// 返回代码
	private String retcode;
	// 返回信息
	private String retmsg;
	// 支付类型
	private String paytype;
	// 合同号
	private String contractno;
	// 二级商户编号
	private String subsellerid;
	// 该笔确认支付/退货的流水号
	private String cmptxsno;
	// 金额
	private String amount;
	// 清算日期
	private String settledate;
	
	private String orderstatus;

	private String signature;
	public String getRetcode() {
		return retcode;
	}

	public void setRetcode(String retcode) {
		this.retcode = retcode;
	}

	public String getRetmsg() {
		return retmsg;
	}

	public void setRetmsg(String retmsg) {
		this.retmsg = retmsg;
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

	public String getCmptxsno() {
		return cmptxsno;
	}

	public void setCmptxsno(String cmptxsno) {
		this.cmptxsno = cmptxsno;
	}

	

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getSettledate() {
		return settledate;
	}

	public void setSettledate(String settledate) {
		this.settledate = settledate;
	}

	public String getOrderstatus() {
		return orderstatus;
	}

	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}
	
	
	public String signXml(GJBBankVerify gJBBankVerify){
		StringBuffer sb = new StringBuffer();
		sb.append("<pub>"
					+ "<retcode>"+gJBBankVerify.getRetcode()+"</retcode>"
					+ "<retmsg>"+gJBBankVerify.getRetmsg()+"</retmsg>"
					+"</pub>"
					+"<req>"
					+ "<paytype>"+gJBBankVerify.getPaytype()+"</paytype>"
					+ "<contractno>"+gJBBankVerify.getContractno()+"</contractno>"
					+ "<contractno>"+gJBBankVerify.getContractno()+"</contractno>"
					+ "<subsellerid>"+gJBBankVerify.getSubsellerid()+"</subsellerid>"
					+ "<cmptxsno>"+gJBBankVerify.getCmptxsno()+"</cmptxsno>"
					+ "<amount>"+gJBBankVerify.getAmount()+"</amount>"
					+ "<settledate>"+gJBBankVerify.getSettledate()+"</settledate>"
					+ "<orderstatus>"+gJBBankVerify.getOrderstatus()+"</orderstatus>"
					+"</req>"
				
				);
		return sb.toString();
	}
	

}
