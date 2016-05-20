/**
 * Copyright 2014-2015 goujia.com
 * All rights reserved.
 * 
 * @project
 * @author fengchun
 * @version 1.0
 * @date 2014-07-02
 */
package com.goujia.website.base.ges;

import java.io.IOException;
import java.util.Date;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.goujia.goujiabao.Constants;
import com.goujia.goujiabao.model.GJWAnsAffirm;
import com.goujia.goujiabao.model.GYJCancelOrder;
import com.goujia.goujiabao.model.GYJQueryOrder;
import com.goujia.goujiabao.model.GYJQueryOrderPayment;
import com.goujia.goujiabao.model.GYJRequest;
import com.goujia.goujiabao.model.GYJResponse;
import com.goujia.goujiabao.util.Base64;
import com.goujia.goujiabao.util.Tool;
import com.goujia.goujiabao.util.XMLUtil;

/**
 * 
 * @author fengchun
 *
 */
public class GYJBusiness {
	private static final Logger LOG = LoggerFactory.getLogger(GYJBusiness.class);
	private String noticeURL;
	private String tradePath;
	private String merid;
	private String mername;
	private String password;
	
	
	
	
	public String getNoticeURL() {
		return noticeURL;
	}

	public void setNoticeURL(String noticeURL) {
		this.noticeURL = noticeURL;
	}

	public void setTradePath(String tradePath) {
		this.tradePath = tradePath;
	}

	public void setMerid(String merid) {
		this.merid = merid;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTradePath() {
		return tradePath;
	}

	public String getMerid() {
		return merid;
	}

	public String getPassword() {
		return password;
	}

	public String getMername() {
		return mername;
	}

	public void setMername(String mername) {
		this.mername = mername;
	}
	
	/**
	 * 订单作废
	 * 未开始冻结的订单才能作废成功
	 * 
	 * @param orderId
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("finally")
	public GYJCancelOrder cancelOrder(String orderId) throws Exception {
		GYJRequest request = new GYJRequest();
		request.setMerid(merid);
		request.setTrancode(GYJTradeCode.GYJODRCANCEL.name());
		
		String transtime = Tool.formatTime(new Date());
		String reqdata = "<GYJ>"+
				"<transtime>"+transtime+"</transtime>"+        //<!--和服务器时间间隔前后不超过15分钟,必输-->
				"<orderid>"+orderId+"</orderid>"+	           //<!--长度不超过35位,一个商户永不重复,必输-->
				"</GYJ>";
		request.setReqdata(reqdata);
		request.signature(reqdata, password , transtime);
		
		GYJCancelOrder order = null;
		CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
        	UrlEncodedFormEntity entity = new UrlEncodedFormEntity(Tool.convertToList(request), Constants.CHARSET);
        	HttpPost httppost = new HttpPost(GYJTradeCode.GYJODRCANCEL.getTradeURL(tradePath));
        	httppost.setEntity(entity);
        	
        	// Create a custom response handler
            ResponseHandler<String> responseHandler = new ResponseHandler<String>() {
                public String handleResponse(final HttpResponse response) throws ClientProtocolException, IOException {
                    int status = response.getStatusLine().getStatusCode();
                    if (status >= 200 && status < 300) {
                        HttpEntity entity = response.getEntity();
                        return entity != null ? EntityUtils.toString(entity) : null;
                    } else {
                        throw new ClientProtocolException("Unexpected response status: " + status);
                    }
                }
            };
            
            String responseBody = httpclient.execute(httppost, responseHandler);
            GYJResponse<GYJCancelOrder> response = new GYJResponse<GYJCancelOrder>(responseBody);
            order = (GYJCancelOrder) response.getData(GYJCancelOrder.class);
            
        } finally {
            httpclient.close();
            
            return order;
        }
	}
	
	
	/**
	 * 查询订单支付结果接口
	 * @param orderId
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("finally")
	public GYJQueryOrder queryOrder(String orderId) throws Exception {
		LOG.info("------------------------------查询订单支付开始------------------");
		GYJRequest request = new GYJRequest();
		request.setMerid("test1");
		request.setTrancode(GYJTradeCode.GYJODRQRY.name());
		
		String transtime = Tool.formatTime(new Date());
		String reqdata = "<GYJ>"+
				"<transtime>"+transtime+"</transtime>"+        //<!--和服务器时间间隔前后不超过15分钟,必输-->
				"<orderid>"+orderId+"</orderid>"+	           //<!--长度不超过35位,一个商户永不重复,必输-->
				"</GYJ>";
		request.setReqdata(reqdata);
		
		request.signature(reqdata, "111111" , transtime);
		
		GYJQueryOrder order = null;
		CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
        	UrlEncodedFormEntity entity = new UrlEncodedFormEntity(Tool.convertToList(request), Constants.CHARSET);
        	HttpPost httppost = new HttpPost(GYJTradeCode.GYJODRQRY.getTradeURL("web.zj.icbc.com.cn/cashiertest/"));
        	LOG.info("------------------------------http url------------------"+GYJTradeCode.GYJODRQRY.getTradeURL("web.zj.icbc.com.cn/cashiertest/"));
        	httppost.setEntity(entity);
        	
        	// Create a custom response handler
            ResponseHandler<String> responseHandler = new ResponseHandler<String>() {
                public String handleResponse(final HttpResponse response) throws ClientProtocolException, IOException {
                	LOG.info("------------------------------resposee ------------------"+response);
                	LOG.info("------------------------------resposee status------------------"+response.getStatusLine().getStatusCode());
                    int status = response.getStatusLine().getStatusCode();
                    if (status >= 200 && status < 300) {
                        HttpEntity entity = response.getEntity();
                        return entity != null ? EntityUtils.toString(entity) : null;
                    } else {
                        throw new ClientProtocolException("Unexpected response status: " + status);
                    }
                }
            };
            
            String responseBody = httpclient.execute(httppost, responseHandler);
            GYJResponse<GYJQueryOrder> response = new GYJResponse<GYJQueryOrder>(responseBody);
            LOG.info("------------------------------resposee response------------------"+response);
            order = (GYJQueryOrder) response.getData(GYJQueryOrder.class);
            LOG.info("------------------------------resposee order------------------"+order.getMervar());
        } finally {
            httpclient.close();
            
            return order;
        }
	}
	
	
	
	/**
	 * 信用支付查询
	 * @param orderId
	 * @param repayId
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("finally")
	public GYJQueryOrderPayment queryOrderPayment(String orderId, String repayId) throws Exception {
		GYJRequest request = new GYJRequest();
		request.setMerid(merid);
		request.setTrancode(GYJTradeCode.GYJCREDQRY.name());
		
		String transtime = Tool.formatTime(new Date());
		String reqdata = "<GYJ>"+
				"<transtime>"+transtime+"</transtime>"+        //<!--和服务器时间间隔前后不超过15分钟,必输-->
				"<orderid>"+orderId+"</orderid>"+	           //<!--长度不超过35位,一个商户永不重复,必输-->
			//**************	"<repayid>"+(Tool.isEmpty(repayId)?"":repayId)+"</repayid>"+
				"</GYJ>";
		request.setReqdata(reqdata);
		
		request.signature(reqdata, password , transtime);
		
		GYJQueryOrderPayment order = null;
		CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
        	UrlEncodedFormEntity entity = new UrlEncodedFormEntity(Tool.convertToList(request), Constants.CHARSET);
        	HttpPost httppost = new HttpPost(GYJTradeCode.GYJCREDQRY.getTradeURL("cashier.gyj.com/cashier/"));
        	httppost.setEntity(entity);
        	
        	// Create a custom response handler
            ResponseHandler<String> responseHandler = new ResponseHandler<String>() {
                public String handleResponse(final HttpResponse response) throws ClientProtocolException, IOException {
                    int status = response.getStatusLine().getStatusCode();
                    if (status >= 200 && status < 300) {
                        HttpEntity entity = response.getEntity();
                        return entity != null ? EntityUtils.toString(entity) : null;
                    } else {
                        throw new ClientProtocolException("Unexpected response status: " + status);
                    }
                }
            };
            
            String responseBody = httpclient.execute(httppost, responseHandler);
            GYJResponse<GYJQueryOrderPayment> response = new GYJResponse<GYJQueryOrderPayment>(responseBody);
            order = (GYJQueryOrderPayment) response.getData(GYJQueryOrderPayment.class);
        } finally {
            httpclient.close();
            return order;
        }
	}
	
	
	/**
	 * 保证金确认支付
	 * 
	 * @param orderId
	 * @param repayId
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("finally")
	public GJWAnsAffirm verifyCashDeposit(String xmlStr,String signature) throws Exception {
		GJWAnsAffirm order = null;
		CloseableHttpClient httpclient = HttpClients.createDefault();
		try {
			//http://www.webxml.com.cn/WebServices/TranslatorWebService.asmx?disco
			HttpPost httppost = new HttpPost("http://109.6.13.1:12074?reqdata="+xmlStr+"&signature="+signature+"&charset=utf-8" );
			CloseableHttpResponse responseBody = httpclient.execute(httppost);
			String stringXml=EntityUtils.toString(responseBody.getEntity());
			System.out.println("#######################################################"
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ "="+Base64.decode(stringXml));
			order=	(GJWAnsAffirm) XMLUtil.parseXML(Base64.decode(stringXml), new GJWAnsAffirm());
		} finally {
			httpclient.close();
			return order;
		}
	}
}
