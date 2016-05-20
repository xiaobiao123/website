package com.goujia.website.base.entity.orderlog;
/**
 *  
* @Description:  施工现场视频链接基础类
* @author  zhaoyonglian
* @date 2015年8月24日 上午10:15:21
*
 */
public class OrderVideo {
    private Long id;            //主键id

    private Integer orderId;    //订单id

    private String videoPath;   //视频地址

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getVideoPath() {
        return videoPath;
    }

    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath == null ? null : videoPath.trim();
    }
}