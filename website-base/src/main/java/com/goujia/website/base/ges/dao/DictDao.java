/**
 * 
 */
package com.goujia.website.base.ges.dao;

import java.util.List;

import com.goujia.website.base.ges.entity.Dict;



/**
 * dao接口
 * @author User
 *
 */
public interface DictDao {
	
	public List<Dict> queryByCIP(Dict dict);
	
	public Dict queryRate(Dict dict);

}
