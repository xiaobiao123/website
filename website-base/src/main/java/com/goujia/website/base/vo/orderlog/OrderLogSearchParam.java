package com.goujia.website.base.vo.orderlog;

import com.goujia.website.base.vo.BaseSearchParam;

/**
 * 
* @Description: 订单日志搜索基础类
* @author  zhaoyonglian
* @date 2015年8月15日 下午3:25:41
*
 */
public class OrderLogSearchParam extends BaseSearchParam{
    private Integer orderId;        //订单id
    private String content;         //日志内容
    
    public Integer getOrderId() {
        return orderId;
    }
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}
