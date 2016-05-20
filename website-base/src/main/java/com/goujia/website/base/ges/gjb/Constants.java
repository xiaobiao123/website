/**
 * Copyright 2014-2015 goujia.com
 * All rights reserved.
 * 
 * @project
 * @author fengchun
 * @version 1.0
 * @date 2014-07-02
 */
package com.goujia.website.base.ges.gjb;

/**
 * 
 * @author fengchun
 *
 */
public final class Constants {
	
	public final static String VERSION = "1.0.0.0";
	public final static String CHARSET = "utf-8";
	public final static String CREDIT_CODE_PREFIX ="CRET"; // 保证金支付  银行要求支付流水号是纯数字，所以用11代替CRET的前面的字符 90%
	public final static String EARNEST_CODE_PREFIX ="EART";//定金支付        10%
	
	public final static String STAGES_CODE_PREFIX ="STAG";//三次30%支付   
	
	public final static String OWNER_LOAN_PREFIX="LOAN";//业主贷款流水号前缀
	
	public final static String REFUND_CODE_PREFIX="BACK";//退款
	
	public final static String VALIDATE_CODE_PREFIX="VALI";//获取网页验证码的流水号前缀
	
	public final static String PAGE_PAY_PREFIX="PAGE";//网页确认支付流水号前缀
	
	public final static String ORG_CODE="GJW";
	
	public final static String CONFIRM_PAY="0";//确认支付
	
	public final static String CONFIRM_REFUND="1";//确认退款
	
	
	
	
}