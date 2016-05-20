package com.goujia.website.base.ges.dao;

import java.util.List;

import com.goujia.website.base.ges.entity.MatterAlbum;



public interface MatterAlbumMapper {
    /**
     *  获取物料图册
     * @param matterId
     * @return
     */
    public List<MatterAlbum> listForMatterAlbum(Integer matterId);
    
    /**
     *  获取数量
     * @param matterId
     * @return
     */
    public Integer count(Integer matterId);
}