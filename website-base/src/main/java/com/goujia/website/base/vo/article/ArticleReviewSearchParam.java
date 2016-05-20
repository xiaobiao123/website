/**   
 * @Title: ArticleReviewSearchParam.java
 * @Package com.goujia.website.base.vo.article
 * @Description: TODO(用一句话描述该文件做什么)
 * @author 庄友权   
 * @date 2015年6月11日 下午1:46:39
 * @version V1.0   
 */

package com.goujia.website.base.vo.article;

import com.goujia.website.base.vo.BaseSearchParam;

/**
 * @ClassName: ArticleReviewSearchParam
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2015年6月11日 下午1:46:39
 * 
 */

public class ArticleReviewSearchParam extends BaseSearchParam {
    private String isDeleted="n"; // 是否废弃
    private int searchIf;    //查询条件1：内容查询2：创建人查询
    private String searchText;//查询的内容
    /** 
     * @return isDeleted 
     */
    
    public String getIsDeleted() {
        return isDeleted;
    }
    /** 
     * @param isDeleted 要设置的 isDeleted 
     */
    
    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }
    /** 
     * @return searchIf 
     */
    
    public int getSearchIf() {
        return searchIf;
    }
    /** 
     * @param searchIf 要设置的 searchIf 
     */
    
    public void setSearchIf(int searchIf) {
        this.searchIf = searchIf;
    }
    /** 
     * @return searchText 
     */
    
    public String getSearchText() {
        return searchText;
    }
    /** 
     * @param searchText 要设置的 searchText 
     */
    
    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }
    
    
}
