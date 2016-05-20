package com.goujia.website.base.ges.dao;

import java.util.List;

import com.goujia.website.base.ges.vo.GoodsDiyVO;
import com.goujia.website.base.mybatis.page.session.NewRowBounds;

/**
 * 
* @Description:  diy关系表
* @author  zhaoyonglian
* @date 2015年9月21日 下午5:42:28
*
 */
public interface GoodsDiyMapper {
    /**
     * 
    * @Description  计数产品包下面的diy数量
    * @param goodsId  产品包id
    * @return
    * @author zhaoyonglian   
    * @date 2015年9月22日 上午9:22:44
     */
    public int countByStandardDiyId(Integer diyId); 
    
    /**
     * 
    * @Description  个人中心我的diy列表
    * @param userId  用户id
    * @return
    * @author zhaoyonglian   
    * @date 2015年9月24日 上午10:31:19
     */
    public List<GoodsDiyVO> listDiy(Integer userId,NewRowBounds newRowBounds);
    
    /**
     * 
    * @Description  个人中心我的diy列表个数
    * @param userId 用户id
    * @return
    * @author zhaoyonglian   
    * @date 2015年11月23日 下午3:50:06
     */
    public Integer listDiyCount(Integer userId);
    
    /**
     *  
    * @Description  通过diy id获取上级标准diy产品包id
    * @param diyId  
    * @return
    * @author zhaoyonglian   
    * @date 2015年10月8日 上午11:54:38
     */
    public Integer getRelationDiyId(Integer diyId);
    
    /**
     * 
    * @Description  获取标准可diy产品包
    * @param goodsId  产品包id
    * @return
    * @author zhaoyonglian   
    * @date 2015年10月9日 上午2:09:52
     */
    public Integer getStandardDiyId(Integer goodsId);
    
    /**
     * 
    * @Description  获取源生产品包id
    * @param diyId  
    * @return
    * @author zhaoyonglian   
    * @date 2015年10月29日 上午10:51:00
     */
    public Integer getRelationGoodsId(Integer diyId);
}