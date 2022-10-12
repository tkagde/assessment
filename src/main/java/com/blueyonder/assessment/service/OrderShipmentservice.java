/**
 * 
 */
package com.blueyonder.assessment.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.blueyonder.assessment.domain.Order;
import com.blueyonder.assessment.domain.OrderShipmentResponse;
import com.blueyonder.assessment.domain.Shipment;

/**
 * @author tkagde
 *
 */
@Service
public class OrderShipmentservice {

	// Call the async methods to get order and shipments from separate methods and
	// add it to response.
	public OrderShipmentResponse getOrderDetails(final String orderId) throws InterruptedException, ExecutionException {
		
		
	    CompletableFuture<Order> order = findOrder(orderId);
	    CompletableFuture<Shipment> shipment = findShipment(orderId);
	
	    
	    // Wait until they are all done
	    CompletableFuture.allOf(order, shipment).join();
	


		// For now returning the sample response
		//return new OrderShipmentResponse(new Order("Order1", "Prod1", 2.0),
		//		new Shipment("Order1", "Ship1", "Prod1", new Date(2021 - 02 - 19), 2.0));

	    return new OrderShipmentResponse(order.get(), shipment.get());
	    
	}

	private List<Order> initOrders() {
		List<Order> orders = new ArrayList<Order>();
		orders.add(new Order("Order1", "Prod1", 2.0));
		return orders;
	}

	private List<Shipment> initShipment() {
		List<Shipment> shipments = new ArrayList<Shipment>();
		shipments.add(new Shipment("Order1", "Ship1", "Prod1", new Date(2021 - 02 - 19), 2.0));
		return shipments;
	}

	@Async
	public CompletableFuture<Order> findOrder(String orderId) throws InterruptedException {
		Order myOrder = initOrders().stream().filter(order -> orderId.equals(order.getOrderId())).findAny()
				.orElse(null);

		return CompletableFuture.completedFuture(myOrder);
	}

	@Async
	public CompletableFuture<Shipment> findShipment(String orderId) throws InterruptedException {
		Shipment myShipment = initShipment().stream().filter(shipment -> orderId.equals(shipment.getOrderId()))
				.findAny().orElse(null);

		return CompletableFuture.completedFuture(myShipment);
	}
}
