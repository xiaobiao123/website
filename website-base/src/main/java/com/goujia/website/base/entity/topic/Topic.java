package com.goujia.website.base.entity.topic;

import java.util.Date;

public class Topic {
    private Integer id;							//主键
    private String imagePath;					//存放话题图片地址
    private String infoImage;					//图片上传地址
    private String name;						//话题名
    private String labelIds;					//标签IDS(用','分隔)
    private String introduction;				//文章简介
    private Integer associatedArticleNumber=0;	//关联文章数
    private Integer participantNumber=0;			//参与人数
    private String isTop;						//置顶 n/y
    private String isEssence;					//是否加精 n/y
    private Integer userId;						//创建者id
    private Date gmtCreate;						//文章的创建时间
    private Date gmtModified;					//文章的修改时间
    private String isDeleted;					//是否被删除,y/n
    private String craftLabels;                 //工艺标签
    private String materialLabels;              //材料标签
    private String styleLabels;                 //风格标签
    private String categoryNames;		//分类标签名字字符串
    private String craftNames;			//工艺标签名字字符串
    private String materialNames;		//材料标签名字字符串
    private String styleNames;			//风格标签名字字符串
    
    public String getInfoImage() {
		return infoImage;
	}

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLabelIds() {
        return labelIds;
    }

    public void setLabelIds(String labelIds) {
        this.labelIds = labelIds == null ? null : labelIds.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public Integer getAssociatedArticleNumber() {
        return associatedArticleNumber;
    }

    public void setAssociatedArticleNumber(Integer associatedArticleNumber) {
        this.associatedArticleNumber = associatedArticleNumber;
    }

    public Integer getParticipantNumber() {
        return participantNumber;
    }

    public void setParticipantNumber(Integer participantNumber) {
        this.participantNumber = participantNumber;
    }

    public String getIsTop() {
        return isTop;
    }

    public void setIsTop(String isTop) {
        this.isTop = isTop == null ? null : isTop.trim();
    }

    public String getIsEssence() {
        return isEssence;
    }

    public void setIsEssence(String isEssence) {
        this.isEssence = isEssence == null ? null : isEssence.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
		this.craftLabels = craftLabels;
	}

	public String getMaterialLabels() {
		return materialLabels;
	}

	public void setMaterialLabels(String materialLabels) {
		this.materialLabels = materialLabels;
	}

	public String getStyleLabels() {
		return styleLabels;
	}

	public void setStyleLabels(String styleLabels) {
		this.styleLabels = styleLabels;
	}

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
    
    
    
}