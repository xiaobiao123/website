package com.goujia.website.base.vo.topic;

import com.goujia.website.base.vo.BaseSearchParam;

public class TopicSearchParam extends BaseSearchParam{
	       
	private String name;
    private String isDeleted;
    private Integer id;
    private String labelId;
    
	/** 
     * @return labelId 
     */
    
    public String getLabelId() {
        return labelId;
    }

    /** 
     * @param labelId 要设置的 labelId 
     */
    
    public void setLabelId(String labelId) {
        this.labelId = labelId;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
       
}
