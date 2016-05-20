package com.goujia.website.base.ges.dao;

import java.util.List;
import java.util.Map;

import com.goujia.website.base.ges.entity.MultiplePayment;
import com.goujia.website.base.ges.vo.MultiplePaymentVO;


public interface MultiplePaymentMapper {
    
    /**
     * 添加记录
     * @param multiplePayment
     * @return
     */
    public int addMultiplePayment(MultiplePayment multiplePayment);
    
    /**
     * 删除记录
     * @param multiplePayment
     * @return
     */
    public boolean deleteRecordById(MultiplePayment multiplePayment);
    
    /**
     * 更新记录的支付状态
     * @param multiplePayment
     * @return
     */
    public int updatePayStatus(MultiplePayment multiplePayment);
    
    /**
     * 查询某一个阶段的最新的未支付的记录
     * @param multiplePayment
     * @return
     */
    public MultiplePayment queryLatestRecordNoPay(MultiplePayment multiplePayment);
    
    /**
     * 查询某一个阶段是否有未支付的记录
     * @param multiplePayment
     * @return
     */
    public List<MultiplePayment> queryRecordNoPay(MultiplePayment multiplePayment);
    
    /**
     * 根据记录ID更新记录信息
     * @param multiplePayment
     * @return
     */
    public boolean updateRecordById(MultiplePayment multiplePayment);
    
    /**
     * chaxun
     * @param multiplePayment
     * @return
     */
    public Map<String, Object> queryPaymentRecord(MultiplePayment multiplePayment);
    
    /**
     * 查询已支付的金额(待到账和已到账)
     * @param multiplePayment
     * @return
     */
    public long queryPayedMoney(MultiplePayment multiplePayment);
    
    /**
     * 更新订单状态
     * @param orderId
     * @return
     */
    public int updateOrderStatus(int orderId);
    
    /**
     * 更新支付记录的支付流水号
     * @param multiplePayment
     * @return
     */
    public int updateSerialPayNo(MultiplePayment multiplePayment);
    
    /**
     * 查询已到账的总金额
     * @param multiplePayment
     * @return
     */
    public long queryCompletePay(MultiplePayment multiplePayment);
    
    /**
     * 线下收款，更新订单状态
     * @param orderId
     * @return
     */
    public int updateOrderStausOffline(int orderId);
    
    public int updateMultiplePayStatus(MultiplePayment mp);
    
    /**
     * 个人中心 查询支付记录
     * @param orderId
     * @return
     */
    public List<MultiplePaymentVO> queryPersonalPaymentRecord(int orderId);
    
    /**
     * 查询90%支付的金额
     * @param orderId
     * @return
     */
    public long queryCreditPaymentRecord(int orderId);

}
