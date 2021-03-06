package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FundDetailItemAOPModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.funditem.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayUserFunditemGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4396482381988633252L;

	/** 
	 * 查询得到的消费记录详细信息（主记录+资金明细列表）
	 */
	@ApiField("fund_detail_item_aopmodel")
	private FundDetailItemAOPModel fundDetailItemAopmodel;

	public void setFundDetailItemAopmodel(FundDetailItemAOPModel fundDetailItemAopmodel) {
		this.fundDetailItemAopmodel = fundDetailItemAopmodel;
	}
	public FundDetailItemAOPModel getFundDetailItemAopmodel( ) {
		return this.fundDetailItemAopmodel;
	}

}
