package com.goujia.website.base.resolver;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

public class CommonsMultipartResolverExclude extends CommonsMultipartResolver{

	@Override
	public boolean isMultipart(HttpServletRequest request) {
		if(request==null)
			return false;
		String uri=request.getRequestURI();
		if(uri.endsWith("uedit/execute.htm") || uri.endsWith("uedit/execute.html")){
			return false;
		}
		return 	ServletFileUpload.isMultipartContent(request);
		
	}
	
}
