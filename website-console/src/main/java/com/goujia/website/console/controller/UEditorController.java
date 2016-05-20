/**
 * Copyright 2014-2015 www.goujiawang.com
 * All rights reserved.
 * 
 * @project
 * @author jipengfei
 * @version 2.0
 * @date 2015-01-04
 */
package com.goujia.website.console.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.baidu.ueditor.ActionEnter;
import com.google.gson.Gson;

/**
 * Created by Wangfeng
 * 2015.6.1
 */

@Controller
@RequestMapping("uedit")
public class UEditorController {
	@Value("${store.image}")
	private String storeImagePath;
	@Value("${review.image}")
	private String reviewImagePath;
	
	private final Logger LOG = LoggerFactory.getLogger(UEditorController.class);

    @RequestMapping("execute")
    @ResponseBody
    public String execute(HttpServletRequest request,HttpServletResponse response){
    	String result=null;
    	StringBuffer sb=new StringBuffer();
    	try{
    		response.setHeader("Content-Type" , "text/html");
        	result=new ActionEnter( request, storeImagePath ).exec();
        	int i=result.indexOf("/ueditor");
        	if(i!=-1){
        		sb.append(result.substring(0,i));
        		sb.append(reviewImagePath);
            	sb.append(result.substring(i, result.length()));
        	}
        	else{
        		sb.append(result);
        	}
        	LOG.warn("ueditor_path:"+sb.toString());
    	}
    	catch(Exception e){
    		e.printStackTrace();
    	}
    	return sb.toString();
    	
    }
}