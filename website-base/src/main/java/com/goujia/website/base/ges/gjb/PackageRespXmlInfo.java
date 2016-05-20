package com.goujia.website.base.ges.gjb;

import com.goujia.goujiabao.util.XMLUtil;

/**
 * 银行返回xml信息对应的实体
 * @author User
 *
 */
public class PackageRespXmlInfo extends XmlToPackage {
	
	private PubRespXmlInfo pub;
	
	private AnsRespXmlInfo ans;
	
	private String signature;

	public PubRespXmlInfo getPub() {
		return pub;
	}

	public void setPub(PubRespXmlInfo pub) {
		this.pub = pub;
	}

	public AnsRespXmlInfo getAns() {
		return ans;
	}

	public void setAns(AnsRespXmlInfo ans) {
		this.ans = ans;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}
	
	public static void main(String[] args){
		String xml="<?xml version=\"1.0\" encoding=\"UTF-8\"?><package><pub><retcode>0000</retcode><retmsg>1111111</retmsg></pub><signature>10000</signature></package>";
//		PackageRespXmlInfo p=(PackageRespXmlInfo)XMLUtil.parseXml(xml, new PackageRespXmlInfo());
		PackageRespXmlInfo p=new PackageRespXmlInfo();
		p.parseXml(xml, p);
		System.out.println("-----"+p.getSignature()+"+++"+p.getPub().getRetcode()+"+++"+p.getPub().getRetmsg()+"---");
	}

}
