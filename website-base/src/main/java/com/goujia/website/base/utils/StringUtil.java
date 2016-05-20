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

import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

import com.goujia.website.base.constants.base.SysConstants;

/**
 * StringUtil 工具类
 * @author Flouny.Caesar
 *
 */
public class StringUtil extends StringUtils {
	
	public static final String CHARSET_ENCODING = "UTF-8";
	
	/**
	 * 通过字符串驻留池来进行比较
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean intern(String str1, String str2) {
		if (str1 == null) return str2 == null;
		
		str1 = str1.intern();
		
		return (str1 == str2)?true : false;
	}
	
	/**
	 * 将String aaBc 转为 aa_bc的格式
	 * 用于java bean 属性转为数据库字段名
	 * @param str
	 * @return
	 */
	public static String propertyToFieldName(String str) {
		if (isEmpty(str)) return str;
		
		if(str.charAt(0) > 'A' && str.charAt(0) < 'Z') return str;
		
		if(Character.isUpperCase(str.charAt(0))) 
			str = Character.toString(Character.toLowerCase(str.charAt(0)))+str.substring(1);
		
		for(int i= 1; i < str.length(); i++) {
			char a = str.charAt(i);
			if(a >= 'A' && a <= 'Z') {
				if(str.charAt(i-1) != '_') {
					str = str.replace(String.valueOf(a), ("_".concat(String.valueOf(a))).toLowerCase());
					i++;
				}
				
				continue ;
			}
		}
		
		return str;
	}
	
	/**
	 * 返回截取字符串
	 * @param str
	 * @param num
	 * @return
	 */
	public static String omit(String str, int num) {
		
		if (StringUtil.isBlank(str)) return null;
		if(str.length() < num) return str;
		
		return num > 0?str.substring(0, num):str;
	}
	
	/**
	 * 截断字符串，只适用中文和单字节表示字符的国家
	 * @param str
	 * @param byteLength
	 * @return
	 */
	public static String limit(String str, int byteLength) {
		if (isBlank(str)) return null;
		if (byteLength <= 0) return null;
		
		try {
			if (str.getBytes(StringUtil.CHARSET_ENCODING).length <= byteLength) return str;
		} catch (UnsupportedEncodingException e) {
			
			return null;
		}
		
		StringBuffer buff = new StringBuffer();
		int index = 0;
		char c;
		char[] arr = new char[1];
		while (byteLength > 0) {
			c = str.charAt(index);
			arr[0] = c;
			if (!isChineseString(new String(arr))) {
				byteLength--;
			} else {
				byteLength--;
				byteLength--;
			}
			
			buff.append(c);
			index ++;
		}
		
		buff.append("...");
		
		return buff.toString();
	}
	
	/**
	 * 检查给定的字符串中是否包含中文信息
	 * @param string
	 * @return
	 */
	public static boolean isChineseString(String string) {
		if(isBlank(string)) return false;
		
		String patternRange = "[\\u4E00-\\u9FA5]+";
		Pattern pattern = Pattern.compile(patternRange);
		Matcher matcher = pattern.matcher(string);
		
		return matcher.find();
	}
	
	/**
	 * 
	* @Description  字符截取
	* @param str
	* @return
	* @author chenghao   
	* @date Sep 17, 2015 11:01:25 AM
	 */
	public static String intercept(String str,int length,String appendStr){
	    if(str.length()<=length)
	        return str;
	    else
	        return str.substring(0, length)+appendStr;
	}
	/**
	 * 将String中Null转换成""
	 * @param string
	 * @return
	 */
	public static String nullToString(String string) {
		
		return StringUtil.isBlank(string)?"":string;
	}
	
	public static String trim0(String num) {
		int begin = 0;
	    int end = num.length() - 1;
	    
	    while (num.charAt(end) == '0')
	    	--end; 
	    
	    if (num.charAt(end) == '.') 
	    	--end;
	    
	    return begin <= end?num.substring(begin, end + 1):"0";
	}
	
	public static String trimStr(String str) {
		
		return trimToEmpty(str).replaceAll("[\\r\\n]", "");
	}
	
	
	public static String imagePath(String path,Integer width,Integer height){
	    if(path==null || path.length()==0)
	        return path;
	    int pointPostion=path.indexOf(".");
	    if(pointPostion==-1)
	        return path;
	    String pre=path.substring(0, pointPostion);
	    String suf=path.substring(pointPostion,path.length());
	    StringBuffer buf=new StringBuffer();
	    buf.append(pre);
	    buf.append("_");
	    buf.append(width);
	    buf.append("x");
	    buf.append(height);
	    buf.append(suf);
	    return buf.toString();
	}
	public static String randomImagePath(String path){
	    Rectangle r=SysConstants.imageSizeList.get(RandomUtil.randomInt(0, SysConstants.imageSizeList.size()));
	    return imagePath(path,r.getWidth(),r.getHeight());
	}
	
	 /**
     * 
    * @Description  格式化，无小数点
    * @param num
    * @return
    * @author zhaoyonglian   
    * @date 2015年12月3日 下午4:32:34
     */
    public static String format(String num) {
        int index = num.indexOf(".");
        num = num.substring(0,index);
        return num;
    }
    
    public static String format(Double number) {
        String num = String.valueOf(number);
        int index = num.indexOf(".");
        num = num.substring(0,index);
        return num;
    }
}