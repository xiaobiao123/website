package com.goujia.website.base.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;


/**
 * ------------------------------------------------------------------
 * 版权所有 Copyright (C) 2014 杭州热讯电子商务有限公司
 *
 * 项目名称：银行接口-服务端
 *
 * 模块名称：公共操作类
 *
 * 文件名：DataUtil.java
 * 
 * 创建者： 戴耀强 （kiccleaf@163.com）
 * 
 * 创建时间：2014年5月28日-上午10:53:46
 * 
 * 描述：TODO
 *-------------------------------------------------------------------
 */
public class DataUtil {

	
	/**
	 * 获取客户端域名
	 * @param request
	 * @return
	 */
	public static String getDoMain(HttpServletRequest request) {
		//String strDoMain=request.getRequestURL().toString();//获取URL整串地址
		String strDoMain=request.getServerName().toString();//获取域名

		return strDoMain.toString();
		
	}
	/**
	 * 设置头信息页面不缓存
	 * @param response
	 */
	public static void setHeader(HttpServletResponse response) {
		// 设置页面不缓存
		response.setHeader("Pragma", "No-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		response.setHeader("Server", "PayBank V1.0");
	}
	/**
	 * 获取完整URL 方法 
	 * @param request
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static String getRequestURL(HttpServletRequest request) {
		if (request == null) {
			return "";
		}
		String url = "";
		url = request.getContextPath();
		url = url + request.getServletPath();

		Enumeration names = request.getParameterNames();
		int i = 0;
		if (!"".equals(request.getQueryString())
				|| request.getQueryString() != null) {
			url = url + "?" + request.getQueryString();
		}

		if (names != null) {
			while (names.hasMoreElements()) {
				String name = (String) names.nextElement();
				if (i == 0) {
					url = url + "?";
				} else {
					url = url + "&";
				}
				i++;

				String value = request.getParameter(name);
				if (value == null) {
					value = "";
				}
				url = url + name + "=" + value;
				try {
					// java.net.URLEncoder.encode(url, "ISO-8859");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		try {
			// String enUrl = java.net.URLEncoder.encode(url, "utf-8");
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return url;
	}

	/**
	 * 获取客户端IP
	 * @param request IP地址
	 * @return
	 */
	public static String getIpAddr(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}
	/**
	 * 向指定URL发送GET方法的请求
	 * 
	 * @param url
	 *            发送请求的URL
	 * @param params
	 *            请求参数，请求参数应该是name1=value1&name2=value2的形式。
	 * @return URL所代表远程资源的响应
	 */
	public static String sendGet(String url, String params) {
		String result = "";
		BufferedReader in = null;
		try {
			String urlName = url + "?" + params;
			URL realUrl = new URL(urlName);
			// 打开和URL之间的连接
			URLConnection conn = realUrl.openConnection();
			// 设置通用的请求属性
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("user-agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/34.0.1847.137 Safari/537.36");

			// 建立实际的连接
			conn.connect();
			// 获取所有响应头字段

			Map<String, List<String>> map = conn.getHeaderFields();
			// 遍历所有的响应头字段
			for (String key : map.keySet()) {
				System.out.println(key + "--->" + map.get(key));
			}

			// 定义BufferedReader输入流来读取URL的响应
			in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			JSONObject jsonObj = JSONObject.parseObject(in.toString());
			result=jsonObj.toString();
			/*String line;
			while ((line = in.readLine()) != null) {
				result += "\n" + line;
			}*/
		} catch (Exception e) {
			System.out.println("发送GET请求出现异常！" + e);
			e.printStackTrace();
		}
		// 使用finally块来关闭输入流
		finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * 向指定URL发送POST方法的请求
	 * 
	 * @param url
	 *            发送请求的URL
	 * @param params
	 *            请求参数，请求参数应该是name1=value1&name2=value2的形式。
	 * @return URL所代表远程资源的响应
	 */
	public static String sendPost(String url, String params) {
		PrintWriter out = null;
		BufferedReader in = null;
		String result = "";
		try {
			URL realUrl = new URL(url);
			// 打开和URL之间的连接
			URLConnection conn = realUrl.openConnection();
			//Https链接
			//HttpsURLConnection conn=(HttpsURLConnection) realUrl.openConnection();
			// 设置通用的请求属性
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("user-agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/34.0.1847.137 Safari/537.36");
			conn.setRequestProperty("Accept-Charset", "GBK");
			// 发送POST请求必须设置如下两行
			conn.setDoOutput(true);
			conn.setDoInput(true);
			// 获取URLConnection对象对应的输出流
			out = new PrintWriter(conn.getOutputStream());
			// 发送请求参数
			out.print(params);
			// flush输出流的缓冲
			out.flush();

			// 定义BufferedReader输入流来读取URL的响应
			in = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			result=in.readLine();
			/*
			String line;
			while ((line = in.readLine()) != null) {
				result += "\n" + line;
			}*/
		} catch (Exception e) {
			System.out.println("发送POST请求出现异常！" + e);
			e.printStackTrace();
		}
		// 使用finally块来关闭输出流、输入流
		finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}
	/**
	 * 向指定Https发送POST方法的请求
	 * 
	 * @param url
	 *            发送请求的URL
	 * @param params
	 *            请求参数，请求参数应该是name1=value1&name2=value2的形式。
	 * @return URL所代表远程资源的响应
	 */
	public static String sendHttps(String url, String params) {
		PrintWriter out = null;
		BufferedReader in = null;
		String result = "";
		try {
			URL realUrl = new URL(url);
			// 打开和URL之间的连接
			//URLConnection conn = realUrl.openConnection();
			//Https链接
			HttpsURLConnection conn=(HttpsURLConnection) realUrl.openConnection();
			// 设置通用的请求属性
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("user-agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/34.0.1847.137 Safari/537.36");

			// 发送POST请求必须设置如下两行
			conn.setDoOutput(true);
			conn.setDoInput(true);
			// 获取URLConnection对象对应的输出流
			out = new PrintWriter(conn.getOutputStream());
			// 发送请求参数
			out.print(params);
			// flush输出流的缓冲
			out.flush();

			// 定义BufferedReader输入流来读取URL的响应
			in = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			result=in.readLine();
			
			String line;
			while ((line = in.readLine()) != null) {
				result += "\n" + line;
			}
		} catch (Exception e) {
			System.out.println("发送POST请求出现异常！" + e);
			e.printStackTrace();
		}
		// 使用finally块来关闭输出流、输入流
		finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}
	   /**
	    * 
	    * @param urlAll:请求接口
	    * @param charset:字符编码
	    * @return 返回json结果
	    */
	   public static String getHttp(String urlAll,String charset){
		   BufferedReader reader = null;
		   String result = null;
		   //StringBuffer sbf = new StringBuffer();
		   String userAgent = "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.66 Safari/537.36";//模拟浏览器
		   try {
			   URL url = new URL(urlAll);
			   HttpURLConnection connection = (HttpURLConnection)url.openConnection();
			   connection.setRequestMethod("GET");
			   connection.setReadTimeout(30000);
			   connection.setConnectTimeout(30000);
			   connection.setRequestProperty("User-agent",userAgent);
			   connection.connect();
			   InputStream is = connection.getInputStream();
			   reader = new BufferedReader(new InputStreamReader(is, charset));
			   result=reader.readLine();
			  //JSONObject jsonObj = JSONObject.fromObject(reader);
				//result=jsonObj.toString();
				/*String strRead = null;
				while ((strRead = reader.readLine()) != null) {
					sbf.append(strRead);
					sbf.append("\r\n");
				}*/
				reader.close();
				//result = sbf.toString();
			   
		} catch (Exception e) {
			e.printStackTrace();
		}
		   return result;
	   }
}
