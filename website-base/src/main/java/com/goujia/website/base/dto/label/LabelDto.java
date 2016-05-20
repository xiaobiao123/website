package com.goujia.website.base.dto.label;

import java.util.List;

import com.goujia.website.base.dto.base.ResultDto;
import com.goujia.website.base.entity.article.Label;
import com.goujia.website.base.vo.article.LabelVO;

public class LabelDto extends ResultDto<Label> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8713058969287512128L;
	private List<LabelVO> parentList;
	public List<LabelVO> getParentList() {
		return parentList;
	}
	public void setParentList(List<LabelVO> parentList) {
		this.parentList = parentList;
	}
}
