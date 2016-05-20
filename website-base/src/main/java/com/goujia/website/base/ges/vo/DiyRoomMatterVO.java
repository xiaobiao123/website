package com.goujia.website.base.ges.vo;

import java.util.List;

/**
 * 
 *   diy清单
 * @author zhaoyonglian
 * 
 */
public class DiyRoomMatterVO {
    public List<GoodsDiyMatterVO> addList; // 增加项
    public List<GoodsDiyMatterVO> decreaseList; // 减少项
    public List<GoodsDiyMatterVO> replaceList; // 替换项
    public Integer roomId; // 房间id

    public List<GoodsDiyMatterVO> getAddList() {
        return addList;
    }

    public void setAddList(List<GoodsDiyMatterVO> addList) {
        this.addList = addList;
    }

    public List<GoodsDiyMatterVO> getDecreaseList() {
        return decreaseList;
    }

    public void setDecreaseList(List<GoodsDiyMatterVO> decreaseList) {
        this.decreaseList = decreaseList;
    }

    public List<GoodsDiyMatterVO> getReplaceList() {
        return replaceList;
    }

    public void setReplaceList(List<GoodsDiyMatterVO> replaceList) {
        this.replaceList = replaceList;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

}
