package com.goujia.website.base.dao.rec;

import java.util.List;

import com.goujia.website.base.entity.rec.RecommendInfo;
import com.goujia.website.base.mybatis.page.session.NewRowBounds;
import com.goujia.website.base.vo.rec.RecommendInfoSearchParam;
import com.goujia.website.base.vo.rec.RecommendInfoVO;

public interface RecommendInfoMapper {
	int delete(Integer recId);

	int insert(RecommendInfo record);

	int update(RecommendInfo record);

	RecommendInfoVO get(Integer recId);

	List<RecommendInfoVO> list(RecommendInfoSearchParam searchParam,
			NewRowBounds rowBounds);

	int count(RecommendInfoSearchParam searchParam);

	List<RecommendInfo> getListForPosId(int posId);

	/**
	 * 方法描述：分页查看热门问答
	 * 
	 * @param searchParam
	 *            搜索条件
	 * @param rowBounds
	 *            分页
	 * @return 热门问答列表
	 * @author zhaoyonglian 15-6-18
	 */
	List<RecommendInfoVO> listHotQuestion(RecommendInfoSearchParam searchParam,
			NewRowBounds rowBounds);
}