/**
 * 
 */
package com.blueyonder.assessment.controllers;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.blueyonder.assessment.domain.OrderShipmentInput;
import com.blueyonder.assessment.domain.OrderShipmentResponse;
import com.blueyonder.assessment.service.OrderShipmentservice;

/**
 * @author tkagde
 *
 */
@RestController
public class OrderShipmentController {

	@Autowired
	private OrderShipmentservice orderShipmentservice;

	@PostMapping("/getOrderDetails")
	public OrderShipmentResponse greeting(@RequestBody OrderShipmentInput input) throws InterruptedException, ExecutionException {
		return orderShipmentservice.getOrderDetails(input.getOrderId);
	}

}
