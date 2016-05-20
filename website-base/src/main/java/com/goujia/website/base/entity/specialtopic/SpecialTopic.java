package com.goujia.website.base.entity.specialtopic;

import java.util.Date;

public class SpecialTopic {
    private Integer id;                 //主键
    private String imagePath;           //专题封面图片
    private String topicName;           //专题名称
    private String introduction;        //简介
    private String isTop;               //置顶 n/y
    private Integer ownerId;            //创建人
    private Date createTime;            //创建时间
    private String isDeleted;           //是否删除 n/y
    private String infoImage;           //页面图片路径
    private String categoryLabels;      //分类标签
    private String craftLabels;         //工艺标签
    private String materialLabels;      //材料标签
    private String styleLabels;         //风格标签
    private String categoryNames;		//分类标签名字字符串
    private String craftNames;			//工艺标签名字字符串
    private String materialNames;		//材料标签名字字符串
    private String styleNames;			//风格标签名字字符串
    
    
    public String getCategoryNames() {
		return categoryNames;
	}

	public void setCategoryNames(String categoryNames) {
		this.categoryNames = categoryNames;
	}

	public String getCraftNames() {
		return craftNames;
	}

	public void setCraftNames(String craftNames) {
		this.craftNames = craftNames;
	}

	public String getMaterialNames() {
		return materialNames;
	}

	public void setMaterialNames(String materialNames) {
		this.materialNames = materialNames;
	}

	public String getStyleNames() {
		return styleNames;
	}

	public void setStyleNames(String styleNames) {
		this.styleNames = styleNames;
	}

	/** 
     * @return infoImage 
     */
    
    public String getInfoImage() {
        return infoImage;
    }

    /** 
     * @param infoImage 要设置的 infoImage 
     */
    
    public void setInfoImage(String infoImage) {
        this.infoImage = infoImage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath == null ? null : imagePath.trim();
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName == null ? null : topicName.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getCategoryLabels() {
        return categoryLabels;
    }

    public void setCategoryLabels(String categoryLabels) {
        this.categoryLabels = categoryLabels == null ? null : categoryLabels
                .trim();
    }

    public String getIsTop() {
        return isTop;
    }

    public void setIsTop(String isTop) {
        this.isTop = isTop == null ? null : isTop.trim();
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted == null ? null : isDeleted.trim();
    }

    public String getCraftLabels() {
        return craftLabels;
    }

    public void setCraftLabels(String craftLabels) {
        this.craftLabels = craftLabels == null ? null : craftLabels.trim();
    }

    public String getMaterialLabels() {
        return materialLabels;
    }

    public void setMaterialLabels(String materialLabels) {
        this.materialLabels = materialLabels == null ? null : materialLabels
                .trim();
    }

    public String getStyleLabels() {
        return styleLabels;
    }

    public void setStyleLabels(String styleLabels) {
        this.styleLabels = styleLabels == null ? null : styleLabels.trim();
    }
}