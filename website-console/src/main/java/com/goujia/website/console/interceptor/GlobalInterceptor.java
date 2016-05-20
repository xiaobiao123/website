package com.goujia.website.console.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.goujia.website.console.controller.ConsoleController;

/**
 * Controller统一处理拦截器
 * 
 * 登录判断
 * 性能监控
 */
public class GlobalInterceptor extends HandlerInterceptorAdapter {
	
	public static final String GLOBAL_RESOURCE_ENTITY = "GLOBAL_RESOURCE_ENTITY";
	public static final String GLOBAL_RESOURCE_TREE = "GLOBAL_RESOURCE_TREE";
	
	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {
		
		
		Object action = getAction(obj);
		String methodName = getMethodName(obj);
		String actionName = action.getClass().getSimpleName();
		logger.info("action name is {}, method name is {}", actionName, methodName);
		
		if (action instanceof ConsoleController) {
			/*Tree<Resource> resTree = resService.getResourceTree();
			request.setAttribute(GLOBAL_RESOURCE_TREE, resTree);
			//generateResourceData(requestURI, actionName, methodName);
			Resource res = findResourceData(actionName);
			if (res != null) {
				request.setAttribute(GLOBAL_RESOURCE_ENTITY, res);
				Map<String, Object> resPermMap = JSONUtils.jsonToMap(res.getResDesc());
				if (resPermMap.keySet().contains(methodName)) {
					logger.info("checking permission of resource : {}", actionName + ":" + methodName);
					//if (!SecurityUtils.getSubject().isPermitted(actionName + ":" + methodName))
					//	throw new AuthorizationException("not permitted to view this page");
				}
			}*/
		}

		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		
	}

	private String getMethodName(Object handler) {
		if (handler instanceof HandlerMethod) {
			HandlerMethod m = (HandlerMethod) handler;
			return m.getMethod().getName();
		} else
			return handler.toString();
	}

	private Object getAction(Object obj) {
		if (obj instanceof HandlerMethod) {
			HandlerMethod m = (HandlerMethod) obj;
			return m.getBean();
		} else
			return obj;
	}

}
