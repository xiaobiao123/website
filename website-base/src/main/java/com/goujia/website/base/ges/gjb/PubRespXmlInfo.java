package com.goujia.website.base.ges.gjb;

/**
 * 银行返回信息pub节点对应的实体
 * @author User
 *
 */
public class PubRespXmlInfo implements XmlToModel{
	
	private String retcode;
	
	private String retmsg;
	
	private String settledate;

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

	public String getSettledate() {
		return settledate;
	}

	public void setSettledate(String settledate) {
		this.settledate = settledate;
	}
	
	

}
