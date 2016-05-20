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

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.goujia.website.base.utils.encrypt.MD5;

/**
 * 签名算法
 * @author Flouny.Caesar
 *
 */
public class SignUtil {
	
	/**
	 * 签名生成算法
	 * @param params
	 * @return
	 */
	public static String getSignature(String params) {
		if (StringUtil.isBlank(params)) return null;
		
		String[] kvs = params.split("&");
		
		HashMap<String, String> kvMap = new HashMap<String, String>();
		for (String kv: kvs) {
			String[] ks = kv.split("=");
			if (ks != null && ks.length > 1) {
				for (int i = 0; i < ks.length; i++) {
					if (StringUtil.isNotBlank(ks[1]) && !"null".equalsIgnoreCase(ks[1])) {
						kvMap.put(ks[0], ks[1]);
					}
				}
			}
		}
		
		return getSignature(kvMap);
	}
	
	/**
	 * 签名生成算法
	 * @param params
	 * @return
	 */
	public static String getSignature(HashMap<String,String> params) {
		if (MapUtil.isEmpty(params)) return null;
		
		// 先将参数以其参数名的字典序升序进行排序
		Map<String, String> sortedParams = new TreeMap<String, String>(params);
		Set<Entry<String, String>> entrys = sortedParams.entrySet();
		
		// 遍历排序后的字典，将所有参数按"key=value"格式拼接在一起
		StringBuilder basestring = new StringBuilder();
		for (Entry<String, String> param : entrys) {
			if (StringUtil.isNotBlank(param.getValue())) {
				basestring.append(param.getKey()).append("=").append(param.getValue());
			}
		}
		
//		 使用MD5对待签名串求签
//		byte[] bytes = null;
//		try {
//			MessageDigest md5 = MessageDigest.getInstance("MD5");
//			bytes = md5.digest(basestring.toString().getBytes("UTF-8"));
//		} catch (Exception e) {
//			throw new RuntimeException(e.getMessage(), e);
//		}
//		
//		 将MD5输出的二进制结果转换为小写的十六进制
//		StringBuilder sign = new StringBuilder();
//		for (int i = 0; i < bytes.length; i++) {
//			String hex = Integer.toHexString(bytes[i] & 0xFF);
//			if (hex.length() == 1) {
//				sign.append("0");
//			}
//			
//			sign.append(hex);
//		}
		
		return MD5.encryptMD5(basestring.toString());
	}
	
	public static void main(String[] args) {
		String params = "openid=1&openkey=asdfasd234234asdf&userName=test01&passwd=222222";
		System.out.println(SignUtil.getSignature(params));
	}
}