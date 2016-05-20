package com.goujia.website.base.vo.comment;

import com.goujia.website.base.entity.comment.OrderReview;

public class OrderReviewVO extends OrderReview {
    private String userName;        //用户名字
    private String avatar;

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
}
