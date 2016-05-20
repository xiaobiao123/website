package com.goujia.website.base.ges.dao;

import java.util.List;

import com.goujia.website.base.ges.entity.GoodsDiyMatter;
import com.goujia.website.base.ges.vo.GoodsDiyMatterVO;

/**
 * 
 * @Description: diy物料关系表
 * @author zhaoyonglian
 * @date 2015年9月21日 下午5:42:28
 * 
 */
public interface GoodsDiyMatterMapper {
    /**
     * 
     * @Description 查看房间物料列表
     * @param roomId
     *            房间id oprateType 操作类型
     * @return
     * @author zhaoyonglian
     * @date 2015年9月28日 下午8:12:22
     */
    public List<GoodsDiyMatterVO> listRoomDiyMatter(GoodsDiyMatter matter);

    /**
     * 
     * @Description 查询更换前物料的信息
     * @param matter
     *            goodsId matterId roomId
     * @return
     * @author zhaoyonglian
     * @date 2015年9月28日 下午8:12:47
     */
    public List<GoodsDiyMatterVO> queryOriginalMatter(GoodsDiyMatter matter);
    
    /**
     * 
    * @Description  查看是否为减配
    * @param matter
    * @return
    * @author zhaoyonglian   
    * @date 2015年11月6日 上午11:38:00
     */
    public GoodsDiyMatter isDecrease(GoodsDiyMatter matter);
}