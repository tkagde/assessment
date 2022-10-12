/**
 * 
 */
package com.blueyonder.assessment.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author tkagde
 *
 */

public class Order {

	private String orderId;
	private String productId;
	private Double qty;

	public Order(String orderId, String productId, Double qty) {
		this.orderId = orderId;
		this.productId = productId;
		this.qty = qty;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}
	
}
