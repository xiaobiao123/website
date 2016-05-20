package com.goujia.website.base.utils.search;


/**
 * @author chenghao
 */
public class TernarySearchNode {
	private boolean completed;
	
	private char word;
	private TernarySearchNode left;
	private TernarySearchNode right;
	private TernarySearchNode center;
	public TernarySearchNode(char word){
		this.word=word;
		this.left=null;
		this.right=null;
		this.center=null;
		this.completed=false;
	}
	
	public char getWord() {
		return word;
	}
	public void setWord(char word) {
		this.word = word;
	}
	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	public TernarySearchNode getLeft() {
		return left;
	}
	public void setLeft(TernarySearchNode left) {
		this.left = left;
	}
	public TernarySearchNode getRight() {
		return right;
	}
	public void setRight(TernarySearchNode right) {
		this.right = right;
	}
	public TernarySearchNode getCenter() {
		return center;
	}
	public void setCenter(TernarySearchNode center) {
		this.center = center;
	}
	
}