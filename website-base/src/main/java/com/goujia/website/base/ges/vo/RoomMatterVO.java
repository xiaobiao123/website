/**
 * Copyright 2014-2015 goujia.com
 * All rights reserved.
 * 
 * @project
 * @author jipengfei
 * @version 1.0
 * @date 2014-06-12
 */
package com.goujia.website.base.ges.vo;

import java.math.BigDecimal;
import java.util.List;

/**
 * 
 * 
 * @author jipengfei
 * 
 */
public class RoomMatterVO {
    private String roomName; // 房间名称
    private List<MaterialsCategoryVO> matters; // 房间的物料列表
    private Double totalAmount; // 房间物料总价格

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public List<MaterialsCategoryVO> getMatters() {
        return matters;
    }

    public void setMatters(List<MaterialsCategoryVO> matters) {
        this.matters = matters;
        Double amount = 0.0;
        for (MaterialsCategoryVO mat : matters) {
            if (null != mat.getCateAmount()) {
                amount = amount + mat.getCateAmount();
            }
        }
        BigDecimal b = new BigDecimal(amount);
        double temp = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        setTotalAmount(temp);
    }

}
