package com.goujia.website.console.controller.article;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.goujia.website.base.constants.base.SysConstants;
import com.goujia.website.base.dto.base.ResultDto;
import com.goujia.website.base.entity.article.Article;
import com.goujia.website.base.entity.article.ArticleLabel;
import com.goujia.website.base.entity.article.Label;
import com.goujia.website.base.entity.system.User;
import com.goujia.website.base.entity.system.UserAdmin;
import com.goujia.website.base.entity.topic.Topic;
import com.goujia.website.base.exception.GException;
import com.goujia.website.base.utils.Page;
import com.goujia.website.base.vo.BaseSearchParam;
import com.goujia.website.base.vo.article.ArticleVO;
import com.goujia.website.console.controller.ConsoleController;
import com.goujia.website.console.manager.ArticleManager;
import com.goujia.website.service.article.ArticleLabelService;
import com.goujia.website.service.article.ArticleService;
import com.goujia.website.service.topic.TopicArticleService;


@Controller
@RequestMapping("article")
public class ArticleController extends ConsoleController{
	private Logger logger=LoggerFactory.getLogger(getClass());
	@Autowired
	private ArticleService articleService;
	
	@Autowired
	private ArticleManager articleManager;
	@Autowired
	private ArticleLabelService articleLabelService;
	@Autowired
	private TopicArticleService topicArticleService ;
	@RequestMapping("all/list")
	public String  allList(String name ,Model model,BaseSearchParam param){
		Page<ArticleVO> formal=articleService.findFormalByName(name,param);
		Page<ArticleVO> nullify=articleService.findNullifyByName(name,param);
		model.addAttribute("formal",formal);	
		model.addAttribute("nullify",nullify);
		return "article/list";
	}
	@RequestMapping("formal/list")
	public String  formalList(String name ,Model model,BaseSearchParam param){
		Page<ArticleVO> formal=articleService.findFormalByName(name,param);
		model.addAttribute("formal",formal);
		return "article/formalTab";
	}
	@RequestMapping("nullify/list")
	public String  nullifyList(String name ,Model model,BaseSearchParam param){
		Page<ArticleVO> nullify=articleService.findNullifyByName(name,param);
		model.addAttribute("nullify",nullify);
		return "article/nullifyTab";
	}
	
	@RequestMapping(value="add",method=RequestMethod.GET)
	public String add_forward(Model model){
		return  "article/add";
	}
	
	@RequestMapping(value="add",method=RequestMethod.POST)
	@ResponseBody
	public ResultDto<Object> add(HttpServletRequest request,Article article,String category_label,String technology_label,String material_label,String style_label,String topic_list){
		Gson gson=new Gson();
		
		ResultDto<Object> dto=new ResultDto<Object>();
		dto.setResult(true);
		dto.setMsg("添加成功");
		try{
			if(article.getImagePath()==null || "".equals(article.getImagePath())){
				article.setImagePath(SysConstants.DEFAULT_ARTICLE_HEAD);
			}
			List<Label> category_list=gson.fromJson(category_label, new TypeToken<List<Label>>(){}.getType());
			List<Label> technology_list=gson.fromJson(technology_label, new TypeToken<List<Label>>(){}.getType());
			List<Label> material_list=gson.fromJson(material_label, new TypeToken<List<Label>>(){}.getType());
			List<Label> style_list=gson.fromJson(style_label, new TypeToken<List<Label>>(){}.getType());
			List<Topic> topicList=gson.fromJson(topic_list, new TypeToken<List<Topic>>(){}.getType());
			
			if(article.getArticleName()==null || "".equals(article.getArticleName())){
				throw new GException("文章名不能为空");
			}
			UserAdmin user=(UserAdmin)request.getSession().getAttribute(SysConstants.SESSION_MEMBER_USER);
			article.setUserId(user.getId());
			article.setUserType("admin");
			article.setCollectionNum(0);
			article.setHitNum(0);
			article.setIntroduction("");
			article.setIsDeleted("n");
			article.setIsEssence("n");
			article.setIsTop("n");
			article.setLoveNum(0);
			article.setReportNumber(0);
			article.setShareNum(0);
			article.setShareNum(0);
			
			articleManager.add(category_list,technology_list,material_list,style_list,article,topicList);
		}
		catch(GException e){
			e.printStackTrace();
			dto.setMsg(e.getMessage());
			dto.setResult(false);
			return dto;
		}
		catch(Exception e){
			e.printStackTrace();
			dto.setResult(false);
			dto.setMsg("添加失败");
			return dto;
		}
		return dto;
	}
	
	
	@RequestMapping(value="update",method=RequestMethod.GET)
	public String update_forward(Model model,Integer id){
		model.addAttribute("id",id);
		return  "article/update";
	}
	
	
	@RequestMapping(value="update",method=RequestMethod.POST)
	@ResponseBody
	public ResultDto<Object> update(Article article,String technology_label,String category_label,String material_label,String style_label,String topic_list){
		ResultDto<Object> dto=new ResultDto<Object>();
		dto.setResult(true);
		try{
			if(article.getImagePath()==null || "".equals(article.getImagePath())){
				article.setImagePath(SysConstants.DEFAULT_ARTICLE_HEAD);
			}
			logger.warn("category_label:"+category_label);
			logger.warn("technology_label:"+technology_label);
			logger.warn("material_label:"+material_label);
			logger.warn("style_label:"+style_label);
			articleManager.update(article, category_label, technology_label, material_label, style_label, topic_list);
		}catch(Exception e){
			e.printStackTrace();
			dto.setResult(false);
			dto.setMsg("修改失败");
			return dto;
		}
		dto.setMsg("修改成功");
		return dto;
	}
	@RequestMapping(value="detail",method=RequestMethod.GET)
	public String detail_forward(Model model){
		model.addAttribute("type","detail");
		return  "article/detail";
	}
	@RequestMapping("delete")
	@ResponseBody
	public ResultDto<Object> delete(String idList){
		ResultDto<Object> dto=new ResultDto<Object>();
		try{
			Gson gson=new Gson();
			List<String> list=gson.fromJson(idList, new TypeToken<List<String>>(){}.getType());
			articleService.batchDelete(list);
		}catch(Exception e){
			e.printStackTrace();
			dto.setResult(false);
			dto.setMsg("删除失败");
			return dto;
		}
		dto.setResult(true);
		dto.setMsg("删除成功");
		return dto;
	}
	@RequestMapping("return")
	@ResponseBody
	public ResultDto<Object> returnA(String idList){
		ResultDto<Object> dto=new ResultDto<Object>();
		try{
			Gson gson=new Gson();
			List<String> list=gson.fromJson(idList, new TypeToken<List<String>>(){}.getType());
			articleService.batchReturn(list);
		}catch(Exception e){
			e.printStackTrace();
			dto.setResult(false);
			dto.setMsg("还原失败");
			return dto;
		}
		dto.setResult(true);
		dto.setMsg("还原成功");
		return dto;
	}
	@RequestMapping(value="getOne")
	@ResponseBody
	public ResultDto<ArticleVO> getOne(Integer id){
		ResultDto<ArticleVO> dto=new ResultDto<ArticleVO>();
		try{
			ArticleVO vo=articleService.getById(id);
			logger.warn("article_name:"+vo.getArticleName());
			List<ArticleLabel> list= articleLabelService.findByArticleId(id);
			List<Label> cList=new ArrayList<Label>();
			List<Label> sList=new ArrayList<Label>();
			List<Label> mList=new ArrayList<Label>();
			List<Label> tList=new ArrayList<Label>();
			for(ArticleLabel al:list){
				Label label=al.getLabel();
				if(SysConstants.CATEGORY.equals(label.getPeroperty().getNumber())){
					cList.add(label);
				}
				else if(SysConstants.MATERIAL.equals(label.getPeroperty().getNumber())){
					mList.add(label);
				}
				else if(SysConstants.STYLE.equals(label.getPeroperty().getNumber())){
					sList.add(label);
				}
				else if(SysConstants.TECHNOLOGY.equals(label.getPeroperty().getNumber())){
					tList.add(label);
				}
			}
			vo.setCategoryLabelList(cList);
			vo.setMaterialLabelList(mList);
			vo.setTechnologyLabelList(tList);
			vo.setStyleLabelList(sList);
			vo.setTopicList(topicArticleService.findAllByArticleId(id));
			dto.setObj(vo);
		}
		catch(Exception e){
			e.printStackTrace();
			dto.setMsg("获取失败");
			dto.setResult(false);
			return dto;
		}
		dto.setResult(true);
		return dto;
	}
}
