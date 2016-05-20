package com.goujia.website.base.entity.comment;

import java.util.Date;
/**
 *   
* @Description: 直播家评论基础类
* @author  zhaoyonglian
* @date 2015年8月6日 下午4:54:14
*
 */
public class OrderReview {
    private Integer id;         //主键id
    private Integer orderId;    //订单id
    private String content;     //评论内容
    private Integer userId;     //用户id
    private Date gmtCreate;     //创建时间
    private String isDeleted;   //是否删除
    private Date gmtModify;     //修改时间
    private String goodsName;   //产品包名称

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
        this.content = content == null ? null : content.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted == null ? null : isDeleted.trim();
    }

    public Date getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }
}