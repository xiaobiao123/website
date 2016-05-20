package com.goujia.website.base.ges.gjb;

/**
 * 银行返回信息ans节点对应的实体类
 * @author User
 *
 */
public class AnsRespXmlInfo implements XmlToModel {
	
	private String cmptxsno;//请求报文中的流水号
	private String validcode;// 网页确认支付中返回的验证码，正式环境中该字段为空
	
	private String result;//确认支付查询：交易结果
	private String amount;//确认支付查询：原交易的金额
	
	
	public String getCmptxsno() {
		return cmptxsno;
	}
	public void setCmptxsno(String cmptxsno) {
		this.cmptxsno = cmptxsno;
	}
	public String getValidcode() {
		return validcode;
	}
	public void setValidcode(String validcode) {
		this.validcode = validcode;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	

}
