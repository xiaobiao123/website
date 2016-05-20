package com.goujia.website.base.ges.dao;

import com.goujia.website.base.ges.entity.Order;
import com.goujia.website.base.ges.entity.PaymentRecord;


public interface PaymentRecordMapper {
    /**
     * 根据订单编号查询订单支付详情
     */
    public  PaymentRecord   queryByOrderId(Integer id);
    
    public int updateByBankResponse(PaymentRecord record);
    
    public int abandonRelatedPaymentRecord(Order order);
    
    /**
     * 
    * @Description  新增订单支付数据
    * @param record
    * @return
    * @author zhaoyonglian   
    * @date 2015年8月10日 下午3:32:48
     */
    public int create(PaymentRecord record);
    
    /**
     *  
    * @Description  软删除
    * @param id
    * @return
    * @author zhaoyonglian   
    * @date 2015年8月10日 下午3:33:27
     */
    public int delete(Integer id);
    
    public PaymentRecord queryForPaymentRecord(PaymentRecord record);
    
    /**
     * 
    * @Description  修改订单支付状态
    * @param record
    * @return
    * @author zhaoyonglian   
    * @date 2015年8月10日 下午3:34:37
     */
    public int updateForPaymentRecord(PaymentRecord record);
    
    public PaymentRecord queryPaymentRecord(PaymentRecord record);
    
    public PaymentRecord judgeTimeInterval(int id);
    
    public int updatePayRecordStatus(PaymentRecord record);
}