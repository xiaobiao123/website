/**
 * Copyright 2014-2015 goujia.com
 * All rights reserved.
 * 
 * @project
 * @author Flouny.Caesar
 * @version 1.0
 * @date 2014-05-21
 */
package com.goujia.website.base.ges.vo;

import com.goujia.lychee.common.error.ErrorCode;
import com.goujia.lychee.common.util.StringUtil;
import com.goujia.lychee.openapi.annotation.Error;

/**
 * 全局错误码
 * 由：模块名+"_"+数字组成
 * 业务模块名以模块名简写字母开头，数字100-999
 * 例如：reg_100 注册失败
 *       login_101 登录失败
 * 
 * @author Flouny.Caesar
 *
 */
public enum BusinessErrorCode implements ErrorCode {
	
	@Error(msg="%s")
	test_000,
	@Error(msg="动态错误信息：%s + %s")
	test_001,
	@Error(msg="动态错误信息：%1$s + %2$s + %2$s + %3$s")
	test_002,
	
	
	@Error(msg="查询错误!")
	member_100,
	@Error(msg="用户已存在!")
	member_101,
	@Error(msg="帐号或密码为空!")
	member_102,
	@Error(msg="注册失败!")
	member_103,
	@Error(msg="用户ID不正确!")
	member_104,
	@Error(msg="用户不存在!")
	member_105,
	@Error(msg="未登录获取用户ID失败!")
	member_106,
	@Error(msg="修改个人信息失败!")
	member_107,
	@Error(msg="登录密码错误!")
	member_108,
	@Error(msg="开通购家宝失败!")
	member_109,
	@Error(msg="修改密码失败!")
	member_111,
	@Error(msg="该用户帐号或密码错误!")
	member_112, 
	@Error(msg="邮件发送失败!")
	member_113,
	@Error(msg="邮箱已存在!")
	member_114,
	/**
	 *找回密码 
	 */
	@Error(msg="重置密码记录添加失败!")
	memberfindpwd_101,
	@Error(msg="该链接已失效!")
	memberfindpwd_102,
	
	/**
	 * 产品包错误码
	 */
	@Error(msg="新增产品包失败！")
	goods_101,
	@Error(msg="城市ID不能为空！")
	goods_102,
	@Error(msg="修改产品包失败！")
	goods_103,
	@Error(msg="4S店ID参数不正确！")
	goods_104,
	@Error(msg="产品包不存在！")
	goods_105,
	@Error(msg="区域不存在！")
	goods_106,
	@Error(msg="城市ID不能为空！")
	goods_107,
	@Error(msg="没有该产品包的房间图片信息！")
	goods_108,
	@Error(msg="没有该产品包的描点信息！")
	goods_109,
	@Error(msg="没有该产品包的物料信息！")
	goods_110,
	@Error(msg="查询产品包描点物料失败！")
	goods_111,
	@Error(msg="新增产品包房屋失败！")
	goods_112,
	@Error(msg="修改产品包房屋失败！")
	goods_113,
	@Error(msg="产品包ID不能为空！")
	goods_114,
	@Error(msg="新增产品包描点信息失败！")
	goods_115,
	@Error(msg="修改产品包描点信息失败！")
	goods_116,
	@Error(msg="新增产品包物料信息失败！")
	goods_117,
	@Error(msg="修改产品包物料信息失败！")
	goods_118,
	@Error(msg="新增产品包户型优化信息失败！")
	goods_119,
	@Error(msg="删除产品包户型优化信息失败！")
	goods_120,
	@Error(msg="新增产品包价格信息失败！")
	goods_121,
	@Error(msg="修改产品包价格信息失败！")
	goods_122,
	@Error(msg="产品包预算类型不存在！")
	goods_123,
	@Error(msg="产品包预算已存在！")
	goods_124,
	@Error(msg="标记ID不能为空！")
	goods_125,
	@Error(msg="标记图片已经存在！")
	goods_126,
	@Error(msg="新增产品包房间细节图片失败!")
	goods_127,
	@Error(msg="修改产品包房间细节图片失败！")
	goods_128,
	@Error(msg="删除产品包失败！")
	goods_129,
	@Error(msg="房间ID不能为空！")
	goods_130,
	@Error(msg="房间锚点操作失败！")
	goods_131,
	@Error(msg="工艺标准锚点操作失败，房间ID不能为空！")
	goods_132,
	@Error(msg="修改产品包户型优化信息失败！")
	goods_133,
	@Error(msg="没有该产品包户型优化信息！")
	goods_134,
	@Error(msg="查询产品包房间信息失败！")
	goods_135,
	@Error(msg="产品包房间信息不存在！")
	goods_136,
	@Error(msg="产品包户型优化信息ID不能为空")
	goods_137,
	@Error(msg="产品包物料信息关系ID不能为空")
	goods_138,
	@Error(msg="产品包房间ID不能为空")
	goods_139,
	@Error(msg="参数错误")
	goods_140,
	@Error(msg="批量新增产品包物料关系失败")
	goods_141,
	@Error(msg="批量删除产品包物料关系失败")
	goods_142,
	@Error(msg="保存产品包十大系统价格失败")
	goods_143,
	@Error(msg="修改产品包状态失败")
	goods_144,
	@Error(msg="查询十大系统价格失败")
	goods_145,
	@Error(msg="存在关联4S店，删除产品包失败！")
	goods_146,
	@Error(msg="新增产品包详细信息失败！")
	goods_147,
	@Error(msg="修改产品包详细信息失败！")
	goods_148,
	@Error(msg="删除产品包详细信息失败！")
	goods_149,
	@Error(msg="没有该产品包详细信息！")
	goods_150,

    /**
     * 房屋错误码
     */
	@Error(msg="房屋ID参数不正确！")
	house_100,
	@Error(msg="房屋新增失败！")
	house_101,
	@Error(msg="房屋修改失败！")
	house_102,
	@Error(msg="房屋删除失败！")
	house_103,
    @Error(msg="房屋查询失败！")
    house_104,
    @Error(msg="房屋存在关联信息，删除失败！")
    house_105,
    
	
	/**
	 * 楼盘错误码
	 */
	@Error(msg="楼盘Id不正确！")
	building_100,
	@Error(msg="楼盘新增失败！")
	building_101,
	@Error(msg="楼盘删除失败！")
	building_102,
	@Error(msg="楼盘查询参数不正确！")
	building_103,
	@Error(msg="楼盘查询失败！")
	building_104,
	@Error(msg="楼盘相册新增失败！")
	building_105,
	@Error(msg="查询楼盘相册失败！")
	building_106,
	@Error(msg="查询楼盘户型失败！")
	building_107,
	@Error(msg="新增房屋失败！")
	building_108,
	@Error(msg="修改房屋失败！")
	building_109,
	@Error(msg="开发商查询失败！")
	building_110,
	@Error(msg="新增订单支付失败！")
	building_111,
	
	
	@Error(msg="存储文件名为空！")
	store_100,
	@Error(msg="存储文件失败！")
	store_101, 
	@Error(msg="上传图片格式不正确！")
	store_102,
	@Error(msg="图片地址不正确！")
	store_103, 
	@Error(msg="文件转换错误！")
	store_104, 
	@Error(msg="文件大小超过限制！")
	store_105, 
	@Error(msg="缩略图转换失败！")
	store_106,
	@Error(msg="图片处理失败！")
	store_107,
	@Error(msg="收藏已存在！")
	
	/**
	 * 我的收藏错误码
	 */
	favor_100, 
	@Error(msg="添加收藏失败！")
	favor_101, 
	@Error(msg="删除收藏失败！")
	favor_102,
	@Error(msg="会员ID不能为空！")
	favor_103,
	@Error(msg="产品ID不能为空！")
	favor_104,
	@Error(msg="4S店ID不能为空！")
	favor_105,
	@Error(msg="您已经收藏过该产品包！")
	favor_106,
	@Error(msg="新增运营商失败！")
	operator_100, 
	@Error(msg="修改运营商失败！")
	operator_101, 
	@Error(msg="删除运营商失败！")
	operator_102, 
	@Error(msg="传入ID参数不正确！")
	operator_103, 
	@Error(msg="查询失败!")
	operator_104, 
	@Error(msg="该运营商下有关联4s店!")
	operator_105, 
	
	
	/**
	 * 4s店错误码
	 */
	@Error(msg="新增4S店失败！")
	shop_100, 
	@Error(msg="修改4S店失败！")
	shop_101,
	@Error(msg="删除4S店失败！")
	shop_102,
	@Error(msg="新增4S店相册失败！")
	shop_103,
	@Error(msg="更新4S店相册失败！")
	shop_104,
	@Error(msg="4S店ID不正确！")
	shop_105,
    @Error(msg="新增4S店关联产品失败！")
    shop_106,
    @Error(msg="更新4S店关联产品失败！")
    shop_107,
    @Error(msg="删除4S店关联产品失败！")
    shop_108,
    @Error(msg="产品ID不正确！")
    shop_109,
    @Error(msg="查询4S店信息失败！")
    shop_110,
    @Error(msg="查询4S店关联产品信息失败！")
    shop_111,
    @Error(msg="查询4S店相册失败！")
    shop_112,
    @Error(msg="删除4S店相册失败！")
    shop_113,
	
	
	@Error(msg="新增内部用户失败！")
	innerUser_100, 
	@Error(msg="修改内部用户失败！")
	innerUser_101, 
	@Error(msg="删除内部用户失败！")
	innerUser_102,
	@Error(msg="内部用户不存在！")
	innerUser_103,
	@Error(msg="用户名或密码不正确！")
	innerUser_104,
	@Error(msg="传入ID参数不正确！")
	innerUser_105,
	@Error(msg="找不到操作的用户信息!")
	innerUser_106,
	@Error(msg="旧登录密码错误!")
	innerUser_107,
	@Error(msg="修改密码错误!")
	innerUser_108,
	@Error(msg="用户名为空!")
	innerUser_109,
	@Error(msg="用户名已存在!")
	innerUser_110,
	
	/**
	 * 发送短信错误码
	 */
	@Error(msg="新增短信失败！")
	sms_100, 
	@Error(msg="修改短信失败！")
	sms_101,
	@Error(msg="删除短信失败！")
	sms_102,
	@Error(msg="短信发送失败！")
	sms_103,
	@Error(msg="验证短信发送失败！")
	sms_104,
	@Error(msg="短信验证失败！")
	sms_105,
	@Error(msg="短信验证码失效！")
	sms_106,
	@Error(msg="短信验证参数错误！")
	sms_107,
	@Error(msg="短信当日发送量超过上限！")
	sms_108,
	
	/**
	 * 订单错误码
	 */
	@Error(msg="创建订单失败！")
	order_100,
	@Error(msg="查询订单失败！")
	order_101,
	@Error(msg="无订单记录！")
	order_102,
	@Error(msg="创建支付单失败！")
	order_110,
	@Error(msg="查询支付单失败！")
	order_111,
	@Error(msg="创建保证金单失败！")
	order_112,
	@Error(msg="查询保证金单失败！")
	order_113,
	
	
	/**
	 * 购家宝错误码
	 */
	@Error(msg="购家宝开通失败！")
	goujiabao_100,
	@Error(msg="购家宝冻结失败！")
	goujiabao_101,
	@Error(msg="购家宝关闭失败！")
	goujiabao_102,
	@Error(msg="订单通知接口参数非法！")
	goujiabao_103,
	@Error(msg="订单通知接口执行失败！")
	goujiabao_104,
	@Error(msg="支付单通知接口参数非法！")
	goujiabao_105,
	@Error(msg="支付单通知接口执行失败！")
	goujiabao_106,
	@Error(msg="进入支付确认时执行失败！")
	goujiabao_107,
	
	@Error(msg="银行更新订单状态失败！")
	goujiabao_111,
	@Error(msg="作废银行订单失败！")
	goujiabao_112,
	@Error(msg="查询银行订单信息失败！")
	goujiabao_113,
	@Error(msg="新增订单支付失败！")
	goujiabao_114,
	@Error(msg="银行更新支付单状态失败！")
	goujiabao_121,
	@Error(msg="查询银行支付单信息失败！")
	goujiabao_122,
	@Error(msg="新增登录日志失败！")
	loginLog_101,
	
	/**
	 * 物料
	 */
	@Error(msg="物料保存失败！")
	matter_100,
	@Error(msg="物料删除失败！")
	matter_101, 
	@Error(msg="物料规格保存失败！")
	matter_102, 
	@Error(msg="物料规格删除失败！")
	matter_103,
	@Error(msg="物料相册保存失败！")
	matter_104,
	@Error(msg="物料相册删除失败！")
	matter_105,
	@Error(msg="物料类目 保存失败！")
	matter_106,
	@Error(msg="物料类目 删除失败！")
	matter_107,
	@Error(msg="物料类价格保存失败！")
	matter_108,
	
	@Error(msg="新增失败！")
	sample_100, 
	@Error(msg="修改失败！")
	sample_101, 
	@Error(msg="删除失败！")
	sample_102 
	;

	public String getCode() {
		
		return this.name();
	}
	
	public final static String SPLIT_CHAR = "|";
	
	/**
	 * 返回错误信息
	 * @return
	 */
	public String getMessage() {
		Error error = null;
		try {
			error = this.getClass().getField(this.getCode()).getAnnotation(Error.class);
		} catch (Exception e) {
			
			return null;
		}
		
		return error.msg();
	}
	
	/**
	 * 
	 */
	public String toString() {
		String message = this.getMessage();

		return this.getCode().concat(SPLIT_CHAR).concat((StringUtil.isBlank(message)?"":message));
	}
	
	/**
	 * 返回错误码+动态错误信息
	 * @return
	 */
	public String toDynamicString(Object...parameters) {
		
		return String.format(this.toString(), parameters);
	}
}

