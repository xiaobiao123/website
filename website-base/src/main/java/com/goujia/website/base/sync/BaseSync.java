package com.goujia.website.base.sync;

import java.util.List;

import com.goujia.website.base.utils.Page;
import com.goujia.website.base.vo.PageParam;

public interface BaseSync<T>{
	List<T> pullList(T param);
	T pullOne(T param);
	Page<T> pullListWithPage(PageParam page,T param);
}
