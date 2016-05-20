

/**   
* @Title: OrderLogVO.java
* @Package com.goujia.website.base.vo.orderlog
* @Description: TODO(用一句话描述该文件做什么)
* @author chenghao   
* @date Sep 16, 2015 6:35:41 PM
* @version V1.0   
*/
package com.goujia.website.base.vo.orderlog;

import java.util.List;

import com.goujia.website.base.entity.orderlog.OrderLog;
import com.goujia.website.base.entity.orderlog.OrderLogImage;



/**
 * @Description: 
 * @author  chenghao
 * @date Sep 16, 2015 6:35:41 PM
 * 
 */
public class OrderLogVO extends OrderLog {
    private String labelName;
	public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }
    
}
