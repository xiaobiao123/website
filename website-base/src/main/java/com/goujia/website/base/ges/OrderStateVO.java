package com.goujia.website.base.ges;

import com.goujia.goujiabao.state.IState;
import com.goujia.website.base.ges.entity.Order;

public class OrderStateVO {
	
	private IState state;
	private Order order;
	public IState getState() {
		return state;
	}
	public void setState(IState state) {
		this.state = state;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	

}
