package com.goujia.website.base.ges.gjb;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期工具类
 * @author User
 *
 */
public class DateUtil {
	
	/**
	 * 按照"yyyyMMddHHmmss"格式化时间
	 * @param date
	 * @return
	 */
	public static String formatYMDHMS(Date date) {
        return new SimpleDateFormat("yyyyMMddHHmmss").format(date);
    }
	
	/**
	 * 按照"yyyy-MM-dd HH:mm:ss"格式化时间
	 * @param date
	 * @return
	 */
	public static String formatDate(Date date) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
    }
	
	

}
