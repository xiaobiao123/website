package com.goujia.website.base.utils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SMSUtil {

    private static final Logger LOG = LoggerFactory.getLogger(SMSUtil.class);


    /**
     * 生成验证码短信信息
     * 
     * @param code
     * @return
     */
    private static String getValidateMessage(String validationCode) {
        StringBuffer event = new StringBuffer("你的手机");
        return event.append("验证码为：").append(validationCode)
                .append("，请勿泄露，30分钟内有效，如非本人授权或操作，请立即联系客服").toString();
    }

    /**
     * 发送消息
     * 
     * @param phone
     * @param message
     * @return
     */
    public static boolean send(String phone, String message) {
        return sendSMS(phone, message);
    }
    
    /**
     * 发送消息,参数传code
     * 
     * @param phone
     * @param code
     * @return
     */
    public static boolean sendValidate(String phone, String code) {
        return sendSMS(phone, getValidateMessage(code));
    }
    /**
     * 发送短信
     * 
     * @param phone
     * @param content
     * @return
     */
    private static boolean sendSMS(String phone, String content) {
    	if (StringUtil.isBlank(phone) || StringUtil.isBlank(content)){
			return false;
		}
		CloseableHttpClient httpclient = HttpClients.createDefault();
		List<BasicNameValuePair> pairs = new ArrayList<BasicNameValuePair>();
		pairs.add(new BasicNameValuePair("action", "send"));
		pairs.add(new BasicNameValuePair("userid", ""));
		pairs.add(new BasicNameValuePair("password", "152673"));
		pairs.add(new BasicNameValuePair("account", "goujiawang"));
		pairs.add(new BasicNameValuePair("mobile", phone));
		pairs.add(new BasicNameValuePair("content", content.concat("【构家网】")));
		pairs.add(new BasicNameValuePair("sendTime", ""));
		pairs.add(new BasicNameValuePair("extNo", "5567"));
		UrlEncodedFormEntity entity = null;
		try {
			entity = new UrlEncodedFormEntity(pairs, "utf-8");
		} catch (UnsupportedEncodingException e) {
			LOG.error("------------------------------短信发送    new UrlEncodedFormEntity(pairs, Constants.CHARSET)失败----------------------------");
			e.printStackTrace();
			LOG.error(e.getMessage());
			return false;
		}
		HttpPost httppost = new HttpPost("http://sms.chanzor.com:8001/sms.aspx");
		httppost.setEntity(entity);
		httppost.setHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
		RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(5000).setConnectTimeout(5000).build();// 设置请求和传输超时时间
		httppost.setConfig(requestConfig);
		CloseableHttpResponse responseBody = null;
		try {
			responseBody = httpclient.execute(httppost);
		} catch (IOException e) {
			LOG.error("------------------------------短信发送请求失败----------------------------");
			e.printStackTrace();
			LOG.error(e.getMessage());
			return false;
		} finally {
			try {
				responseBody.close();
			} catch (IOException e) {

				e.printStackTrace();
				LOG.error(e.getMessage());
				return false;
			}
		}
		String str = null;
		try {
			str = EntityUtils.toString(responseBody.getEntity());
		} catch (IOException e) {
			LOG.error("------------------------------解析短信响应信息失败----------------------------");
			e.printStackTrace();
			LOG.error(e.getMessage());
			return false;
		} finally {
			try {
				httpclient.close();
			} catch (IOException e) {
				e.printStackTrace();
				LOG.error(e.getMessage());

			}
		}
		
		String a = str.substring(str.indexOf("<successCounts>"),str.indexOf("</successCounts>"));
		String success=a.substring(a.indexOf(">")+1);
		if (success.equals("1")) {
			return true;
		} else {
			return false;
		}
    }

}