package com.goujia.website.base.utils.search;

/**
 * @author chenghao
 */
import java.util.ArrayList;
import java.util.List;

public class TernarySearchTree {
	private TernarySearchNode root;
	private List<String> list=null;
	private TernarySearchNode insert(TernarySearchNode node,String words,int index){
		char tmp=words.charAt(index);
		if(node==null)
			node=new TernarySearchNode(tmp);
		
		if(tmp<node.getWord()){
			node.setLeft(insert(node.getLeft(),words,index));
		}
		else if(tmp>node.getWord()){
			node.setRight(insert(node.getRight(),words,index));
		}
		else{
			if(index+1==words.length()){
				node.setCompleted(true);
				return node;
			}
			else
				node.setCenter(insert(node.getCenter(),words,index+1));
		}
		return node;
	}
	
	public void inert(String words){
		root=insert(root,words,0);
	}
	private TernarySearchNode search(String words){
		TernarySearchNode node=root;
		int index=0;
		while(node!=null){
			char c=words.charAt(index);
			if(c<node.getWord())
				node=node.getLeft();
			else if(c>node.getWord())
				node=node.getRight();
			else{
				if(++index==words.length())
					return node;
				node=node.getCenter();
			}
		}
		return null;
	}
	public boolean contains(String words){
		TernarySearchNode node=search(words);
		return node!=null && node.isCompleted();
	}
	private void dfs(TernarySearchNode node,String prefix){
		if(node==null)
			return;
		String tmp=prefix+node.getWord();
		if(node.isCompleted())
			list.add(tmp);
		dfs(node.getLeft(),prefix);
		dfs(node.getCenter(),tmp);
		dfs(node.getRight(),prefix);
	}
	
	public List<String> searchSimilar(String words){
		list=new ArrayList<String>();
		TernarySearchNode node=search(words);
		if(node!=null){
			if(node.isCompleted())
				list.add(words);
			dfs(node.getCenter(),words);
		}
		return list;
	}
	
}