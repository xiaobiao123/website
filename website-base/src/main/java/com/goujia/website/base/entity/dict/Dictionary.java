package com.goujia.website.base.entity.dict;

public class Dictionary {
	private Integer id;
	private	Integer number;
	public Dictionary(){
		
	}
	public Dictionary(Integer number){
		this.number=number;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	private String text;
	private String remark;
}
