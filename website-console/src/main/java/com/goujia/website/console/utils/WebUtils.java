package com.goujia.website.console.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;

/**
 * 
 * 
 * @Project: eshop-web
 * @File: WebUtils.java
 * @Date: 2015-2-9
 * @Author: wangfeng
 * @Copyright: 版权所有 (C) 2013 浙江中国轻纺城网络有限公司，并保留所有权利.
 * 
 *             注意：本内容仅限于浙江中国轻纺城网络有限公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class WebUtils {

	public static Date getCurrentDate() {
		return new Date(System.currentTimeMillis());
	}

	public static String getCurrentIP(HttpServletRequest request){
		String result = request.getHeader("X-Real-IP");
		if (result == null || result.length() == 0
				|| "unknown".equalsIgnoreCase(result)) {
			result = request.getHeader("x-forwarded-for");
		}
		if (result == null || result.length() == 0
				|| "unknown".equalsIgnoreCase(result)) {
			result = request.getHeader("Proxy-Client-IP");
		}
		if (result == null || result.length() == 0
				|| "unknown".equalsIgnoreCase(result)) {
			result = request.getHeader("WL-Proxy-Client-IP");
		}
		if (result == null || result.length() == 0
				|| "unknown".equalsIgnoreCase(result)) {
			result = request.getHeader("HTTP_X_FORWARDED_FOR");
		}
		if (!StringUtils.isEmpty(result)) {
			if (result.indexOf(".") != -1){ // 没有"."肯定是非IPv4格式
				Pattern pat = Pattern.compile("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
				Matcher mat = pat.matcher(result);
				result = null;
				while (mat.find()) {
					//System.out.println(111);
					result = mat.group(0);
					break;
				}
			}
			else
				result = null;
		}

		if (StringUtils.isEmpty(result))
			result = request.getRemoteAddr();

		return result;
	}
	
	public static Date getTodayDate(String format) {
		SimpleDateFormat s = new SimpleDateFormat(StringUtils.isBlank(format) ? "yyyy-MM-dd" : format);
		try {
			return s.parse(s.format(getCurrentDate()));
		} catch (ParseException e) {
			return null;
		}
	}

	public static Date formateDate(Date date, String format) {
		SimpleDateFormat s = new SimpleDateFormat(StringUtils.isBlank(format) ? "yyyy-MM-dd" : format);
		try {
			return s.parse(s.format(date));
		} catch (ParseException e) {
			return null;
		}
	}

	public static Date formateDate(String date, String format) {
		SimpleDateFormat s = new SimpleDateFormat(StringUtils.isBlank(format) ? "yyyy-MM-dd" : format);
		try {
			return s.parse(date);
		} catch (ParseException e) {
			return null;
		}
	}

	// 比较当前时间是否在二个时间之内
	public static boolean betweenTwoDates(Date aviableDate, Date expireDate) {
		Date now = getCurrentDate();
		if (aviableDate == null || expireDate == null) {
			return false;
		}
		if (aviableDate.before(now) && expireDate.after(now)) {
			return true;
		}
		return false;
	}

	public static Date getExpireDate(Date date, Integer distance) {
		if (date == null)
			return null;
		if (distance == null)
			return date;
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.DAY_OF_MONTH, distance);
		return c.getTime();
	}

	public static Date getExpireDateByYear(Date date, Integer distance) {
		if (date == null)
			return null;
		if (distance == null)
			return date;
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.DAY_OF_YEAR, distance);
		return c.getTime();
	}

	/**
	 * 过滤非法字符，防js注入
	 * 
	 * @param value
	 *            源字符串
	 * @return 过滤后字符串
	 */
	public static String escapeParamString(String value) {

		if (value == null)
			return "";

		// value = StringUtils.replace(value, "|", "");
		value = StringUtils.replace(value, "&amp;", "");
		// value = StringUtils.replace(value, ";", "");
		value = StringUtils.replace(value, "$", "");
		// value = StringUtils.replace(value, "%", "");
		// value = StringUtils.replace(value, "@", "");
		value = StringUtils.replace(value, "'", "");
		value = StringUtils.replace(value, "\"", "");
		value = StringUtils.replace(value, "\\'", "");
		value = StringUtils.replace(value, "&lt;", "");
		value = StringUtils.replace(value, "&gt;", "");
		value = StringUtils.replace(value, "<", "");
		value = StringUtils.replace(value, ">", "");
		// value = StringUtils.replace(value, "(", "");
		// value = StringUtils.replace(value, ")", "");
		// value = StringUtils.replace(value, "+", "");
		// value = StringUtils.replace(value, "\n", "");
		value = StringUtils.replace(value, "\r", "");
		// value = StringUtils.replace(value, ",", "");
		value = StringUtils.replace(value, "\\", "");
		value = value.trim();
		return value;
	}

}
