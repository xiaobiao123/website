/**
 * Copyright 2014-2015 goujia.com
 * All rights reserved.
 * 
 * @project
 * @author Flouny.Caesar
 * @version 2.0
 * @date 2014-11-26
 */
package com.goujia.website.base.constants.image;

/**
 * 
 * @author Flouny.Caesar
 *
 */
public class ResPPE {
	
	/**
	 * 存储路径
	 */
	private String fullPath;
	
	/**
	 * 比例尺
	 */
	private String scale;
	
	/**
	 * 文件名
	 */
	private String picName;
	
	/**
	 * 扩展名
	 */
	private String ext;
	
	/**
	 * 相对储路径
	 */
	private String relaDirPath;
	
	/**
	 * 宽
	 */
	private int width;
	
	/**
	 * 高
	 */
	private int height;
	
	private String watermarkPath;

	public String getWatermarkPath() {
		return watermarkPath;
	}

	public void setWatermarkPath(String watermarkPath) {
		this.watermarkPath = watermarkPath;
	}

	public String getFullPath() {
		return fullPath;
	}

	public void setFullPath(String fullPath) {
		this.fullPath = fullPath;
	}

	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

	public String getPicName() {
		return picName;
	}

	public void setPicName(String picName) {
		this.picName = picName;
	}

	public String getExt() {
		return ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getRelaDirPath() {
		return relaDirPath;
	}

	public void setRelaDirPath(String relaDirPath) {
		this.relaDirPath = relaDirPath;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}