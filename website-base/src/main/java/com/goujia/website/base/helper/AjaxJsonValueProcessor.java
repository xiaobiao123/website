/**
 * Copyright 2014-2015 www.goujiawang.com
 * All rights reserved.
 * 
 * @project
 * @author Flouny.Caesar
 * @version 2.0
 * @date 2014-11-26
 */
package com.goujia.website.base.helper;

import java.util.Date;

import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;

import com.goujia.website.base.utils.DateUtil;
import com.goujia.website.base.utils.EscapeUtil;

/**
 * 
 * @author Flouny.Caesar
 *
 */
public class AjaxJsonValueProcessor implements JsonValueProcessor {
	
	public Object processArrayValue(Object value, JsonConfig arg1) {
		String[] obj = {};
		
        if (value instanceof Date[]) {
        	Date[] dates = (Date[])value;
        	obj = new String[dates.length];
        	
        	for (int i = 0; i < dates.length; i++) {
        		obj[i] = DateUtil.format(dates[i]);
        	}
        } else if (value instanceof String[]) {
        	String[] str = (String[])value;
        	obj = new String[str.length];
        	
        	for (int i = 0; i < str.length; i++) {
        		obj[i] = EscapeUtil.escapeJavaScript(str[i]);
            }
        }
        
        return obj;
	}

	public Object processObjectValue(String key, Object value, JsonConfig arg2) {
		
		if(value instanceof Date) {
			
			return DateUtil.format((Date)value);
		} else if (value instanceof String) {
			return EscapeUtil.escapeJavaScript((String)value);
        }
		
        return value;
	}
}