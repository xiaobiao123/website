package com.goujia.website.base.vo.comment;

import com.goujia.website.base.entity.comment.GoodsReview;

public class GoodsReviewVO extends GoodsReview{

    private String userName;        //用户名字
    private String gmtCreateString;
    private String headPortrait;
    public String getHeadPortrait() {
        return headPortrait;
    }

    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait;
    }

    public String getGmtCreateString() {
        return gmtCreateString;
    }

    public void setGmtCreateString(String gmtCreateString) {
        this.gmtCreateString = gmtCreateString;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
