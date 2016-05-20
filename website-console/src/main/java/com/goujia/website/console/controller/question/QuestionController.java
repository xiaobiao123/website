package com.goujia.website.console.controller.question;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goujia.website.base.entity.question.Question;
import com.goujia.website.base.vo.article.LabelVO;
import com.goujia.website.base.vo.question.QuestionSearchParam;
import com.goujia.website.console.controller.ConsoleController;
import com.goujia.website.service.article.LabelService;
import com.goujia.website.service.question.QuestionService;

/**
 * Copyright 2014-2015 www.goujiawang.com All rights reserved.
 * 
 * @project website-console
 * @version 2.0
 * 
 *          方法描述：问题control类
 * 
 * @author zhaoyonglian 15-6-3
 * 
 */

@Controller
@RequestMapping("/question")
public class QuestionController extends ConsoleController {
	@Autowired
	private QuestionService service;

	@Value("${website_column}")
	private String website_column;

	@Autowired
	private LabelService labelService;

	/**
	 * 方法描述：增加问题
	 * 
	 * @param question
	 *            问题对象
	 * @return 增加结果 true/false
	 * @author zhaoyonglian 15-6-4
	 */
	@RequestMapping("/create")
	@ResponseBody
	public Object[] create(Question question, HttpServletRequest request) {
		Object[] obj = new Object[2];
		Boolean isSuccess = Boolean.FALSE;
		String msg = "添加失败！请稍后再试！";
		if (null != question) {
			isSuccess = service.create(question);
		}
		if (isSuccess) {
			msg = "添加成功！";
		}
		obj[0] = isSuccess;
		obj[1] = msg;
		return obj;
	}

	/**
	 * 方法描述:查看问题详情或者增加问题
	 * 
	 * @param id
	 *            问题ID
	 * @param request
	 *            请求
	 * @param model
	 *            放数据
	 * @return 详情界面或者增加界面
	 * @author zhaoyonglian 15-6-4
	 */
	@RequestMapping("/details")
	public String details(Integer id, HttpServletRequest request, Model model) {
		List<LabelVO> labels = labelService.findAllChildByParent(Integer
				.valueOf(website_column));
		model.addAttribute("labels", labels);
		if (null != id) {
			model.addAttribute("question", service.get(id));
			return "question/details"; // 详情界面
		} else {
			model.addAttribute("question", new Question());
			return "question/add"; // 增加界面
		}
	}

	/**
	 * 方法描述：更新问题
	 * 
	 * @param question
	 *            问题对象
	 * @return 是否成功 true/false
	 * @author zhaoyonglian 15-9-4
	 */
	@RequestMapping("/update")
	@ResponseBody
	public Object[] update(Question question, HttpServletRequest request,
			Model model) {
		Object[] obj = new Object[2];
		Boolean isSuccess = Boolean.FALSE;
		String msg = "编辑失败！请稍后再试！";
		if (null != question.getId()) {
			isSuccess = service.update(question);
		}
		if (isSuccess) {
			msg = "编辑成功！";
		}
		obj[0] = isSuccess;
		obj[1] = msg;
		return obj;
	}

	/**
	 * 方法描述：分页查询列表
	 * 
	 * @param 分页查询对象
	 * @return 列表
	 * @author zhaoyonglian 15-6-4
	 */
	@RequestMapping("/question")
	public String search(QuestionSearchParam searchParam,
			HttpServletRequest request, Model model) {
		model.addAttribute("page", service.search(searchParam));
		model.addAttribute("searchParam", searchParam);
		if (searchParam.getIsDeleted().contains("y")) {
			return "question/questionDelete";
		} else {
			return "question/question";
		}
	}

	/**
	 * 方法描述：批量或者单个删除问题
	 * 
	 * @param ids
	 *            问题ID字符串
	 * @return 成功/失败提醒
	 * @author zhaoyonglian 15-6-3
	 */
	@RequestMapping("/deleteByIds")
	@ResponseBody
	public String deleteByIds(@RequestParam String ids) {
		return service.deleteByIds(ids);
	}

	/**
	 * 方法描述:批量或者单个作废问题
	 * 
	 * @param ids
	 *            问题ID字符串
	 * @return 成功/失败提醒
	 * @author zhaoyonglian 15-6-3
	 */
	@RequestMapping("/disableByIds")
	@ResponseBody
	public String disableByIds(String ids) {
		String msg = service.disableByIds(ids);
		return msg;
	}
}
