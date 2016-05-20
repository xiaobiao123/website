/**
 * Copyright 2014-2015 goujiawang.com
 * All rights reserved.
 * 
 * @project
 * @author Flouny.Caesar
 * @version 2.0
 * @date 2014-05-12
 */
package com.goujia.website.base.helper;

import java.util.Date;

import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;

import com.goujia.website.base.utils.DateUtil;

public class JsonValueProcessorImpl implements JsonValueProcessor {
	
	public Object processArrayValue(Object value, JsonConfig arg1) {
		String[] obj = {};
		
		if(value instanceof Date[]) {
			Date[] dates = (Date[])value;
			obj = new String[dates.length];
			for (int i = 0; i < dates.length; i++) {
				obj[i] = DateUtil.format(dates[i]);
			}
		}
		
		return obj;
	}
	
	public Object processObjectValue(String key, Object value, JsonConfig arg2) {
		if(value instanceof Date) {
			
			return DateUtil.format((Date)value);
		}
		
		return value;
	}
}