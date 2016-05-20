package com.goujia.website.base.sync;

import java.util.List;

import com.goujia.website.base.ges.entity.AreaResource;
import com.goujia.website.base.vo.shop.ShopVO;

public interface ShopSync extends BaseSync<ShopVO>{
	ShopVO getById(Integer id);
}
