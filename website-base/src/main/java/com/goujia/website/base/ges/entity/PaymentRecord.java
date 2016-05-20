package com.goujia.website.base.ges.entity;

import java.sql.Timestamp;
import java.util.Calendar;

import com.goujia.website.base.entity.system.User;

/**
 *
 * 所有的支付、转账记录
 * created by 重剑 on 2015/5/23
 *
 */
public class PaymentRecord {

    private Integer id;
    private String isDeleted = "n";
    private Timestamp gmtCreate = new Timestamp(Calendar.getInstance().getTimeInMillis());
    private Timestamp gmtModified = gmtCreate;
    private Timestamp gmtSuccess = gmtCreate;

    private Order order;

    /* 这个是跟插入记录时的 order.status 对应的 */
    private String orderStatus;

    private User operator;

    /* 交易金额，单位分 */
    private Integer money;

    /* 支付方式也就是交易渠道：1=刷pos机 2=网银支付 */
    private Integer mode = 1;

    /* 支付类型也就是交易类型：1=支付10%订金、2=分期付款、3=退货、4=确认支付、5=支付90%保证金 */
    private Integer action = 1;

    /* 支付状态，1=准备支付、2=已获得pos机或者银行的响应信息，此时记录不应该做任何变更了 */
    private Integer status = 1;

    /* 支付号，由java代码生成 */
    private String code;

    /* 刷卡时的POS机编号 */
    private String posSN;

    /* 资金流出的账户 */
    private String sourceAccount;

    /* 资金流出账户的关联身份证号 */
    private String sourceAccountIDCard;

    /* 资金流出账户的户主名 */
    private String sourceAccountName;

    /* 资金流出账户的关联手机 */
    private String sourceAccountMobile;

    /* 资金流入的账户 */
    private String targetAccount;

    /* 资金流入账户的关联身份证号 */
    private String targetAccountIDCard;

    /* 资金流入账户的户主名 */
    private String targetAccountName;

    /* 资金流入账户的关联手机 */
    private String targetAccountMobile;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Timestamp getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Timestamp gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Timestamp getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Timestamp gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Timestamp getGmtSuccess() {
        return gmtSuccess;
    }

    public void setGmtSuccess(Timestamp gmtSuccess) {
        this.gmtSuccess = gmtSuccess;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public User getOperator() {
        return operator;
    }

    public void setOperator(User operator) {
        this.operator = operator;
    }

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	public Integer getMode() {
        return mode;
    }

    public void setMode(Integer mode) {
        this.mode = mode;
    }

    public Integer getAction() {
        return action;
    }

    public void setAction(Integer action) {
        this.action = action;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPosSN() {
        return posSN;
    }

    public void setPosSN(String posSN) {
        this.posSN = posSN;
    }

    public String getSourceAccount() {
        return sourceAccount;
    }

    public void setSourceAccount(String sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    public String getSourceAccountIDCard() {
        return sourceAccountIDCard;
    }

    public void setSourceAccountIDCard(String sourceAccountIDCard) {
        this.sourceAccountIDCard = sourceAccountIDCard;
    }

    public String getSourceAccountName() {
        return sourceAccountName;
    }

    public void setSourceAccountName(String sourceAccountName) {
        this.sourceAccountName = sourceAccountName;
    }

    public String getSourceAccountMobile() {
        return sourceAccountMobile;
    }

    public void setSourceAccountMobile(String sourceAccountMobile) {
        this.sourceAccountMobile = sourceAccountMobile;
    }

    public String getTargetAccount() {
        return targetAccount;
    }

    public void setTargetAccount(String targetAccount) {
        this.targetAccount = targetAccount;
    }

    public String getTargetAccountIDCard() {
        return targetAccountIDCard;
    }

    public void setTargetAccountIDCard(String targetAccountIDCard) {
        this.targetAccountIDCard = targetAccountIDCard;
    }

    public String getTargetAccountName() {
        return targetAccountName;
    }

    public void setTargetAccountName(String targetAccountName) {
        this.targetAccountName = targetAccountName;
    }

    public String getTargetAccountMobile() {
        return targetAccountMobile;
    }

    public void setTargetAccountMobile(String targetAccountMobile) {
        this.targetAccountMobile = targetAccountMobile;
    }
}
