package com.goujia.website.base.ges;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.goujia.goujiabao.Constants;
import com.goujia.goujiabao.model.GYJQueryOrder;
import com.goujia.goujiabao.util.Base64;
import com.goujia.goujiabao.util.Tool;

public class GYJNoticeOrderRequest {
	private static final Logger LOG = LoggerFactory.getLogger(GYJNoticeOrderRequest.class);
	private GYJQueryOrder data;
	String rawData = null;
	String reqData = null;
	String signature = null;

	boolean hasError = false;

	public GYJNoticeOrderRequest(String rawData, String signature) {
		LOG.info("----------------------------rawData+"+rawData);
		LOG.info("----------------------------signature+"+signature);
		if (Tool.isEmpty(signature) || Tool.isEmpty(rawData)) {
			hasError = true;

		} else {
			this.rawData = rawData.replaceAll("[\n\r]", "");
			this.reqData = Base64.decode(rawData, Constants.CHARSET);
			this.signature = signature;
		}
	}

	public GYJQueryOrder getData(String uid, String pwd) {
		if (hasError)
			return null;
		if (data != null)
			return data;

		data = Tool.xmlToBean(reqData, GYJQueryOrder.class);
		if (data == null)
			return null;

		String sign = Tool.returnMd5(reqData, uid,
				data.getOrderid(), Constants.CHARSET, pwd,
				data.getTranstime());
		LOG.info("----------------------------sign+"+sign);
		LOG.info("----------------------------uid+"+uid);
		LOG.info("----------------------------pwd+"+pwd);
		LOG.info("----------------------------signature+"+signature);
		if(this.signature.equals(sign)) return data;

		data = null;
		return null;
	}

	public String getReqData() {
		return reqData;
	}
	
	
}
