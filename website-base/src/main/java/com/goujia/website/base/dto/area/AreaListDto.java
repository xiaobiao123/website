package com.goujia.website.base.dto.area;

import java.util.List;

import com.goujia.website.base.dto.base.ResultDto;
import com.goujia.website.base.ges.entity.AreaResource;

public class AreaListDto extends ResultDto<AreaResource>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4981613235905355191L;
	private List<AreaResource> list;
	private Long time;
	public Long getTime() {
		return time;
	}
	public void setTime(Long time) {
		this.time = time;
	}
	public List<AreaResource> getList() {
		return list;
	}
	public void setList(List<AreaResource> list) {
		this.list = list;
	}
	
}
