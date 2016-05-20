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

import org.springframework.web.util.HtmlUtils;

/**
 * Web项目经常会遇到Escape Html的情况，常用的有
 * org.apache.commons.lang.StringEscapeUtils 和 org.springframework.web.util.HtmlUtils
 * Spring的HtmlUtils相比StringEscapeUtils的优点是，他只转换html字符，不转换汉字等文字。
 * 
 * @author Flouny.Caesar
 *
 */
public class EscapeUtil extends HtmlUtils {
	
	/**
	 * 对JS中可能引起问题的特殊字符串做JS转义
	 * @param str
	 * @return
	 */
	public static String escapeJavaScript(String str) {
		String tempStr = JSONUtil.escapeValue(str);
		
		return StringUtil.replace(tempStr, "</script>", "<\\/script>");
	}
	
	/**
	 * 现在字符串进行HTML转义，再进行JS转义
	 * @param str
	 * @return
	 */
	public static String htmlJsEscape(String str) {
		String tempStr = HtmlUtils.htmlEscape(str);
		tempStr = escapeJavaScript(tempStr);
		
		return tempStr;
	}
	
	/**
	 * 去掉文件名中不合法的字符
	 * @param fileName
	 * @return
	 */
	public static String fileNameFilter(String fileName) {
		if(StringUtil.isBlank(fileName))return null;
		fileName=fileName.replaceAll("[\"><()/{}\'\\\\]", "");
		
		return fileName;
	}
	
	/**
	 * 对html标签过行过滤，返回内容
	 * @param str
	 * @return
	 */
	public static String escapeHtmlContent(String str) {
		
		if (StringUtil.isBlank(str)) return null;
		
		return str.replaceAll("<[^>]*>", "").replaceAll(" ","").replace("\r", "").replace("\n", "").replace("\t","").replaceAll("&nbsp;", " ");
	}
	
	/**
	 * 对双引号中的特殊字符进行预处理，防止HTML解析出错
	 * @param str
	 * @return
	 */
	public static String escapeStringInQuot(String str) {
		if (StringUtil.isBlank(str)) return "";
		
		str = str.replace("\\", "\\\\");
		str = str.replace("\"", "\\\"");
		str = str.replaceAll("[\\r\\n]", " ");
		
		return str.replace("</script>", "<\\/script>");
	}
	
	/**
	 * 对单引号中的特殊字符进行预处理，防止HTML解析出错
	 * @param str
	 * @return
	 */
	public static String escapeStringInApos(String str) {
		if (StringUtil.isBlank(str)) return "";
		
		str = str.replaceAll("[\\r\\n]", " ");
		str = str.replace("\\", "\\\\");
		str = str.replace("'", "\\'");
		str = str.replaceAll("[\\r\\n]", " ");
		
		return str.replace("</script>", "<\\/script>");
	}
}