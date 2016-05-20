package com.goujia.website.base.dao.article;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.goujia.website.base.entity.article.Label;
import com.goujia.website.base.entity.dict.Dictionary;
import com.goujia.website.base.mybatis.page.session.NewRowBounds;
import com.goujia.website.base.vo.article.LabelSearchParam;
import com.goujia.website.base.vo.article.LabelVO;

public interface LabelMapper {
    int delete(Label label);

    int insert(Label record);

    Label get(Integer id);
    
    List<Label> getParentLabel(Label label);

    int update(Label record);

    List<LabelVO> list(LabelSearchParam labelSearchParam, NewRowBounds rowBounds);

	int count(LabelSearchParam labelSearchParam);
	
	List<LabelVO> searchLabel(Label label);

	List<LabelVO> findAllParentByPeroperty(Dictionary peroperty);

	List<LabelVO> findAllChildByParent(@Param("parentId")Integer parentId);

	void batchUpdateByParentId(@Param("peroperty")Integer peroperty, @Param("parent")Integer parentId);

	void reuse(@Param("id")Integer id);
	
	Label getForLableName(String  lableName);
	
	List<Label> getForLableId(int id);
	
	List<Label> getForLableParentId(int parentId);
	
	List<Label> getLableForTopic();
	
	List<LabelVO> findAllParentByPeropertyHome(@Param("number")Integer number);

	List<LabelVO> findAllChildByParentHome(@Param("number")Integer number);
}