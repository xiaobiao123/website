package com.goujia.website.base.ges.entity;

/**
 * 预算分类
 * @author caorz
 *
 */
public class BudgetCategory{

	private Integer id;
	private String imgPath;

	@Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        BudgetCategory b=(BudgetCategory)obj;
        return id.equals(b.getId());
    }
    private Integer parentId;
	
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
