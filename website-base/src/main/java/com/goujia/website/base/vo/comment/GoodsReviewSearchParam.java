package com.goujia.website.base.vo.comment;

import com.goujia.website.base.vo.BaseSearchParam;

public class GoodsReviewSearchParam extends BaseSearchParam{
    private Integer userId;     //用户id
    private String isDeleted;   //是否删除
    private Integer searchIf; ////查询条件1：内容查询2：产品包名称 3：创建人查询
    private String searchText;//查询的内容
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getIsDeleted() {
        return isDeleted;
    }
    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }
    public Integer getSearchIf() {
        return searchIf;
    }
    public void setSearchIf(Integer searchIf) {
        this.searchIf = searchIf;
    }
    public String getSearchText() {
        return searchText;
    }
    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }
    

}
