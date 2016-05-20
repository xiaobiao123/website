package com.goujia.website.base.dao.specialtopic;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.goujia.website.base.entity.article.Label;
import com.goujia.website.base.entity.question.Question;
import com.goujia.website.base.entity.specialtopic.SpecialTopicAssociation;
import com.goujia.website.base.mybatis.page.session.NewRowBounds;
import com.goujia.website.base.vo.article.ArticleVO;
import com.goujia.website.base.vo.topic.TopicVo;

public interface SpecialTopicAssociationMapper {
	int delete(Integer id);

	int insert(SpecialTopicAssociation record);

	SpecialTopicAssociation get(Integer id);

	int update(SpecialTopicAssociation record);

	int batchCreate(List<SpecialTopicAssociation> list);

	int batchDelete(Map<String, Object> map);

	int deleteOne(Map<String, Object> map);

	List<ArticleVO> findAssociationArticle(Integer id);

	/**
	 * 方法描述：分页查看文章列表
	 * 
	 * @param id
	 *            专题id
	 * @param rowBounds
	 * @return 文章列表
	 * @author zhaoyonglian 15-6-23
	 */
	List<ArticleVO> associationArticlePageList(@Param("id")Integer id,@Param("userId")String userId,
			NewRowBounds rowBounds);

	/**
	 * 方法描述：列表总个数
	 * 
	 * @param id
	 *            专题id
	 * @return 总个数
	 * @author zhaoyonglian 15-6-24
	 */
	public int count(Integer id);

	/**
	 * 方法描述：获得文章标签
	 * 
	 * @param articleId
	 *            文章id
	 * @return 文章标签
	 * @author zhaoyonglian 15-6-24
	 */
	public List<Label> getLabels(Integer articleId);

	/**
	 * 方法描述：获得文章评论数
	 * 
	 * @param articleId
	 *            文章id
	 * @return 文章评论数
	 * @author zhaoyonglian 15-6-24
	 */
	public int getCommentNums(Integer articleId);

	List<TopicVo> findAssociationTopic(Integer id);

	List<Question> findAssociationQuestion(Integer id);
}