package com.goujia.website.base.dao.article;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.junit.runners.Parameterized.Parameters;

import com.goujia.website.base.entity.article.ArticleReview;
import com.goujia.website.base.mybatis.page.session.NewRowBounds;
import com.goujia.website.base.vo.article.ArticleReviewSearchParam;
import com.goujia.website.base.vo.article.ArticleReviewVO;

public interface ArticleReviewMapper {
    
	
	int delete(Integer id);

    void insert(ArticleReview record);

    ArticleReview get(Integer id);

    int update(ArticleReview record);
    
    List<ArticleReviewVO> list(@Param("article")Integer articleId, NewRowBounds rowBounds);

  	int count(@Param("article")Integer articleId);
    
  	List<ArticleReviewVO> reviewManager(ArticleReviewSearchParam searchParam, NewRowBounds rowBounds);
  	
  	int reviewManagerCount(ArticleReviewSearchParam searchParam);
  	
  	int disable(Integer id);

	long countReviewForUserArticle(@Param("user")Integer userId);

	List<ArticleReviewVO> findReviewForUserArticle(@Param("user")Integer userId,
			NewRowBounds newRowBounds);

	long countUserReviewForArticle(@Param("user")Integer userId);

	List<ArticleReviewVO> findUserReviewForArticle(@Param("user")Integer userId,
			NewRowBounds newRowBounds);

	List<Integer> findArticleByUser(@Param("user")Integer userId, NewRowBounds newRowBounds);

	long countArticleByUser(@Param("user")Integer userId);
}