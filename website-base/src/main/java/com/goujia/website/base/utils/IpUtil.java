package com.goujia.website.base.utils;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONObject;

public class IpUtil {
		/**
		 * @param args
		 * @return 字符串数组 第一个为国家，第二个为省，第三个为市 
		 */
		public static String[] getRegion(String ip) {
			  
			  try {
				  
				  return getAddr(ip);
			   
			  } catch (Exception e) {
				  
				  e.printStackTrace();
			  }
			  return null;
		}
		private static String[] getAddr(String ip) throws Exception{
			String[] str=new String[3];
			Date start=new Date();
			String uri="http://int.dpool.sina.com.cn/iplookup/iplookup.php?format=json&ip=";
			HttpClient client=new DefaultHttpClient();
			HttpGet get=new HttpGet(uri+ip);
			HttpResponse response=client.execute(get);
			System.out.println(new Date().getTime()-start.getTime());
			HttpEntity entity=response.getEntity();
			String json=convertStreamToString(entity.getContent());
			JSONObject jsonObject = new JSONObject(json);
			if(jsonObject.getInt("ret")==0){
				return null;
			}
			str[0]=decodeUnicode(jsonObject.getString("country"));
			str[1]=decodeUnicode(jsonObject.getString("province"));
			str[2]=decodeUnicode(jsonObject.getString("city"))+"市";
			return str;
		}
		private  static String convertStreamToString(InputStream is) {      
	        BufferedReader reader = new BufferedReader(new InputStreamReader(is));      
	        StringBuilder sb = new StringBuilder();      
	       
	        String line = null;      
	        try {      
	            while ((line = reader.readLine()) != null) {  
	                sb.append(line + "\n");      
	            }      
	        } catch (IOException e) {      
	            e.printStackTrace();      
	        } finally {      
	            try {      
	                is.close();      
	            } catch (IOException e) {      
	               e.printStackTrace();      
	            }      
	        }      
	        return sb.toString();      
	    }  
		/**
		 * 字符转码
		 * @param theString
		 * @return
		 */
		private static  String decodeUnicode(String theString){
			
			char aChar;
			
			int len = theString.length();
			
			StringBuffer buffer = new StringBuffer(len);
			
			for (int i = 0; i < len;) {
				
				aChar = theString.charAt(i++);
				
				if(aChar == '\\'){
					
					aChar = theString.charAt(i++);
				
					if(aChar == 'u'){
						
						int val = 0;
						
						for(int j = 0; j < 4; j++){
							
							aChar = theString.charAt(i++);
							
							switch (aChar) {
							
							case '0':
								
							case '1':
								
							case '2':
								
							case '3':
								
							case '4':
							
							case '5':
								
							case '6':
							
							case '7':
								
							case '8':
								
							case '9':
								
							val = (val << 4) + aChar - '0';
							
							break;
		
							case 'a':
								
							case 'b':
								
							case 'c':
								
							case 'd':
								
							case 'e':
								
							case 'f':
								
							val = (val << 4) + 10 + aChar - 'a';
							       
							break;
							
							case 'A':
								
							case 'B':
								
							case 'C':
								
							case 'D':
								
							case 'E':
								
							case 'F':
							  
							val = (val << 4) + 10 + aChar - 'A';
							       
							break;
							       
							default:
							
							throw new IllegalArgumentException(
						         
								"Malformed      encoding.");
						    }
							
						}
						
						buffer.append((char) val);
						
						}else{
							
							if(aChar == 't'){
								
								aChar = '\t';
							}
							
							if(aChar == 'r'){
								
								aChar = '\r';
							}
							
							if(aChar == 'n'){
								
								aChar = '\n';
							}
							
							if(aChar == 'f'){
								
								aChar = '\f';
								
							}
							
							buffer.append(aChar);
						}
					
					}else{
						
						buffer.append(aChar);
						
					}
					
				}
			
			return buffer.toString();
			
		}
}
