/**
 * Copyright 2014-2015 goujia.com
 * All rights reserved.
 * 
 * @project
 * @author caoqi
 * @version 1.0
 * @date 2014-06-12
 */
package com.goujia.website.base.ges.entity;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 支付单
 * 
 * @author caoqi
 * @date 2014-06-12
 *
 */
public class OrderPayment {
	/**
	 * 主键ID
	 */
	private Integer id;
	
	/**
	 * 序号
	 */
	private Integer indexNumber;
	
	/**
	 * 关联订单
	 * G_ORDER.ID
	 */
	private Integer orderId;
	
	/**
	 * 名称
	 */
	private String name;
	
	/**
	 * 记录创建时间
	 */
	private Date gmtCreate;
	
	/**
	 * 记录修改时间
	 */
	private Date gmtModified;

	/**
	 * 支付金额
	 */
	private BigDecimal amount;

	/**
	 * 支付状态
	 * 'inited'|'paying'|'payed':'初始化'|'待买家确认支付'|'买家已支付'
	 * 当订单记录创建时，自动生成所有支付单记录，状态为'inited'
	 */
	private String status;

	/**
	 * 备注
	 */
	private String memo;

	/**
	 * 支付后产生的利息
	 */
	private BigDecimal interest;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIndexNumber() {
		return indexNumber;
	}

	public void setIndexNumber(Integer indexNumber) {
		this.indexNumber = indexNumber;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public BigDecimal getInterest() {
		return interest;
	}

	public void setInterest(BigDecimal interest) {
		this.interest = interest;
	}



}