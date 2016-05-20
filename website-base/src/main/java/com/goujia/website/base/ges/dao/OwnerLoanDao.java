package com.goujia.website.base.ges.dao;

import com.goujia.website.base.ges.entity.LoanApplyInfo;
import com.goujia.website.base.ges.vo.LoanApplyInfoExt;


/**
 * 业主贷款dao接口
 * @author User
 *
 */
public interface OwnerLoanDao {
	
	/**
	 * 根据订单id查询要贷款的订单的信息
	 * 在这里进行数据的处理，根据产品包的类型，处理装修房的面积
	 * @param orderId
	 */
	public LoanApplyInfoExt queryLoanOrderInfo(int orderId);
	
	/**
	 * 保存业主贷款信息
	 * @param loanApplyInfo
	 */
	public int addOwnerLoanInfo(LoanApplyInfo loanApplyInfo);
	
	/**
	 * 更新贷款信息状态
	 * @param loanApplyInfo
	 * @return
	 */
	public int updateOwnerLoanInfoStatus(LoanApplyInfo loanApplyInfo);
	
	public int countOwnerLoanTimes(int orderId);
	
	public int countApplyTimes(int orderId);

}
