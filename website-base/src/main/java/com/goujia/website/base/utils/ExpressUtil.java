/**
 * Copyright 2014-2015 www.goujiawang.com
 * All rights reserved.
 * 
 * @project
 * @author Flouny.Caesar
 * @version 2.0
 * @date 2014-11-26
 */
package com.goujia.website.base.utils;

import java.util.regex.Pattern;

/**
 * 正则表达式 
 * 
 * @author Flouny.Caesar
 *
 */
public class ExpressUtil {
	
	/**
	 * 判断手机格式是否正确
	 * @param phone
	 * @return
	 */
	public static boolean isPhone(String phone) {
		if (StringUtil.isBlank(phone)) return false;
		
		Pattern pattern = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[01236789]))\\d{8}$");
		
		return pattern.matcher(phone).matches();
	}
	
	/**
	 * 判断手机格式是否正确
	 * @param phone
	 * @return
	 */
	public static boolean isNotPhone(String phone) {
		
		return !isPhone(phone);
	}
}