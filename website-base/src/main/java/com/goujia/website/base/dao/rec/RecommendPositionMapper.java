package com.goujia.website.base.dao.rec;

import java.util.List;

import com.goujia.website.base.entity.rec.RecommendPosition;
import com.goujia.website.base.mybatis.page.session.NewRowBounds;
import com.goujia.website.base.vo.rec.RecommendPositionSearchParam;
import com.goujia.website.base.vo.rec.RecommendPositionVO;

public interface RecommendPositionMapper {
	int delete(Integer posId);

	int insert(RecommendPosition record);

	int update(RecommendPosition record);
	
	RecommendPositionVO get(Integer posId);
	
	List<RecommendPositionVO> list(RecommendPositionSearchParam searchParam, NewRowBounds rowBounds);
	
	int count(RecommendPositionSearchParam searchParam);
	
	RecommendPosition getForPosCode(String posCode);
}