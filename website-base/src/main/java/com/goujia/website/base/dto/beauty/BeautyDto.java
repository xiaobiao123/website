package com.goujia.website.base.dto.beauty;

import com.goujia.website.base.dto.base.ResultDto;
import com.goujia.website.base.ges.entity.GoodsRoom;
import com.goujia.website.base.ges.vo.GoodsBuildingVO;

public class BeautyDto extends ResultDto<GoodsRoom> {
	private static final long serialVersionUID = 8472504372064505643L;
	private Integer support_c;
	private Boolean is_supported;
	private Boolean is_collected;
	public Boolean getIs_supported() {
		return is_supported;
	}
	public void setIs_supported(Boolean is_supported) {
		this.is_supported = is_supported;
	}
	public Boolean getIs_collected() {
		return is_collected;
	}
	public void setIs_collected(Boolean is_collected) {
		this.is_collected = is_collected;
	}
	public Integer getSupport_c() {
		return support_c;
	}
	public void setSupport_c(Integer support_c) {
		this.support_c = support_c;
	}
	private Integer collection_c;
	public Integer getCollection_c() {
		return collection_c;
	}
	public void setCollection_c(Integer collection_c) {
		this.collection_c = collection_c;
	}
	public GoodsBuildingVO getGoods() {
		return goods;
	}
	public void setGoods(GoodsBuildingVO goods) {
		this.goods = goods;
	}
	private GoodsBuildingVO goods;
}
