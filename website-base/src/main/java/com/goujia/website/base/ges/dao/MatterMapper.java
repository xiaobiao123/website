package com.goujia.website.base.ges.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.goujia.website.base.ges.entity.Matter;
import com.goujia.website.base.ges.vo.MatterVO;
import com.goujia.website.base.mybatis.page.session.NewRowBounds;

public interface MatterMapper {
    /**
     * 方法描述：根据产品包查询，物料标配总数
     * 
     * @param matterVO
     * @return
     * @author zhaoyonglian 15-7-10
     */
    public int countByGoodsId(MatterVO matterVO);

    /**
     * 方法描述：根据产品包查询，分页查询物料信息
     * 
     * @param matterVO
     * @param newRowBounds
     * @return
     * @author zhaoyonglian 15-7-10
     */
    public List<MatterVO> pageForByGoodsId(MatterVO matterVO,
            NewRowBounds newRowBounds);
    
    /**
     * 方法描述：根据产品包查询物料信息
     * 
     * @param matterVO
     * @param newRowBounds
     * @return
     * @author zhaoyonglian 15-7-10
     */
    public List<MatterVO> listForByGoodsId(MatterVO matterVO);

    /**
     * 方法描述：通过产品包id获取物料标配id字符串
     * 
     * @param goodsId
     * @return
     * @author zhaoyonglian 15-7-14
     */
    public String getMatterIds(Integer goodsId);

    /**
     * 方法描述：查看物料详情
     * 
     * @param markId
     * @param type
     * @return
     */
    public List<MatterVO> listForMatterByMark(
            @Param(value = "markId") Integer markId,
            @Param(value = "type") String type);
    /**
     * 方法描述：仅查看物料信息
     * @param id  物料id
     * @return 物料信息
     * @author  zhaoyonglian 15-9-11
     */
    public Matter query(Integer id);
}