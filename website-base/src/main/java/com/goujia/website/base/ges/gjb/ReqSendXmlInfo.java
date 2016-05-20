package com.goujia.website.base.ges.gjb;

/**
 * 发送给工商银行的req节点的xml信息
 * @author User
 *
 */
public class ReqSendXmlInfo extends PayToXml {
	
	private String contractno;// 合同号(对应构家网的订单号)
    private String subsellerid;// 二级商户编号，对应构家网装修公司编号
    private String subsellername;// 二级商户名称，对应构家网装修公司名称
    private String houseaddr;// 申请客户装修房地址
    private String housesize;// 申请客户装修房面积
    private String amount;// 贷款：构家网装修合同总金额  确认支付、退款：金额，确认支付
    private String custname;// 申请客户姓名
    private String idtype;// 申请客户身份证类型
    private String idno;// 申请客户身份证编号
    private String me;// 客户婚姻状况
    private String corpname;// 申请客户工作单位
    private String mobile;// 贷款：申请客户联系电话  确认支付、退款：原保证金交易登记的电话
    private String yearincome;// 申请客户年收入
    private String housetype;// 申请客户装修房属性
    private String houseowntype;// 申请客户装修房产权性质
    private String loanamount;// 信用卡分期付款申请金额
    private String term;// 申请期数
    
    private String paytype;//支付类型，0-确认支付；1-确认退货
    private String orderno;//原保证金交易支付流水号
    private String orderstatus;// 订单状态
    
    private String validcode;//网页确认支付的短信验证码
    
    
	public String getContractno() {
		return contractno;
	}
	public void setContractno(String contractno) {
		this.contractno = contractno;
	}
	public String getSubsellerid() {
		return subsellerid;
	}
	public void setSubsellerid(String subsellerid) {
		this.subsellerid = subsellerid;
	}
	public String getSubsellername() {
		return subsellername;
	}
	public void setSubsellername(String subsellername) {
		this.subsellername = subsellername;
	}
	public String getHouseaddr() {
		return houseaddr;
	}
	public void setHouseaddr(String houseaddr) {
		this.houseaddr = houseaddr;
	}
	public String getHousesize() {
		return housesize;
	}
	public void setHousesize(String housesize) {
		this.housesize = housesize;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getIdtype() {
		return idtype;
	}
	public void setIdtype(String idtype) {
		this.idtype = idtype;
	}
	public String getIdno() {
		return idno;
	}
	public void setIdno(String idno) {
		this.idno = idno;
	}
	public String getMe() {
		return me;
	}
	public void setMe(String me) {
		this.me = me;
	}
	public String getCorpname() {
		return corpname;
	}
	public void setCorpname(String corpname) {
		this.corpname = corpname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getYearincome() {
		return yearincome;
	}
	public void setYearincome(String yearincome) {
		this.yearincome = yearincome;
	}
	public String getHousetype() {
		return housetype;
	}
	public void setHousetype(String housetype) {
		this.housetype = housetype;
	}
	public String getHouseowntype() {
		return houseowntype;
	}
	public void setHouseowntype(String houseowntype) {
		this.houseowntype = houseowntype;
	}
	public String getLoanamount() {
		return loanamount;
	}
	public void setLoanamount(String loanamount) {
		this.loanamount = loanamount;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public String getPaytype() {
		return paytype;
	}
	public void setPaytype(String paytype) {
		this.paytype = paytype;
	}
	public String getOrderno() {
		return orderno;
	}
	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}
	public String getOrderstatus() {
		return orderstatus;
	}
	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}
    

}
