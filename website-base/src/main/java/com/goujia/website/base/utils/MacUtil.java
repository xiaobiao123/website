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

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;

/**
 * 读取本地机器的Mac地址
 * 
 * @author Flouny.Caesar
 *
 */
public class MacUtil {
	
	/**
	 * 获取unix网卡的mac地址. 非windows的系统默认调用本方法获取
	 * 
	 * @return
	 */
	public static String getUnixMACAddress() {
		String mac = null;
		BufferedReader bufferedReader = null;
		Process process = null;
		try {
			// linux下的命令，一般取eth0作为本地主网卡
			process = Runtime.getRuntime().exec("ifconfig eth0");
			bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line = null;
			int index = -1;
			while ((line = bufferedReader.readLine()) != null) {
				 // 寻找标示字符串[hwaddr]
				index = line.toLowerCase().indexOf("hwaddr");
				if (index >= 0) {
					// 取出mac地址并去除2边空格
					mac = line.substring(index + "hwaddr".length() + 1).trim();
					break;
				}
			}
		} catch (Exception e) {
			
			return null;
		} finally {
			try {
				if (bufferedReader != null) {
					bufferedReader.close();
				}
			} catch (Exception e) {
				
				return null;
			}
			
			bufferedReader = null;
			process = null;
		}
		
		return mac;
	 }
	
	/**
	 * 获取widnows网卡的mac地址.
	 * 
	 * @return
	 */
	public static String getWindowsMACAddress() {
		 String mac = null;
		 BufferedReader bufferedReader = null;
		 Process process = null;
		 try {
			// windows下的命令，显示信息中包含有mac地址信息
			 process = Runtime.getRuntime().exec("ipconfig /all");
			 bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			 String line = null;
			 int index = -1;
			 while ((line = bufferedReader.readLine()) != null) {
				// 寻找标示字符串[physical
				 index = line.toLowerCase().indexOf("physical address");
				 if (index >= 0) {
					 index = line.indexOf(":");// 寻找":"的位置
					 if (index >= 0) {
						 // 取出mac地址并去除2边空格
						 mac = line.substring(index + 1).trim();
					 }
					 
					 break;
				 }
			 }
		 } catch (Exception e) {
			 return null;
		 } finally {
			 try {
				 if (bufferedReader != null) {
					 bufferedReader.close();
				 }
			 } catch (Exception e) {
				 
				 return null;
			 }
			 
			 bufferedReader = null;
			 process = null;
		 }
		 
		 return mac;
	}
	
	/**
	 * windows 7 专用 获取MAC地址
	 * @return
	 */
	public static String getWindows7MACAddress() {
		StringBuffer buffer = new StringBuffer();
		try {
			// 获取本地IP对象
			InetAddress ia = InetAddress.getLocalHost();
			// 获得网络接口对象（即网卡），并得到mac地址，mac地址存在于一个byte数组中。
			byte[] mac = NetworkInterface.getByInetAddress(ia).getHardwareAddress();
			
			 for (int i = 0; i < mac.length; i++) {
				 String s = Integer.toHexString(mac[i] & 0xFF);
				 buffer.append(s.length() == 1 ? 0 + s : s);
			 }
		} catch (Exception e) {
			
			return null;
		}
		
		return buffer.toString();
	}
	
	/**
	 * 获取MAC地址
	 * @return
	 */
	public static String getMACAddress() {
		// windows
		String mac = getWindowsMACAddress();
		
		if (isNull(mac)) {
			mac = getWindows7MACAddress();
		}
		
		// unix
		if (isNull(mac)) {
			mac = getUnixMACAddress();
		}
		
		if (!isNull(mac)) {
			 mac = mac.replace("-", "");
		} else {
			 mac = "ABCDEFGHIJ";
		}
		
		return mac.toLowerCase();
	}
	
	/**
	 * 获取当前操作系统名称
	 * 
	 * 操作系统名称 例如:windows xp,linux 等
	 * @return
	 */
//	private static String getOSName() {
//		
//		 return System.getProperty("os.name").toLowerCase();
//	}
	
	/**
	 * 判断对象是否为空
	 * @param strData
	 * @return
	 */
	private static boolean isNull(Object strData) {
		
		return (strData == null || String.valueOf(strData).trim().equals(""))?true:false;
	}
	
	public static void main(String[] args) {
		System.out.println(getWindows7MACAddress());
	}
}