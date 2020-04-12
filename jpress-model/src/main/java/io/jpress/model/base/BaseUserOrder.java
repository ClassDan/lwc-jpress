package io.jpress.model.base;

import com.jfinal.plugin.activerecord.IBean;
import io.jpress.base.BaseOptionsModel;

/**
 * Generated by JPress, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUserOrder<M extends BaseUserOrder<M>> extends BaseOptionsModel<M> implements IBean {

    private static final long serialVersionUID = 1L;

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return getLong("id");
	}

    /**
     * 订单号
     */
	public void setNs(java.lang.String ns) {
		set("ns", ns);
	}

    /**
     * 订单号
     */
	public java.lang.String getNs() {
		return getStr("ns");
	}

    /**
     * 商品的类型
     */
	public void setProductType(java.lang.String productType) {
		set("product_type", productType);
	}

    /**
     * 商品的类型
     */
	public java.lang.String getProductType() {
		return getStr("product_type");
	}

    /**
     * 商品的名称
     */
	public void setProductTitle(java.lang.String productTitle) {
		set("product_title", productTitle);
	}

    /**
     * 商品的名称
     */
	public java.lang.String getProductTitle() {
		return getStr("product_title");
	}

	public void setProductSummary(java.lang.String productSummary) {
		set("product_summary", productSummary);
	}

	public java.lang.String getProductSummary() {
		return getStr("product_summary");
	}

    /**
     * 购买人
     */
	public void setBuyerId(java.lang.Long buyerId) {
		set("buyer_id", buyerId);
	}

    /**
     * 购买人
     */
	public java.lang.Long getBuyerId() {
		return getLong("buyer_id");
	}

    /**
     * 购买人昵称
     */
	public void setBuyerNickname(java.lang.String buyerNickname) {
		set("buyer_nickname", buyerNickname);
	}

    /**
     * 购买人昵称
     */
	public java.lang.String getBuyerNickname() {
		return getStr("buyer_nickname");
	}

    /**
     * 用户留言
     */
	public void setBuyerMsg(java.lang.String buyerMsg) {
		set("buyer_msg", buyerMsg);
	}

    /**
     * 用户留言
     */
	public java.lang.String getBuyerMsg() {
		return getStr("buyer_msg");
	}

    /**
     * 订单总金额，购买人员应该付款的金额
     */
	public void setOrderTotalAmount(java.math.BigDecimal orderTotalAmount) {
		set("order_total_amount", orderTotalAmount);
	}

    /**
     * 订单总金额，购买人员应该付款的金额
     */
	public java.math.BigDecimal getOrderTotalAmount() {
		return get("order_total_amount");
	}

    /**
     * 订单的真实金额，销售人员可以在后台修改支付金额，一般情况下 order_real_amount = order_total_amount
     */
	public void setOrderRealAmount(java.math.BigDecimal orderRealAmount) {
		set("order_real_amount", orderRealAmount);
	}

    /**
     * 订单的真实金额，销售人员可以在后台修改支付金额，一般情况下 order_real_amount = order_total_amount
     */
	public java.math.BigDecimal getOrderRealAmount() {
		return get("order_real_amount");
	}

    /**
     * 优惠码
     */
	public void setCouponCode(java.lang.String couponCode) {
		set("coupon_code", couponCode);
	}

    /**
     * 优惠码
     */
	public java.lang.String getCouponCode() {
		return getStr("coupon_code");
	}

    /**
     * 优惠金额
     */
	public void setCouponAmount(java.math.BigDecimal couponAmount) {
		set("coupon_amount", couponAmount);
	}

    /**
     * 优惠金额
     */
	public java.math.BigDecimal getCouponAmount() {
		return get("coupon_amount");
	}

    /**
     * 支付状态：1未付款、 2用户标识已经线下付款完成、3用户标识已经通过微信或者支付宝等工具支付完成 、9已经付款（线上支付）、10已经下线支付、11已经通过微信或支付宝等工具支付
     */
	public void setPayStatus(java.lang.Integer payStatus) {
		set("pay_status", payStatus);
	}

    /**
     * 支付状态：1未付款、 2用户标识已经线下付款完成、3用户标识已经通过微信或者支付宝等工具支付完成 、9已经付款（线上支付）、10已经下线支付、11已经通过微信或支付宝等工具支付
     */
	public java.lang.Integer getPayStatus() {
		return getInt("pay_status");
	}

    /**
     * 支付成功的金额
     */
	public void setPaySuccessAmount(java.math.BigDecimal paySuccessAmount) {
		set("pay_success_amount", paySuccessAmount);
	}

    /**
     * 支付成功的金额
     */
	public java.math.BigDecimal getPaySuccessAmount() {
		return get("pay_success_amount");
	}

    /**
     * 支付时间
     */
	public void setPaySuccessTime(java.util.Date paySuccessTime) {
		set("pay_success_time", paySuccessTime);
	}

    /**
     * 支付时间
     */
	public java.util.Date getPaySuccessTime() {
		return get("pay_success_time");
	}

    /**
     * 支付证明，手动入账时需要截图
     */
	public void setPaySuccessProof(java.lang.String paySuccessProof) {
		set("pay_success_proof", paySuccessProof);
	}

    /**
     * 支付证明，手动入账时需要截图
     */
	public java.lang.String getPaySuccessProof() {
		return getStr("pay_success_proof");
	}

    /**
     * 支付备注
     */
	public void setPaySuccessRemarks(java.lang.String paySuccessRemarks) {
		set("pay_success_remarks", paySuccessRemarks);
	}

    /**
     * 支付备注
     */
	public java.lang.String getPaySuccessRemarks() {
		return getStr("pay_success_remarks");
	}

    /**
     * 支付记录
     */
	public void setPaymentId(java.lang.Long paymentId) {
		set("payment_id", paymentId);
	}

    /**
     * 支付记录
     */
	public java.lang.Long getPaymentId() {
		return getLong("payment_id");
	}

    /**
     * 第三方订单号
     */
	public void setPaymentOuterId(java.lang.String paymentOuterId) {
		set("payment_outer_id", paymentOuterId);
	}

    /**
     * 第三方订单号
     */
	public java.lang.String getPaymentOuterId() {
		return getStr("payment_outer_id");
	}

    /**
     * 第三方支付用户，一般情况下是用户的openId
     */
	public void setPaymentOuterUser(java.lang.String paymentOuterUser) {
		set("payment_outer_user", paymentOuterUser);
	}

    /**
     * 第三方支付用户，一般情况下是用户的openId
     */
	public java.lang.String getPaymentOuterUser() {
		return getStr("payment_outer_user");
	}

    /**
     * 发货情况
     */
	public void setDeliveryId(java.lang.Long deliveryId) {
		set("delivery_id", deliveryId);
	}

    /**
     * 发货情况
     */
	public java.lang.Long getDeliveryId() {
		return getLong("delivery_id");
	}

	public void setDeliveryType(java.lang.Integer deliveryType) {
		set("delivery_type", deliveryType);
	}

	public java.lang.Integer getDeliveryType() {
		return getInt("delivery_type");
	}

	public void setDeliveryStatus(java.lang.Integer deliveryStatus) {
		set("delivery_status", deliveryStatus);
	}

	public java.lang.Integer getDeliveryStatus() {
		return getInt("delivery_status");
	}

    /**
     * 收货人地址
     */
	public void setDeliveryAddrUsername(java.lang.String deliveryAddrUsername) {
		set("delivery_addr_username", deliveryAddrUsername);
	}

    /**
     * 收货人地址
     */
	public java.lang.String getDeliveryAddrUsername() {
		return getStr("delivery_addr_username");
	}

    /**
     * 收货人手机号（电话）
     */
	public void setDeliveryAddrMobile(java.lang.String deliveryAddrMobile) {
		set("delivery_addr_mobile", deliveryAddrMobile);
	}

    /**
     * 收货人手机号（电话）
     */
	public java.lang.String getDeliveryAddrMobile() {
		return getStr("delivery_addr_mobile");
	}

    /**
     * 收件人省
     */
	public void setDeliveryAddrProvince(java.lang.String deliveryAddrProvince) {
		set("delivery_addr_province", deliveryAddrProvince);
	}

    /**
     * 收件人省
     */
	public java.lang.String getDeliveryAddrProvince() {
		return getStr("delivery_addr_province");
	}

    /**
     * 收件人的城市
     */
	public void setDeliveryAddrCity(java.lang.String deliveryAddrCity) {
		set("delivery_addr_city", deliveryAddrCity);
	}

    /**
     * 收件人的城市
     */
	public java.lang.String getDeliveryAddrCity() {
		return getStr("delivery_addr_city");
	}

    /**
     * 收件人的区（县）
     */
	public void setDeliveryAddrDistrict(java.lang.String deliveryAddrDistrict) {
		set("delivery_addr_district", deliveryAddrDistrict);
	}

    /**
     * 收件人的区（县）
     */
	public java.lang.String getDeliveryAddrDistrict() {
		return getStr("delivery_addr_district");
	}

    /**
     * 收件人的详细地址
     */
	public void setDeliveryAddrDetail(java.lang.String deliveryAddrDetail) {
		set("delivery_addr_detail", deliveryAddrDetail);
	}

    /**
     * 收件人的详细地址
     */
	public java.lang.String getDeliveryAddrDetail() {
		return getStr("delivery_addr_detail");
	}

    /**
     * 收件人地址邮政编码
     */
	public void setDeliveryAddrZipcode(java.lang.String deliveryAddrZipcode) {
		set("delivery_addr_zipcode", deliveryAddrZipcode);
	}

    /**
     * 收件人地址邮政编码
     */
	public java.lang.String getDeliveryAddrZipcode() {
		return getStr("delivery_addr_zipcode");
	}

    /**
     * 发票
     */
	public void setInvoiceId(java.lang.Long invoiceId) {
		set("invoice_id", invoiceId);
	}

    /**
     * 发票
     */
	public java.lang.Long getInvoiceId() {
		return getLong("invoice_id");
	}

    /**
     * 发票开具状态：1 未申请发票、 2 发票申请中、 3 发票开具中、 8 无需开具发票、 9发票已经开具
     */
	public void setInvoiceStatus(java.lang.Integer invoiceStatus) {
		set("invoice_status", invoiceStatus);
	}

    /**
     * 发票开具状态：1 未申请发票、 2 发票申请中、 3 发票开具中、 8 无需开具发票、 9发票已经开具
     */
	public java.lang.Integer getInvoiceStatus() {
		return getInt("invoice_status");
	}

    /**
     * 管理员后台憋住
     */
	public void setRemarks(java.lang.String remarks) {
		set("remarks", remarks);
	}

    /**
     * 管理员后台憋住
     */
	public java.lang.String getRemarks() {
		return getStr("remarks");
	}

    /**
     * json字段扩展
     */
	public void setOptions(java.lang.String options) {
		set("options", options);
	}

    /**
     * json字段扩展
     */
	public java.lang.String getOptions() {
		return getStr("options");
	}

    /**
     * 交易状态：1交易中、 2交易完成（但是可以申请退款） 、3取消交易 、4申请退款、 5拒绝退款、 6退款中、 7退款完成、 9交易结束
     */
	public void setTradeStatus(java.lang.Integer tradeStatus) {
		set("trade_status", tradeStatus);
	}

    /**
     * 交易状态：1交易中、 2交易完成（但是可以申请退款） 、3取消交易 、4申请退款、 5拒绝退款、 6退款中、 7退款完成、 9交易结束
     */
	public java.lang.Integer getTradeStatus() {
		return getInt("trade_status");
	}

    /**
     * 删除状态：1 正常 ，2 回收站 3 已经删除
     */
	public void setDelStatus(java.lang.Integer delStatus) {
		set("del_status", delStatus);
	}

    /**
     * 删除状态：1 正常 ，2 回收站 3 已经删除
     */
	public java.lang.Integer getDelStatus() {
		return getInt("del_status");
	}

    /**
     * 修改时间
     */
	public void setModified(java.util.Date modified) {
		set("modified", modified);
	}

    /**
     * 修改时间
     */
	public java.util.Date getModified() {
		return get("modified");
	}

    /**
     * 创建时间
     */
	public void setCreated(java.util.Date created) {
		set("created", created);
	}

    /**
     * 创建时间
     */
	public java.util.Date getCreated() {
		return get("created");
	}

}
