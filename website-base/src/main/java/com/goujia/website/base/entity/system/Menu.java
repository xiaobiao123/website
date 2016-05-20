package com.goujia.website.base.entity.system;

import java.util.Date;
import java.util.List;

public class Menu {
	private Integer id;						//主键
	private String name;					//菜单中文名
	private String code;					//代码
	private String iconClass;				//菜单对应的class
	private String target;					//跳转地址  叶子菜单项才会有值
	private Integer parentId;				//父节点ID
	private String type;					//类型 @logic 'ges'|'bbs'|'trade'|'sman'  'ges2.0系统'|'社区'|'商城'|'sman后台管理菜单'
	private String isDeleted;				//是否删除 y|n
	private Integer orderIndex;				//显示顺序
	private Date gmtCreate;					//创建时间
	private Date gmtModified;				//修改时间

	private List<Menu> children;			//子菜单
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code == null ? null : code.trim();
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target == null ? null : target.trim();
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type == null ? null : type.trim();
	}

	public String getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted == null ? null : isDeleted.trim();
	}

	public Integer getOrderIndex() {
		return orderIndex;
	}

	public void setOrderIndex(Integer orderIndex) {
		this.orderIndex = orderIndex;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getIconClass() {
		return iconClass;
	}

	public void setIconClass(String iconClass) {
		this.iconClass = iconClass;
	}

	public List<Menu> getChildren() {
		return children;
	}

	public void setChildren(List<Menu> children) {
		this.children = children;
	}
}