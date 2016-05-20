package com.goujia.website.base.dao.article;

import java.util.List;

import com.goujia.website.base.entity.article.ArticleReviewReply;
import com.goujia.website.base.mybatis.page.session.NewRowBounds;
import com.goujia.website.base.vo.article.ArticleReviewReplyVO;

public interface ArticleReviewReplyMapper {
    int delete(Integer id);

    int insert(ArticleReviewReply record);

    ArticleReviewReply get(Integer id);

    int update(ArticleReviewReply record);

    List<ArticleReviewReplyVO> list(ArticleReviewReplyVO entity, NewRowBounds rowBounds);

	int count(ArticleReviewReplyVO articleReviewReplyVO);
}