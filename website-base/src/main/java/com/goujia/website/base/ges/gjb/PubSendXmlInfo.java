package com.goujia.website.base.ges.gjb;

/**
 * 发送给工商银行的pub节点的xml信息
 * @author User
 *
 */
public class PubSendXmlInfo extends PayToXml {
	
	private String orgcode;// 机构号，构架网送“GJW”
	private String zoneno;//地区号
    private String txcode;// 交易码 20301
    private String cmpdate;// 公司交易日期 YYYYMMDD
    private String cmptime;// 公司交易时间
    private String cmptxsno;// 公司方流水号 公司方必须保证流水号的唯一性。本次确认交易的流水号
    
    private String confirmtxsno;// 网页确认支付中确认支付流水号
    
	public String getOrgcode() {
		return orgcode;
	}
	public void setOrgcode(String orgcode) {
		this.orgcode = orgcode;
	}
	public String getZoneno() {
		return zoneno;
	}
	public void setZoneno(String zoneno) {
		this.zoneno = zoneno;
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
	public String getConfirmtxsno() {
		return confirmtxsno;
	}
	public void setConfirmtxsno(String confirmtxsno) {
		this.confirmtxsno = confirmtxsno;
	}
    
    
    
}
