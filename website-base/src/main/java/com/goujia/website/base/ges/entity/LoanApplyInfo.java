package com.goujia.website.base.ges.entity;

import java.math.BigDecimal;
import java.util.Date;


/**
 * 业主贷款申请信息
 * @author User
 *
 */
public class LoanApplyInfo implements IEntity {

	private static final long serialVersionUID = 1L;
	
	/**
     * 主键ID
     */
    private Integer id;
    
    //订单Id
    private Integer orderId;
    
    //4S店id
    private Integer shopId;
    
    //4S点编码
    private String shopCode;
    
    //4s店名称
    private String shopName;
    
    //产品包ID
    private Integer goodsId;
    
    //装修房地址
    private String houseAddress;
    
    //装修房面积
    private Double houseAcreage;
    
    //订单总金额
    private BigDecimal totalAmount;
    
    //省份代号
    private Integer province;
    
    //地市编码
    private String cityCode;

    /**
     * 申请客户姓名
     */
    private String customerName;

    /**
     * 申请客户身份证明类型
     */
    private String identityType;

    /**
     * 申请客户身份证明号码
     */
    private String identityNumber;
    
    /**
     * 申请客户工作单位
     */
    private String workDept;

    /**
     * 申请客户联系电话
     */
    private String phone;

    /**
     * 申请客户年收入
     */
    private BigDecimal yearIncome;

    /**
     * 申请客户装修房产属性
     */
    private String houseType;

    /**
     * 申请客户装修房产权性质
     */
    private String houseOwnType;

    /**
     * 客户婚姻状况
     */
    private String maritalStatus;

    /**
     * 信用卡分期付款申请金额
     */
    private BigDecimal amount;

    /**
     * 利率
     */
    private Double rate;

    /**
     * 首月还款额
     */
    private BigDecimal firstMonthRepay;

    /**
     * 每月还款额
     */
    private BigDecimal everyMonthRepay;

    /**
     * 申请期数
     */
    private Integer term;

    /**
     * 贷款的流水号
     */
    private String cmptxsno;
    
    //贷款申请状态
    private Integer loanApplyStatus=0;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public String getShopCode() {
		return shopCode;
	}

	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
	}
	
	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getHouseAddress() {
		return houseAddress;
	}

	public void setHouseAddress(String houseAddress) {
		this.houseAddress = houseAddress;
	}

	public Double getHouseAcreage() {
		return houseAcreage;
	}

	public void setHouseAcreage(Double houseAcreage) {
		this.houseAcreage = houseAcreage;
	}

	public Integer getProvince() {
		return province;
	}

	public void setProvince(Integer province) {
		this.province = province;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getIdentityType() {
		return identityType;
	}

	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public String getWorkDept() {
		return workDept;
	}

	public void setWorkDept(String workDept) {
		this.workDept = workDept;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public BigDecimal getYearIncome() {
		return yearIncome;
	}

	public void setYearIncome(BigDecimal yearIncome) {
		this.yearIncome = yearIncome;
	}

	public String getHouseType() {
		return houseType;
	}

	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}

	public String getHouseOwnType() {
		return houseOwnType;
	}

	public void setHouseOwnType(String houseOwnType) {
		this.houseOwnType = houseOwnType;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public BigDecimal getFirstMonthRepay() {
		return firstMonthRepay;
	}

	public void setFirstMonthRepay(BigDecimal firstMonthRepay) {
		this.firstMonthRepay = firstMonthRepay;
	}

	public BigDecimal getEveryMonthRepay() {
		return everyMonthRepay;
	}

	public void setEveryMonthRepay(BigDecimal everyMonthRepay) {
		this.everyMonthRepay = everyMonthRepay;
	}

	public Integer getTerm() {
		return term;
	}

	public void setTerm(Integer term) {
		this.term = term;
	}

	public String getCmptxsno() {
		return cmptxsno;
	}

	public void setCmptxsno(String cmptxsno) {
		this.cmptxsno = cmptxsno;
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

	public Integer getLoanApplyStatus() {
		return loanApplyStatus;
	}

	public void setLoanApplyStatus(Integer loanApplyStatus) {
		this.loanApplyStatus = loanApplyStatus;
	}

	public Integer getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
    


}
