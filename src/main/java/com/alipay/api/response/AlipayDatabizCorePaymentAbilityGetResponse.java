package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PaymentAbilityQueryResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.databiz.core.payment.ability.get response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-27 18:01:50
 */
public class AlipayDatabizCorePaymentAbilityGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7198477747588741154L;

	/** 
	 * 支付能力返回结果信息
	 */
	@ApiField("payment_ability_query_response")
	private PaymentAbilityQueryResponse paymentAbilityQueryResponse;

	public void setPaymentAbilityQueryResponse(PaymentAbilityQueryResponse paymentAbilityQueryResponse) {
		this.paymentAbilityQueryResponse = paymentAbilityQueryResponse;
	}
	public PaymentAbilityQueryResponse getPaymentAbilityQueryResponse( ) {
		return this.paymentAbilityQueryResponse;
	}

}