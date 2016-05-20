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
 * 分辨率
 * @author Flouny.Caesar
 *
 */
public enum Resolution{
	R_88_58(88, 58), 
	R_44_44(44, 44), 
	R_50_50(50, 50), 
	R_110_69(110, 69), 
	R_330_230(330, 230), 
	R_230_330(230, 330), 
	R_430_430(430, 430), 
	R_400_400(400, 400),
    R_495_326(495, 326),
    R_750_300(750, 300),
	R_810_480(810, 480), 
	R_970_585(970, 585), 
	R_1920_300(1920, 300);
	
	private int width;
	private int height;

	Resolution(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		
		return width;
	}
	
	public int getHeight() {
		
		return height;
	}
}