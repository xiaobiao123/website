package com.goujia.website.base.ges;

/**
 * 
 * 保证金确认交易 应答包信息区，为银行方具体交易返回信息
 * 
 * @author
 * 
 */
public class GJWAnsAffirm {
	// 返回代码 返回代码，00000表示确认通知发送成功，其余代码表示失败。
	private String retcode;
	private String retmsg;// 错误信息
	private String signature;//返回签名

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

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

	/**
	 * 构家网向工行发出请求，对工行响应信息验签
	 * @param gJWCashDeposit
	 * @return
	 */
	public String verifyBackAns (GJWAnsAffirm gJWAnsAffirm){
	StringBuffer sb = new StringBuffer();
	sb.append("<pub>"
				+ "<retcode>"+gJWAnsAffirm.getRetcode()+"</retcode>"
				+"<retmsg>"+gJWAnsAffirm.getRetmsg()+"</retmsg>"
				+"</pub>"
			);
	return sb.toString();
	}
	
	public String toStringXml(GJWAnsAffirm ans){
	StringBuffer sb = new StringBuffer();
	sb.append("<pub>"
				+ "<orgcode>"+ans.getRetcode()+"</orgcode>"
				+"<retmsg>"+ans.getRetmsg()+"</txcode>"
			+"</pub>"
			+"<signature>"+ans.getSignature()+"</signature>"
			);
	return "<?xml version=\"1.0\" encoding=\"GBK\"?><package>"+sb.toString()+"</package>";
	}
}
