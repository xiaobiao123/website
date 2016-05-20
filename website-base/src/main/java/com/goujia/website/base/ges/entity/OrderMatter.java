package com.goujia.website.base.ges.entity;

/**
 * Created by Archer on 2015/3/17.
 *
 * 订单物料关系表
 */
public class OrderMatter{
    /**
     * 主键
     */
    private Integer id;

    /**
     * 订单ID
     */
    private Integer orderId;

    /**
     * 产品物料关联表ID
     */
    private Integer goodsMatterId;

    /**
     * 产品包ID
     */
    private Integer goodsId;

    /**
     * 物料ID
     */
    private Integer matterId;

    /**
     * 收货地址类型
     *
     * 1:运营商 2:工地
     */
    private Integer takeAddressType;

    /**
     * 采购天数
     */
    private Integer purchaseDays;

    /**
     * 供应商
     */
    private Integer supplierId;

    /**
     * 数量
     */
    private Integer amount;

    /**
     * 房间ID
     */
    private Integer roomId;

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

    public Integer getMatterId() {
        return matterId;
    }

    public void setMatterId(Integer matterId) {
        this.matterId = matterId;
    }

    public Integer getTakeAddressType() {
        return takeAddressType;
    }

    public void setTakeAddressType(Integer takeAddressType) {
        this.takeAddressType = takeAddressType;
    }

    public Integer getPurchaseDays() {
        return purchaseDays;
    }

    public void setPurchaseDays(Integer purchaseDays) {
        this.purchaseDays = purchaseDays;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getGoodsMatterId() {
        return goodsMatterId;
    }

    public void setGoodsMatterId(Integer goodsMatterId) {
        this.goodsMatterId = goodsMatterId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }
}
