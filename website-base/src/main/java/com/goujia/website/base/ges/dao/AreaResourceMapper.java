package com.goujia.website.base.ges.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.goujia.website.base.ges.entity.AreaResource;
import com.goujia.website.base.ges.vo.AreaResourceVO;
import com.goujia.website.base.ges.vo.CityVO;

public interface AreaResourceMapper {
    /**
     * 方法描述：查看区域详情
     * 
     * @param id
     * @return
     * @author zhaoyonglian 15-7-8
     */
    public AreaResource queryArea(int id);

    /**
     * 方法描述：子区域列表 用到这个
     * 
     * @param parentId
     * @return
     * @author zhaoyonglian 15-7-8
     */
    public List<AreaResource> listArea(int parentId);

    /**
     * 方法描述：查询子区域 条件 头部用到这个
     * 
     * @param area
     *            parentId isAdd
     * @return
     * @author zhaoyonglian 15-7-8
     */
    public List<AreaResource> list(AreaResource area);

    /**
     * 方法描述：查询区域 条件
     * 
     * @param area
     *            id isAdd
     * @return
     * @author zhaoyonglian 15-7-8
     */
    public AreaResource query(AreaResource area);

    public List<CityVO> listcountry(AreaResource area);

    public List<AreaResource> listabcde(AreaResource area);

    public List<AreaResource> listfghij(AreaResource area);

    public List<AreaResource> listklmnp(AreaResource area);

    public List<AreaResource> listqrstw(AreaResource area);

    public List<AreaResource> listxyz(AreaResource area);

    public List<CityVO> listabcde1(AreaResource area);

    public List<CityVO> listfghij1(AreaResource area);

    public List<CityVO> listklmnp1(AreaResource area);

    public List<CityVO> listqrstw1(AreaResource area);

    public List<CityVO> listxyz1(AreaResource area);

    /**
     * 
     * @Description 获得城市或者省份列表
     * @param parentId
     *            上级id
     * @return 城市或者省份列表
     * @author zhaoyonglian
     * @date 2015年9月7日 下午5:45:46
     */
    public List<AreaResourceVO> listAll(Integer parentId);

	
	/**
	* @Description  
	* @param parentId
	* @return
	* @author chenghao   
	* @date Sep 11, 2015 2:12:35 PM
	*/
	public List<AreaResourceVO> listIsAddAndCityAll();

	
	/**
	* @Description  
	* @param parentId
	* @return
	* @author chenghao   
	* @date Sep 11, 2015 4:53:03 PM
	*/
	public AreaResourceVO get(@Param("id")Integer id);

	public AreaResource getByName(@Param("name")String name);

	public List<AreaResource> getAll(@Param("isAdd")String isAdd,@Param("isCity")String isCity);

	public List<AreaResource> getAllByParent(@Param("parent")Integer parent);

}