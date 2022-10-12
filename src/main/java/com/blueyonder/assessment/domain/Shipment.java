/**
 * 
 */
package com.blueyonder.assessment.domain;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author tkagde
 *
 */

public class Shipment {

	private String orderId;
	private String shipmentId;
	private String productId;
	private Date shipmentDate;
	private Double qty;

	public Shipment(String orderId, String shipmentId, String productId, Date shipmentDate, Double qty) {
		this.orderId = orderId;
		this.shipmentId = shipmentId;
		this.productId = productId;
		this.shipmentDate = shipmentDate;
		this.qty = qty;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getShipmentId() {
		return shipmentId;
	}

	public void setShipmentId(String shipmentId) {
		this.shipmentId = shipmentId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Date getShipmentDate() {
		return shipmentDate;
	}

	public void setShipmentDate(Date shipmentDate) {
		this.shipmentDate = shipmentDate;
	}

	public Double getQty() {
		return qty;
	}

	public void setQty(Double qty) {
		this.qty = qty;
	}
	

}
