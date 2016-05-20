package com.goujia.website.base.ges.entity;


/**
 * 贷款用到的一些要变化的值 目前采用一张表的形式展示，根据业务可添加一张关联表，展示所有类型
 * @author User
 *
 */
public class Dict implements IEntity {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private String code;
	
	private String name;
	
	private String value;
	
	private Integer parentId;
	
	private Integer level;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}
	
	

}
