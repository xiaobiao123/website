package com.goujia.website.console.controller.label;

import java.util.List;

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
import com.goujia.website.base.dto.label.LabelDto;
import com.goujia.website.base.entity.article.Label;
import com.goujia.website.base.entity.dict.Dictionary;
import com.goujia.website.base.exception.GException;
import com.goujia.website.base.utils.Page;
import com.goujia.website.base.vo.article.LabelSearchParam;
import com.goujia.website.base.vo.article.LabelVO;
import com.goujia.website.console.controller.ConsoleController;
import com.goujia.website.console.manager.LabelManager;
import com.goujia.website.service.article.LabelService;

@Controller
@RequestMapping("/label")

public class LabelController extends ConsoleController {
	
	@Autowired
	private LabelService labelService;
	@Autowired
	private LabelManager labelManager;
	/**
	 * @param label
	 * @return  Integer
	 */
	@RequestMapping("create")
	@ResponseBody
	public  ResultDto<Object> addLabel(Label label){
		ResultDto<Object> dto=new ResultDto<Object>();
		try{
			label.setUserdAmount(0);
			label.setIsDeleted("n");
			labelService.create(label);
		}catch(Exception e){
			e.printStackTrace();
			dto.setResult(false);
			dto.setMsg("创建失败");
			return dto;
		}
		dto.setResult(true);
		dto.setMsg("创建成功");
		return dto;
	}
	@RequestMapping("detail")
	public String getDetail(Integer id,Model model){
		model.addAttribute("label", labelService.get(id));
		return "label/detail";
	}
	
	/**
	 * @param id
	 * @return
	 */
	@RequestMapping("delete")
	@ResponseBody
	public  ResultDto<Object> deleteLabel(String idList){
		ResultDto<Object> dto=new ResultDto<Object>();
		try{
			Gson gson=new Gson();
			List<Integer> list=gson.fromJson(idList, new TypeToken<List<Integer>>(){}.getType());
			List<Label> error=labelManager.delete(list);
			if(error.size()>0){
				StringBuffer sb=null;
				if(list.size()==error.size()){
					sb=new StringBuffer("删除失败,");
				}
				else{
					sb=new StringBuffer("删除成功，其中");
				}
				for(Label item:error){
					sb.append("[");
					sb.append(item.getName());
					sb.append("]");
				}
				sb.append("为一级标签，且子标签非空，不能删除");
				dto.setMsg(sb.toString());
			}
			else{
				dto.setMsg("删除成功");
			}
			
		}catch(Exception e){
			e.printStackTrace();
			dto.setResult(false);
			dto.setMsg("删除失败");
			return dto;
		}
		dto.setResult(true);
		return dto;
	}
	@RequestMapping("reuse")
	@ResponseBody
	public  ResultDto<Object> reUse(String idList){
		ResultDto<Object> dto=new ResultDto<Object>();
		try{
			Gson gson=new Gson();
			List<Integer> list=gson.fromJson(idList, new TypeToken<List<Integer>>(){}.getType());
			List<Label> error=labelManager.reuse(list);
			if(error.size()>0){
				StringBuffer sb=null;
				if(list.size()==error.size()){
					sb=new StringBuffer("还原失败,");
				}
				else{
					sb=new StringBuffer("还原成功，其中");
				}
				
				for(Label item:error){
					sb.append("[");
					sb.append(item.getName());
					sb.append("]");
				}
				sb.append("为二级标签，且父标签已删除，不能还原");
				dto.setMsg(sb.toString());
			}
			else{
				dto.setMsg("还原成功");
			}
			
		}catch(Exception e){
			e.printStackTrace();
			dto.setResult(false);
			dto.setMsg("删除失败");
			return dto;
		}
		dto.setResult(true);
		return dto;
	}
	
	@RequestMapping("batchDelete")
	public @ResponseBody boolean batchDeleteLabel(String ids){
		return labelService.batchDelete(ids);
	}
	
	
	/**
	 * @param label
	 * @return Integer
	 */
	@RequestMapping(value="update",method=RequestMethod.GET)
	@ResponseBody
	public LabelDto update_get(Integer id){
		LabelDto dto=new LabelDto();
		try{
			dto.setObj(labelService.get(id));
			dto.setParentList(labelService.findAllParentByPeroperty(dto.getObj().getPeroperty()));
		}
		catch(Exception e){
			e.printStackTrace();
			dto.setResult(false);
			dto.setMsg("获取失败");
			return dto;
		}
		dto.setResult(true);
		return dto;
		
	}
	/**
	 * @param label
	 * @return Integer
	 */
	@RequestMapping(value="update",method=RequestMethod.POST)
	public  @ResponseBody ResultDto<Object> updateLabel(Label label){
		ResultDto<Object> dto=new ResultDto<Object>();
		try{
			labelManager.update(label);
			
		}catch(GException e){
			e.printStackTrace();
			dto.setResult(false);
			dto.setMsg(e.getMessage());
			return dto;
		}
		catch(Exception e){
			e.printStackTrace();
			dto.setResult(false);
			dto.setMsg("更新失败");
			return dto;
		}
		dto.setResult(true);
		dto.setMsg("更新成功");
		return dto;
	}
	/**
	 * @param id
	 * @return Label
	 */
	@RequestMapping("query")
	public  @ResponseBody Label getLabel(Integer id){
		
		return labelService.get(id);
	}
	
	/**
	 * 获取标签列表页面  type 1为正常  2为作废
	 * @return
	 */
	@RequestMapping("list")
	public String listLabel(LabelSearchParam param,Model model){
		Page<LabelVO> list=labelService.search(param);
		model.addAttribute("list", list);
		model.addAttribute("type",param.getType()==null?1:param.getType());
		return "label/list";
	}
	@RequestMapping("labels")
	public String labels(LabelSearchParam param,Model model){
		Page<LabelVO> list=labelService.search(param);
		model.addAttribute("list", list);
		model.addAttribute("type",param.getType()==null?1:param.getType());
		return "label/labels";
	}
	@RequestMapping("listForPanel")
	public String listForPanel(String show_input,String dialog_id,Dictionary peroperty ,Model model){
		List<LabelVO> parentList=labelService.findAllParentByPeroperty(peroperty);
		for(LabelVO parent:parentList){
			List<LabelVO> childList=labelService.findAllChildByParent(parent.getId());
			parent.setChildList(childList);
		}
		model.addAttribute("list",parentList);
		model.addAttribute("dialog_id",dialog_id);
		model.addAttribute("show_input",show_input);
		return "label/labelPanel";
	}
	
	/**
	 * 获取父标签list
	 * @param label
	 * @return
	 */
	@RequestMapping("parentLabel")
	@ResponseBody
	public  ResultDto<List<LabelVO>> listParentLabel(Label label){
		ResultDto<List<LabelVO>> dto=new ResultDto<List<LabelVO>>();
		try{
			dto.setObj(labelService.findAllParentByPeroperty(label.getPeroperty()));
		}catch(Exception e){
			e.printStackTrace();
			dto.setResult(false);
			dto.setMsg("获取失败");
			return dto;
		}
		dto.setResult(true);
		return dto;
	}
	/**
	 * 给文章问答专题提供标签页
	 * @param label
	 * @return
	 */
	@RequestMapping("searchLabels")
	public String searchLabels(Label label,Model model){
		 label.setPeroperty(new Dictionary(SysConstants.CATEGORY));
		 label.setUserdAmount(0);
		 model.addAttribute("label", labelService.searchLabel(label));
		 System.out.print(labelService.searchLabel(label).size());
		 return "label/labelPanel";
	}
}
