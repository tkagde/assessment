/**
 * 
 */
package com.blueyonder.assessment.domain;

/**
 * @author tkagde
 *
 */
public class OrderShipmentInput {
	
	private String orderId;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public OrderShipmentInput(String orderId) {
		super();
		this.orderId = orderId;
	}
	

}
