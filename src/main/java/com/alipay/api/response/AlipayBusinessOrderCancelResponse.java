package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.business.order.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-12 10:39:48
 */
public class AlipayBusinessOrderCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 8153747899667122796L;

	/** 
	 * 商户外部订单号
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/** 
	 * 支付宝订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}
	public String getMerchantOrderNo( ) {
		return this.merchantOrderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

}
