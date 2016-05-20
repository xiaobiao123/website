/**
 * Copyright 2014-2015 www.goujiawang.com
 * All rights reserved.
 * 
 * @project
 * @author Flouny.Caesar
 * @version 2.0
 * @date 2014-11-26
 */
package com.goujia.website.base.utils.encrypt;

import java.io.IOException;

import org.apache.commons.lang.StringUtils;

/**
 * BASE64 严格地说，属于编码格式，而非加密算法
 * Base64内容传送编码被设计用来把任意序列的8位字节描述为一种不易被人直接识别的形式
 * (The Base64 Content-Transfer-Encoding is designed to represent arbitrary sequences of octets in a form that need not be humanly readable.)
 * 
 * @author Flouny.Caesar
 *
 */
public class BASE64 {
	
	/**
	 * BASE64解密
	 * @param key
	 * @return
	 */
	public static byte[] decryptBASE64(String key) {
		if (StringUtils.isBlank(key)) return null;
		
	    try {
			return (new sun.misc.BASE64Decoder()).decodeBuffer(key);
		} catch (IOException e) {
			// ...
		}
		
		return null;  
	}
	
	/**
	 * BASE64加密
	 * @param key
	 * @return
	 */
	public static String encryptBASE64(byte[] key) {
		try {
			return (new sun.misc.BASE64Encoder()).encodeBuffer(key); 
		} catch (Exception e) {
			// ...
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		String str = "中华人民共和国";
		String eb = encryptBASE64(str.getBytes()); // 加密
		System.out.println("原文：" + str);
		System.out.println("通过Base64加密后：" + eb);
		String db = new String(decryptBASE64(eb));
		System.out.println("通过Base64解密后：" + db);
	}
}