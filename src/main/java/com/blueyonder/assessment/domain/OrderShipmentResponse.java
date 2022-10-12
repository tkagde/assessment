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

public class OrderShipmentResponse {

	Order order;
	Shipment shipment;

	public OrderShipmentResponse(Order order, Shipment shipment) {
		this.order = order;
		this.shipment = shipment;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Shipment getShipment() {
		return shipment;
	}

	public void setShipment(Shipment shipment) {
		this.shipment = shipment;
	}
	
}
