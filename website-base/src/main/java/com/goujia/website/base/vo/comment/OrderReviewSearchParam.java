package com.goujia.website.base.vo.comment;

import com.goujia.website.base.vo.BaseSearchParam;

/**
 *  含义：问题搜索类
 * @author  zhaoyonglian 15-6-3
 *
 */
public class OrderReviewSearchParam extends BaseSearchParam{
    private String goodsName;   //产品包名称
    private Integer userId;     //用户id
    private String isDeleted;   //是否删除
    private Integer searchIf; ////查询条件1：内容查询2：创建人查询
    private String searchText;//查询的内容
    
    public String getGoodsName() {
        return goodsName;
    }
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
    public String getSearchText() {
        return searchText;
    }
    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }
    public Integer getSearchIf() {
        return searchIf;
    }
    public void setSearchIf(Integer searchIf) {
        this.searchIf = searchIf;
    }
    public String getIsDeleted() {
        return isDeleted;
    }
    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
	
}
