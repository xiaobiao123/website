package com.goujia.website.base.utils.search;

/**
 * @author chenghao
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.goujia.website.base.ges.entity.AreaResource;

public class AreaTernaryTree implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1213123123123L;
	public AreaTernaryTree(){
		
	}
	public AreaTernaryTree(List<AreaResource> list){
		tree=new TernarySearchTree();
		map=new HashMap<String, List<AreaResource>>();
		for(AreaResource area:list){
			tree.inert(area.getSpell());
			if(map.containsKey(area.getSpell())){
				map.get(area.getSpell()).add(area);
			}
			else{
				List<AreaResource> tmp=new ArrayList<AreaResource>();
				tmp.add(area);
				map.put(area.getSpell(), tmp);
			}
		}
		for(AreaResource area:list){
			tree.inert(area.getName());
			if(map.containsKey(area.getName())){
				map.get(area.getName()).add(area);
			}
			else{
				List<AreaResource> tmp=new ArrayList<AreaResource>();
				tmp.add(area);
				map.put(area.getName(), tmp);
			}
		}
	}
	private TernarySearchTree tree;
	private Map<String,List<AreaResource>> map;
	public List<AreaResource> searchAllByPrefix(String prefix){
		List<AreaResource> list=new ArrayList<AreaResource>();
		List<String> strList=tree.searchSimilar(prefix);
		for(String str:strList){
			list.addAll(map.get(str));
		}
		return list;
	}
}
