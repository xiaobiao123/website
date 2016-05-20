package com.goujia.website.console.controller.topic;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goujia.website.console.controller.ConsoleController;
import com.goujia.website.service.topic.TopicArticleService;

@Controller
@RequestMapping("/topic/article")
public class TopicArticleController extends ConsoleController {

	@Autowired
	private TopicArticleService topicArticleService;

	@RequestMapping("info")
	public String detail(Integer topicId,
			HttpServletRequest request, Model model) {
		model.addAttribute("listTop", topicArticleService.list(topicId));
		model.addAttribute("topicId", topicId);
		return "topic/info";
	}
	
	/**删除话题*//*
	@RequestMapping("delete")
	public String deleteTopic(Integer[] idstr){
		if(idstr != null){
		
			for(Integer id :idstr){
				topicArticleService.delete(id);
			}
		}
		
		//return topicService.delbatch(id);
		return "redirect:info.htm";
		
	}*/
	 /**
     * 方法描述:批量或者单个作废问题
     * 
     * @param ids
     *            问题答案ID字符串
     * @return 成功/失败提醒
     * @author zyq 
     */
    @RequestMapping("/delete")
    @ResponseBody
    public String delete(@RequestParam String ids) {
        return topicArticleService.delete(ids);
    }
	
	
}
