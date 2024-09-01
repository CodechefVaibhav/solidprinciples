package com.solid.principles.exercises.srp.solution;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service
public class PaymentSolutionService {

	public void processPayment(String orderId) {
		// Payment processing logic
		System.out.println("Payment processed for Order: " + orderId);
	}
}