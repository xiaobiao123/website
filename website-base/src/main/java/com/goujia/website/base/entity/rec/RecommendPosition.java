package com.goujia.website.base.entity.rec;

public class RecommendPosition {
	private Integer posId;				//推荐位ID
	private String posName;				//推荐位名称
	private String infoType;			//推荐位类型,可能是什么类型的推荐位，ALL：全部，speTopic:专题，topic:话题，article：文章，question：问答，product：产品，other：其他......
	private Integer posNum;				//可推荐数量
	private String imageNeeded;			//是否需要图片
	private Integer imageWidth;			//图片宽度
	private Integer imageHeight;		//图片高度
	private String deleteStatus;		//删除状态
	private String posCode;				//推荐位代码

	public Integer getPosId() {
		return posId;
	}

	public void setPosId(Integer posId) {
		this.posId = posId;
	}

	public String getPosName() {
		return posName;
	}

	public void setPosName(String posName) {
		this.posName = posName == null ? null : posName.trim();
	}

	public String getInfoType() {
		return infoType;
	}

	public void setInfoType(String infoType) {
		this.infoType = infoType == null ? null : infoType.trim();
	}

	public Integer getPosNum() {
		return posNum;
	}

	public void setPosNum(Integer posNum) {
		this.posNum = posNum;
	}

	public String getImageNeeded() {
		return imageNeeded;
	}

	public void setImageNeeded(String imageNeeded) {
		this.imageNeeded = imageNeeded;
	}

	public Integer getImageWidth() {
		return imageWidth;
	}

	public void setImageWidth(Integer imageWidth) {
		this.imageWidth = imageWidth;
	}

	public Integer getImageHeight() {
		return imageHeight;
	}

	public void setImageHeight(Integer imageHeight) {
		this.imageHeight = imageHeight;
	}

	public String getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(String deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	public String getPosCode() {
		return posCode;
	}

	public void setPosCode(String posCode) {
		this.posCode = posCode == null ? null : posCode.trim();
	}
}