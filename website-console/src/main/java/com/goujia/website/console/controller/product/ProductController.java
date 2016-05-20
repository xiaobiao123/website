package com.goujia.website.console.controller.product;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goujia.website.base.entity.article.ArticleGoods;
import com.goujia.website.base.ges.entity.AreaResource;
import com.goujia.website.base.ges.vo.GoodsBuildingVO;
import com.goujia.website.base.utils.Page;
import com.goujia.website.base.vo.BaseSearchParam;
import com.goujia.website.console.controller.ConsoleController;
import com.goujia.website.service.article.ArticleGoodsService;
import com.goujia.website.service.ges.AreaResourceService;
import com.goujia.website.service.ges.GoodsService;


@Controller
@RequestMapping("product")
public class ProductController extends ConsoleController{
	private Logger logger=LoggerFactory.getLogger(getClass());
	@Autowired
	private AreaResourceService areaResourceService;
	@Autowired
	private GoodsService goodsService;
	@Autowired
	private ArticleGoodsService articleGoodsService;
	@RequestMapping("list")
	public String list(Integer articleId,String name,Model model){
		BaseSearchParam param=new BaseSearchParam();
		param.setPageSize(10);
		param.setPageNo(0);
		Integer cityId=1213;
        AreaResource area = new AreaResource();
        List<AreaResource> listArea = areaResourceService.list(area);
        Page<GoodsBuildingVO> page=goodsService.listByCityAndName(cityId,name,param);
        List<Integer> checkedList=articleGoodsService.getAllByArticle(articleId);
        Set<Integer> checkedSet=new HashSet<Integer>();
        for(Integer id:checkedList){
        	checkedSet.add(id);
        }
        for(GoodsBuildingVO vo:page.getResult()){
        	if(checkedSet.contains(vo.getId())){
        		vo.setChecked(true);
        	}
        	else{
        		vo.setChecked(false);
        	}
        }
        model.addAttribute("articleId", articleId);
        model.addAttribute("listArea", listArea);
        model.addAttribute("list",page);
		return "product/list";
	}
	@RequestMapping("sublist")
	public String sublist(Integer articleId,String name,Integer cityId,Model model,BaseSearchParam param){
		 Page<GoodsBuildingVO> page=goodsService.listByCityAndName(cityId,name,param);
	        List<Integer> checkedList=articleGoodsService.getAllByArticle(articleId);
	        Set<Integer> checkedSet=new HashSet<Integer>();
	        for(Integer id:checkedList){
	        	checkedSet.add(id);
	        }
	        for(GoodsBuildingVO vo:page.getResult()){
	        	if(checkedSet.contains(vo.getId())){
	        		vo.setChecked(true);
	        	}
	        	else{
	        		vo.setChecked(false);
	        	}
	        }
        model.addAttribute("list",page);
		return "product/sublist";
	}
	@RequestMapping("changeRelate")
	@ResponseBody
	public Boolean changeRelate(ArticleGoods item,Boolean checked){
		try{
			if(checked){
				articleGoodsService.add(item);
			}
			else{
				articleGoodsService.realDel(item);
			}
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
