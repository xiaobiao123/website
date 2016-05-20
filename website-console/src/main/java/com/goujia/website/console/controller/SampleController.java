package com.goujia.website.console.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.goujia.website.base.vo.specialtopic.SpecialTopicSearchParam;
import com.goujia.website.service.specialtopic.SpecialTopicService;
import com.goujia.website.service.system.UserService;

/**
 * Copyright 2014-2015 www.goujiawang.com
 * All rights reserved.
 * 
 * @project website-console
 * @author Wangfeng
 * @version 2.0
 * @date 2015年5月28日
 */
@Controller
@RequestMapping("sample")
public class SampleController extends ConsoleController{
	@Autowired
	private UserService userService;
	@Autowired
	private SpecialTopicService specialTopicService;
	
	@RequestMapping("exception")
	public void exception(Model model) throws Exception{
		throw new Exception("sample exception message");
	}

	@RequestMapping("sample")
	public String sample(HttpServletRequest request, Model model){
		
		model.addAttribute("user", userService.get(1));
		model.addAttribute("page", specialTopicService.search(new SpecialTopicSearchParam()));
		return "sample";
	}
	
}
