package com.goujia.website.base.ges.gjb;

/**
 * 确认支付 
 * 
 * 
 * @author gwb
 * 
 *
 */
public class Confirm {

	//公钥
	public static String privateKey="goujiabao.privateKey";
	//私钥
	public static String publicKey="goujiabao.publicKey";
	//构家网向银行请求ip
	public static String confirmUrl="goujiabao.confirmUrl";
	
	//交易码
	public static String txcode="20280";
	//交易成功返回代码
	public static String retcode="00000";
	//交易失败返回代码
	public static String retcodeFail="11111";
	//银行返回信息编码
	public static String charset_gbk="gbk";
	
	
	//支付方式
	public static String Enabledpmd="1000000000100";
	
	//public static String Installment=
	
	//贷款交易编码
	public  static String loanTxcode="20301";
	
	//退款交易码
	public static String refundTxcode="20280";
	
	//短信确认交易码
	public static String confirmTxcode="20280";

}