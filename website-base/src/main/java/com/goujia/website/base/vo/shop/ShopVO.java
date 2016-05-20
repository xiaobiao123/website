package com.goujia.website.base.vo.shop;

import java.util.List;

import com.goujia.website.base.entity.shop.Building;
import com.goujia.website.base.entity.shop.Goods;
import com.goujia.website.base.entity.shop.Shop;

public class ShopVO extends Shop{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3936115506135883339L;
	private List<String>  supportNeighborhood;
	private List<Building> buildingList;
	private List<String> imageList;
	private List<Goods> goodsList;
	private Integer cityType;
	public Integer getCityType() {
		return cityType;
	}
	public void setCityType(Integer cityType) {
		this.cityType = cityType;
	}
	public List<Goods> getGoodsList() {
		return goodsList;
	}
	public void setGoodsList(List<Goods> goodsList) {
		this.goodsList = goodsList;
	}
	public List<String> getImageList() {
		return imageList;
	}
	public void setImageList(List<String> imageList) {
		this.imageList = imageList;
	}
	public List<String> getSupportNeighborhood() {
		return supportNeighborhood;
	}
	public void setSupportNeighborhood(List<String> supportNeighborhood) {
		this.supportNeighborhood = supportNeighborhood;
	}
	public List<Building> getBuildingList() {
		return buildingList;
	}
	public void setBuildingList(List<Building> buildingList) {
		this.buildingList = buildingList;
	}
}
