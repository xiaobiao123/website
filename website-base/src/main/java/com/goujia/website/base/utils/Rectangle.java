package com.goujia.website.base.utils;

public class Rectangle {
	private Integer width;
	private Integer height;
	public Rectangle(){
		
	}
	public Rectangle(Integer width,Integer height){
		this.width=width;
		this.height=height;
	}
	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
}
