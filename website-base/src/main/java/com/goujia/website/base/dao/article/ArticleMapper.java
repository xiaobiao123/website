package com.goujia.website.base.dao.article;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.goujia.website.base.entity.article.Article;
import com.goujia.website.base.mybatis.page.session.NewRowBounds;
import com.goujia.website.base.vo.article.ArticleSearchParam;
import com.goujia.website.base.vo.article.ArticleVO;

public interface ArticleMapper {

    /**
     * 
     * @param id
     * @return
     */
    int delete(Integer id);

    /**
     * 
     * @param record
     * @return
     */
    int insert(Article record);

    /**
     * 
     * @param id
     * @return
     */
    Article get(Integer id);

    /**
     * 
     * 
     * @param record
     * @return
     */
    int update(Article record);

    List<ArticleVO> list(ArticleVO entity, NewRowBounds rowBounds);

    int count(ArticleVO articleVO);

    int countFormalByName(@Param("name") String name);

    List<ArticleVO> findFormalByName(@Param("name") String name,
            NewRowBounds newRowBounds);

    int countNullifyByName(@Param("name") String name);

    List<ArticleVO> findNullifyByName(@Param("name") String name,
            NewRowBounds newRowBounds);

    void batchDelete(@Param("list") List<String> list);

    void batchReturn(@Param("list") List<String> list);

    ArticleVO getById(@Param("id") Integer id);

    ArticleVO getWithUsernaemById(@Param("id") Integer id);

    // home页面推荐文章显示
    List<Article> recArticle(int labelId);

    List<Article> recParentArticle(int labelId);

    void addHitNum(@Param("id") Integer id);

    void addLoveNum(@Param("id") Integer id);

    Integer getLoveNumById(@Param("id") Integer id);

    List<Article> recommentArticle(NewRowBounds newRowBounds);

    List<ArticleVO> getTopicArticle(@Param("topicId") Integer topicId,@Param("userId")String userId,
            NewRowBounds newRowBounds);

    Integer getTopicArticleCount(@Param("topicId") Integer topicId);

    /**
     * 方法描述：分页查看标签下的文章列表
     * 
     * @param labelId
     *            标签id
     * @param newRowBounds
     * @return 文章列表
     * @author zhaoyonglian 15-6-26
     */
    public List<ArticleVO> getArticalsByLabel(@Param("labelId")Integer labelId,@Param("userId")String userId,
            NewRowBounds newRowBounds);

    /**
     * 方法描述：查看总数
     * 
     * @param labelId
     *            标签id
     * @return 总数
     * @author zhaoyonglian 15-6-26
     */
    public int getArticalsByLabelCount(Integer labelId);

    /** 个人后台 */

    /**
     * 方法描述：查看我的文章列表
     * 
     * @param searchParam
     *            userId, isDeleted等等
     * @param newRowBounds
     * @return 文章列表
     * @author zhaoyonglian 15-7-6
     */
    public List<ArticleVO> getMyArticles(ArticleSearchParam searchParam,
            NewRowBounds newRowBounds);

    /**
     * 方法描述：我的文章数量
     * 
     * @param searchParam
     * @return 我的文章数量
     * @author zhaoyonglian 15-7-6
     */
    public Integer getMyArticlesCount(ArticleSearchParam searchParam);
    
    public List<ArticleVO> myAttentionArticle(int userId,NewRowBounds newRowBounds);
    
    public int myAttentionArticleCount(int userId);
    
    public List<ArticleVO> myPublishArticle(int userId,NewRowBounds newRowBounds);
    
    public int myPublishArticleCount(int userId);
    
    /**
     * 
    * @Description  百科搜索文章
    * @param searchParam
    * @param newRowBounds
    * @return
    * @author zhaoyonglian   
    * @date 2015年9月23日 下午3:06:12
     */
    public List<ArticleVO> getSearchArticles(ArticleSearchParam searchParam,
            NewRowBounds newRowBounds);

    /**
     * 
    * @Description  百科搜索文章数量
    * @param searchParam
    * @return
    * @author zhaoyonglian   
    * @date 2015年9月23日 下午3:07:43
     */
    public Integer getSearchArticlesCount(ArticleSearchParam searchParam);
    
    /**
     * 
    * @Description  我点赞的文章列表
    * @param userId
    * @param newRowBounds
    * @return
    * @author zhaoyonglian   
    * @date 2015年11月26日 下午4:28:33
     */
    public List<ArticleVO> mySupportArticle(int userId,NewRowBounds newRowBounds);
    
    /**
     * 
    * @Description  我点赞的文章数量
    * @param userId
    * @return
    * @author zhaoyonglian   
    * @date 2015年11月26日 下午4:28:51
     */
    public int mySupportArticleCount(int userId);


	List<ArticleVO> findByLabel(@Param("label")Integer newsLabelId, @Param("limit")int limit);
}