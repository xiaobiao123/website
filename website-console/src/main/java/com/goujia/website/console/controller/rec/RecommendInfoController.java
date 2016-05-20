package com.goujia.website.console.controller.rec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goujia.website.base.entity.rec.RecommendInfo;
import com.goujia.website.base.vo.rec.RecommendInfoSearchParam;
import com.goujia.website.base.vo.rec.RecommendInfoVO;
import com.goujia.website.console.controller.ConsoleController;
import com.goujia.website.service.rec.RecommendInfoService;

/**
 * Copyright 2014-2015 www.goujiawang.com
 * All rights reserved.
 * 
 * @project website-console
 * @author Wangfeng
 * @version 2.0
 * @date 2015年6月4日
 */
@Controller
@RequestMapping("/rec/info")
public class RecommendInfoController extends ConsoleController{
	
	@Autowired
	private RecommendInfoService recommendInfoService;
	
	@RequestMapping("/index")
	public String index(RecommendInfoSearchParam searchParam, Model model){
		
		model.addAttribute("page", recommendInfoService.search(initSearchParam(searchParam)));
		model.addAttribute("searchParam", searchParam);
		return "rec/rec-info";
	}
	
	@RequestMapping("/detail")
	public String detail(Integer recId, Model model){
		
		if(recId != null){
			RecommendInfoVO recommendInfoVO = recommendInfoService.get(recId);
			model.addAttribute("recommendInfo", recommendInfoVO);
		}else{
			model.addAttribute("recommendInfo", new RecommendInfo());
		}
		return "rec/rec-info-detail";
	}

	@RequestMapping("/save")
	@ResponseBody
	public Object[] save(RecommendInfo recommendInfo){
		Object[] obj = new Object[3];
		Boolean isSucced =Boolean.FALSE;
		String msg = "";
		if(recommendInfo != null){
			if(recommendInfo.getRecId() == null){
				recommendInfo.setCreateUser(getUser().getUserName());
				recommendInfoService.insert(recommendInfo);
			}else{
				recommendInfoService.update(recommendInfo);
			}
			isSucced = Boolean.TRUE;
		}
		obj[0] = isSucced;
		obj[1] = msg;
		return obj;
	}
	
	@RequestMapping("/findRecInfosByPosCode")
	@ResponseBody
	public Object[] findRecInfosByPosCode(String posCode){
		Object[] obj = new Object[3];
		Boolean isSuccess = Boolean.FALSE;
		String msg = "";
		
		try{
			obj[2] = recommendInfoService.findRecomendsByPosition(posCode);
			isSuccess = Boolean.TRUE;
		}catch(Exception e){
			isSuccess = Boolean.FALSE;
			msg = "查询失败，请稍后再试";
		}
		
		obj[0] = isSuccess;
		obj[1] = msg;
		
		return obj;
	}
	
	private RecommendInfoSearchParam initSearchParam(RecommendInfoSearchParam searchParam) {
		if(searchParam == null){
			searchParam = new RecommendInfoSearchParam();
		}
		return searchParam;
	}
}
