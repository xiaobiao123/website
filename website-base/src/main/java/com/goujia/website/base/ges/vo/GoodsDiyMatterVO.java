/**
 * Copyright 2014-2015 goujia.com
 * All rights reserved.
 * 
 * @project
 * @author guojianbin
 * @version 3.0
 * @date 2015-09-25
 */
package com.goujia.website.base.ges.vo;

import com.goujia.website.base.ges.entity.GoodsDiyMatter;

/**
 * DIY方案VO
 * @author guojianbin
 *
 */
public class GoodsDiyMatterVO extends GoodsDiyMatter {

	/**
	 * 物料名称
	 */
	private String name;
	
	/**
	 * 型号
	 */
	private String model;
	
	/**
	 * 颜色
	 */
	private String color;
	
	/**
	 * 材质
	 */
	private String materials;
	
	/**
	 * 尺寸
	 */
	private String dimension;
	
	/**
	 * 市场标价
	 */
	private Double pric;
	
	/**
	 * 市场销售价
	 */
	private Double salesPrice;
	
	/**
	 * 图片地址
	 */
	private String imagePath;
	
	/**
	 * 品牌ID
	 */
	private Integer brandId;

	/**
	 * 品牌名称
	 */
	private String brandName;
	
	/**
	 * 
	 * 采购价格
	 */
	private Double buyPrice;

	/**
	 * 
	 * 购家网销售价
	 */
	private Double gouJiaPrice;
	
    /**
     * 效果图路径
     */
    private String effectPath;
    
    /**
     * 单位
     */
    private String unit;
    
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * 替换项
     */
    private GoodsDiyMatterVO replace;
    
	public GoodsDiyMatterVO getReplace() {
        return replace;
    }

    public void setReplace(GoodsDiyMatterVO replace) {
        this.replace = replace;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterials() {
		return materials;
	}

	public void setMaterials(String materials) {
		this.materials = materials;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public Double getPric() {
		return pric;
	}

	public void setPric(Double pric) {
		this.pric = pric;
	}

	public Double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(Double salesPrice) {
		this.salesPrice = salesPrice;
	}

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Double getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(Double buyPrice) {
		this.buyPrice = buyPrice;
	}

	public Double getGouJiaPrice() {
		return gouJiaPrice;
	}

	public void setGouJiaPrice(Double gouJiaPrice) {
		this.gouJiaPrice = gouJiaPrice;
	}

	public String getEffectPath() {
		return effectPath;
	}

	public void setEffectPath(String effectPath) {
		this.effectPath = effectPath;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

}
