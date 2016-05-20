package com.goujia.website.base.dao.system;

import java.util.List;

import com.goujia.website.base.entity.system.SystemProperty;
import com.goujia.website.base.mybatis.page.session.NewRowBounds;
import com.goujia.website.base.vo.BaseSearchParam;

/**
 * 
* @Description: 系统属性mapper类
* @author  zhaoyonglian
* @date 2015年11月20日 下午2:13:36
*
 */
public interface SystemPropertyMapper {
    
    /**
     * 
    * @Description  系统属性列表
    * @return
    * @author zhaoyonglian   
    * @date 2015年11月20日 下午2:14:19
     */
    public List<SystemProperty> pageList(BaseSearchParam param,NewRowBounds newRowBounds);
    
    /**
     * 
    * @Description  系统属性数量
    * @return
    * @author zhaoyonglian   
    * @date 2015年11月20日 下午2:25:50
     */
    public Integer pageListCount();
    
    /**
     * 
    * @Description  系统属性详情
    * @param id
    * @return
    * @author zhaoyonglian   
    * @date 2015年11月20日 下午2:14:45
     */
    public SystemProperty getById(Integer id);
    
    /**
     * 
    * @Description  修改系统属性
    * @param property
    * @return
    * @author zhaoyonglian   
    * @date 2015年11月20日 下午2:15:19
     */
    public int  update(SystemProperty property);
    
    /**
     * 
    * @Description  根据属性获取value值
    * @param key
    * @return
    * @author zhaoyonglian   
    * @date 2015年12月1日 下午1:25:38
     */
    public SystemProperty getByKey(String key);
}