package com.goujia.website.console.controller.rec;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goujia.website.base.entity.rec.RecommendPosition;
import com.goujia.website.base.vo.rec.RecommendPositionSearchParam;
import com.goujia.website.console.controller.ConsoleController;
import com.goujia.website.service.rec.RecommendPositionService;

/**
 * Copyright 2014-2015 www.goujiawang.com All rights reserved.
 * 
 * @project website-console
 * @author Wangfeng
 * @version 2.0
 * @date 2015年6月2日
 */
@Controller
@RequestMapping("/rec/pos")
public class RecommendPositionController extends ConsoleController {

	@Autowired
	private RecommendPositionService recommendPositionService;

	@RequestMapping("/index")
	public String index(RecommendPositionSearchParam searchParam,
			HttpServletRequest request, Model model) {

		model.addAttribute("page", recommendPositionService.search(searchParam));
		model.addAttribute("searchParam", searchParam);
		return "rec/index";
	}

	@RequestMapping("/detail")
	public String detail(Integer posId, HttpServletRequest request, Model model) {

		if (posId != null) {
			model.addAttribute("recommendPosition",
					recommendPositionService.get(posId));
		} else {
			model.addAttribute("recommendPosition", new RecommendPosition());
		}

		return "rec/detail";
	}

	@RequestMapping("/save")
	@ResponseBody
	public Object[] save(RecommendPosition recommendPosition,
			HttpServletRequest request, Model model) {
		Object[] obj = new Object[2];
		Boolean isSuccess = Boolean.FALSE;
		String msg = "";

		if (recommendPosition != null) {
			if (recommendPosition.getPosId() != null) {
				recommendPositionService.update(recommendPosition);
			} else {
				recommendPositionService.create(recommendPosition);
			}
			isSuccess = Boolean.TRUE;
			msg = "保存成功";
		}

		obj[0] = isSuccess;
		obj[1] = msg;

		return obj;
	}

	@RequestMapping("/findRecPos")
	@ResponseBody
	public Object[] findRecPos() {
		Object[] obj = new Object[3];
		Boolean isSuccess = Boolean.FALSE;
		String msg = "";

		try {
			RecommendPositionSearchParam searchParam = new RecommendPositionSearchParam();
			obj[2] = recommendPositionService.list(searchParam);
			isSuccess = Boolean.TRUE;
		} catch (Exception e) {
			isSuccess = Boolean.FALSE;
			msg = "查询失败，请稍后再试";
		}

		obj[0] = isSuccess;
		obj[1] = msg;

		return obj;
	}
}
