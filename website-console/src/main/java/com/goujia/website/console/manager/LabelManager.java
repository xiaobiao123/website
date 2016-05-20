package com.goujia.website.console.manager;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.goujia.website.base.entity.article.Label;
import com.goujia.website.base.exception.GException;
import com.goujia.website.base.vo.article.LabelVO;
import com.goujia.website.service.article.LabelService;

@Transactional
@Service
public class LabelManager {
	@Autowired
	private LabelService labelService;
	public void update(Label label){
		Label old=labelService.get(label.getId());
		if(old.getParentId().equals(0)){
			List<LabelVO> child=labelService.findAllChildByParent(old.getId());
			if(child.size()>0){
				if(!label.getParentId().equals(0))
					throw new GException("更新失败，当前节点为一级节点，只有当子节点为空时才能更新为二级节点");
			}
			if(!label.getPeroperty().getNumber().equals(old.getPeroperty().getNumber())){
				labelService.batchUpdateByParentId(label.getPeroperty().getNumber(),label.getId());
			}
		}
		labelService.update(label);
	}
	public List<Label> delete(List<Integer> list){
		List<Label> error=new ArrayList<Label>();
		for(Integer id:list){
			Label label=labelService.get(id);
			if(label.getParentId().equals(0)){
				List<LabelVO> child=labelService.findAllChildByParent(id);
				if(child.size()>0){
					error.add(label);
					continue;
				}
			}
			labelService.delete(id);
		}
		return error;
	}
	public List<Label> reuse(List<Integer> list) {
		List<Label> error=new ArrayList<Label>();
		for(Integer id:list){
			Label label=labelService.get(id);
			if(!label.getParentId().equals(0)){
				Label parent=labelService.get(label.getParentId());
				if(parent.getIsDeleted().equals("y")){
					error.add(label);
					continue;
				}
			}
			labelService.reuse(id);
		}
		return error;
	}
	
}
