package com.goujia.website.base.constants.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.goujia.website.base.utils.Rectangle;

/**
 * Copyright 2014-2015 www.goujiawang.com All rights reserved.
 * 
 * @project website-base
 * @author Wangfeng
 * @version 2.0
 * @date 2015年6月2日
 */
public class SysConstants {
	public static final String CURRENT_USER_ATTRNAME = "CURRENT_USER_ATTRNAME";
	public static final String SESSION_MEMBER_USER = "SESSION_MEMBER_USER";
	public static final String USER_NAME ="USER_NAME";
	public static final String USER_ID = "USER_ID";
	public static final String AREA="SESSION_AREA_INFO";
	public static final	String LOCATE_AREA="SESSION_LOCATE_AREA";
	public static final String PHONE = "PHONE";
	public static final Integer DEFAULT_AREA=1213;
	
	public static final String CAPTCHA_CODE="CAPTCHA_CODE";


	/**
	 * 删除状态
	 */
	public static final String DELETED_NO = "n";			//未删除
	public static final String DELETED_YES = "y";			//已删除
	
	public static final String REC_INFO_TYPE_ALL = "all";						//推荐类型-全部
	public static final String REC_INFO_TYPE_SPECIAL_TOPIC = "speTopic";		//推荐类型-全部
	public static final String REC_INFO_TYPE_TOPIC = "topic";					//推荐类型-全部
	public static final String REC_INFO_TYPE_ARTICLE = "article";				//推荐类型-全部
	public static final String REC_INFO_TYPE_QUESTION = "question";				//推荐类型-全部
	public static final String REC_INFO_TYPE_PRODUCT = "product";				//推荐类型-全部
	public static final String REC_INFO_TYPE_OTHER = "other";					//推荐类型-全部
	
	public static final String REC_POS_IMAGE_NEED_NO = "n";						//推荐位是否需要图片-不需要图片
	public static final String REC_POS_IMAGE_NEED_YES = "y";					//推荐位是否需要图片-需要图片
	
	public static final String REC_INFO_INFO_STATUS_ACTIVE = "y";				//推荐信息状态-有效
	public static final String REC_INFO_INFO_STATUS_INACTIVE = "n";				//推荐信息状态-无效
	
	// 问题类型
	public static final String QUESTION_TYPE_FIRST = "RenovationCommonsense"; // 装修常识
	public static final String QUESTION_TYPE_SENCOND = "ConstructionSpecifications"; // 施工规范
	public static final String QUESTION_TYPE_THIRD = "Materialpurchaseooption"; // 材料购选
	
	
	public static final Integer CATEGORY=100101;
	public static final Integer TECHNOLOGY=100102;
	public static final Integer  MATERIAL=100103;
	public static final Integer STYLE=100104;
	
	public static final String DEFAULT_ARTICLE_HEAD="/uploaded/11111/article_head.png";
	
	public static final String DEFAULT_USER_HEAD_PREFIX="/uploaded/111888/headImg_";
	public static final String DEFAULT_USER_HEAD_SUFFIX=".jpg";
	
	public static final Integer RECOMMEND_UPLOAD=1;
	public static final Integer SPECIAL_TOPIC_UPLOAD=2;
	public static final Integer TOPIC_UPLOAD=3;
	
	
	public static Map<Integer,List<Rectangle>> upload_pictory_size_map=null;
	static{
		upload_pictory_size_map=new HashMap<Integer,List<Rectangle>>();
		List<Rectangle> list=new ArrayList<Rectangle>();
		list.add(new Rectangle(1920,480));
		list.add(new Rectangle(399,510));
		list.add(new Rectangle(385,244));
		list.add(new Rectangle(491,252));
		list.add(new Rectangle(276,252));
		list.add(new Rectangle(269,216));
		list.add(new Rectangle(491,247));
		list.add(new Rectangle(276,247));
		list.add(new Rectangle(290,205));
		list.add(new Rectangle(600,360));
		upload_pictory_size_map.put(RECOMMEND_UPLOAD,list);
		list=new ArrayList<Rectangle>();
		list.add(new Rectangle(1920,480));
		list.add(new Rectangle(530,365));
		list.add(new Rectangle(300,365));
		list.add(new Rectangle(350,177));
		upload_pictory_size_map.put(SPECIAL_TOPIC_UPLOAD,list);
		list=new ArrayList<Rectangle>();
		list.add(new Rectangle(590,350));
		list.add(new Rectangle(310,205));
		list.add(new Rectangle(814,398));
		upload_pictory_size_map.put(TOPIC_UPLOAD,list);
	}
	
	//收藏
	public static final String COLLECTION_GOODS="100601";
	public static final String COLLECTION_IMAGE="100602";
	public static final String COLLECTION_ARTICLE="100603";
	public static final String COLLECTION_PLAN="100604";
	public static final String COLLECTION_SPECIAL_TOPIC="100605";
	public static final String COLLECTION_TOPIC="100606";
	
	
	//点赞
	public static final String SUPPORT_GOODS="100501";
	public static final String SUPPORT_IMAGE="100502";
	public static final String SUPPORT_ARTICLE="100503";
	public static final String SUPPORT_PLAN="100504";
	public static final String SUPPORT_SPECIAL_TOPIC="100505";
	public static final String SUPPORT_TOPIC="100506";
	
	//图片大小
	public static List<Rectangle> imageSizeList=null;
	static {
	    imageSizeList=new ArrayList<Rectangle>();
	    imageSizeList.add(new Rectangle(330, 230));
	    imageSizeList.add(new Rectangle(400, 400));
	    imageSizeList.add(new Rectangle(495, 326));
	    imageSizeList.add(new Rectangle(430, 430));
	}
	
	//重置密码时已验证
	public static final String RESET_PASSWORD_VALIDATED="reset_password_validated";
	
	public static List<Rectangle> avatarSizeList=null;
	static {
		avatarSizeList=new ArrayList<Rectangle>();
		avatarSizeList.add(new Rectangle(100,100));
		avatarSizeList.add(new Rectangle(60,60));
	}
	
}
