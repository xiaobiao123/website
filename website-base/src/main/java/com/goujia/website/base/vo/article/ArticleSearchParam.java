package com.goujia.website.base.vo.article;

import com.goujia.website.base.vo.BaseSearchParam;

/**
 * Copyright 2014-2015 www.goujiawang.com All rights reserved.
 * 
 * @project website-base
 * @author zhaoyognlian
 * @version 2.0
 * @date 2015年7月6日
 */

public class ArticleSearchParam extends BaseSearchParam {
    private int userId; // 用户id
    private String isDeleted; // 是否被删除
    private String isTop; // 是否置顶
    private String isEssence; // 是否加精
    private String articleName; // 文章标题
    private Integer labelId;    //标签id
    
    public Integer getLabelId() {
        return labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getIsTop() {
        return isTop;
    }

    public void setIsTop(String isTop) {
        this.isTop = isTop;
    }

    public String getIsEssence() {
        return isEssence;
    }

    public void setIsEssence(String isEssence) {
        this.isEssence = isEssence;
    }
}