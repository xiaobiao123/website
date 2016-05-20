package com.goujia.website.console.controller;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.velocity.app.FieldMethodizer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.servlet.ModelAndView;

import com.goujia.website.base.constants.base.SysConstants;
import com.goujia.website.base.entity.system.UserAdmin;
import com.goujia.website.service.system.MenuService;


/**
 * 后台控制器类，需要用户登录及权限控制的均应继承该类
 */
public class ConsoleController implements Prepareable{
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private UserAdmin user;
	@Autowired
	private MenuService menuService;
	@Value("${review.image}")
	private String reviewImagePath;

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		//binder.registerCustomEditor(String.class, new EscapedStringEditor(binder.getObjectName()));
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
		binder.registerCustomEditor(Timestamp.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"), true));
	}
	
	@Override
	public void prepare(HttpServletRequest servletRequest, HttpServletResponse servletResponse) {

		try {
			user = (UserAdmin) servletRequest.getSession().getAttribute(SysConstants.SESSION_MEMBER_USER);
		} catch (Exception e) {
			logger.info("can't find memberbind from session");
		}

	}

	@Override
	public void postData(HttpServletRequest servletRequest, HttpServletResponse servletResponse, ModelAndView modelAndView) {
		
		//TODO for test
		//servletRequest.getSession().setAttribute(SysConstants.SESSION_MEMBER_USER, login());
	    user = (UserAdmin) servletRequest.getSession().getAttribute(SysConstants.SESSION_MEMBER_USER);
		//get方法
		if(user != null) {
			modelAndView.addObject("currentUser", this.getUser());
			modelAndView.addObject("menus", menuService.getAll());
		}
		modelAndView.addObject("SysConstants", new FieldMethodizer( new SysConstants() ) );
		modelAndView.addObject("reviewImagePath", reviewImagePath);
		modelAndView.addObject("timestamp",Calendar.getInstance().getTimeInMillis());
		servletResponse.setHeader("Pragma","No-cache");  
		servletResponse.setHeader("Cache-Control","no-cache");  
		servletResponse.setDateHeader("Expires", 0);  
	}
	
    // private UserBind login(){
    // UserBind user = new UserBind();
    // user.setUserName("test");
    // user.setRealName("管理员");
    // return user;
    // }
	
	public UserAdmin getUser() {return user;}
	public void setUser(UserAdmin user) {this.user = user;}
}