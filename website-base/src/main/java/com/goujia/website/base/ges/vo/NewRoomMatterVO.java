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
 * @author zhaoyonglian 
 * 
 */
public class NewRoomMatterVO {
    private String roomName; // 房间名称
    private List<MatterVO> matters; // 房间的物料列表
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

    public List<MatterVO> getMatters() {
        return matters;
    }

    public void setMatters(List<MatterVO> matters) {
        this.matters = matters;
        Double amount = 0.0;
        for (MatterVO mat : matters) {
            if (null != mat.getPric()) {
                amount = amount + mat.getPric();
            }
        }
        BigDecimal b = new BigDecimal(amount);
        double temp = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        setTotalAmount(temp);
    }

}
