/**
 * Copyright 2014-2015 goujia.com
 * All rights reserved.
 * 
 * @project
 * @author Flouny.Caesar
 * @version 2.0
 * @date 2014-11-26
 */
package com.goujia.website.base.utils;

import java.util.List;

import com.goujia.website.base.constants.image.ResPPE;

/**
 * 
 * @author Flouny.Caesar
 *
 */
public class Image {
	
	private ResPPE original;
	
	private List<ResPPE> thumbnails;

	public ResPPE getOriginal() {
		return original;
	}

	public void setOriginal(ResPPE original) {
		this.original = original;
	}

	public List<ResPPE> getThumbnails() {
		return thumbnails;
	}

	public void setThumbnails(List<ResPPE> thumbnails) {
		this.thumbnails = thumbnails;
	}
}