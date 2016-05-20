package com.goujia.website.base.dao.shop;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.goujia.website.base.entity.shop.Building;
import com.goujia.website.base.entity.shop.Goods;
import com.goujia.website.base.mybatis.page.session.NewRowBounds;
import com.goujia.website.base.vo.shop.ShopVO;


public interface ShopMapper {

	long count(ShopVO param);

	List<ShopVO> findAll(ShopVO param, NewRowBounds newRowBounds);

	List<String> findNeighborhoodByShopId(@Param("shop")Integer id);

	ShopVO getById(@Param("shop")Integer id);

	List<Building> findNeighborhoodDetailByShopId(@Param("shop")Integer id);

	List<String> getAllImageById(@Param("shop")Integer id);

	List<Goods> getAllGoodsById(@Param("shop")Integer id);

	List<ShopVO> findAllByCounty(@Param("county")Integer county);
	List<ShopVO> findAllByCity(@Param("city")Integer city);

   
}