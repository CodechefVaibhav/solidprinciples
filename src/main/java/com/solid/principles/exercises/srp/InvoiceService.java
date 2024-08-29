package com.solid.principles.exercises.srp;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service
public class InvoiceService {

	public void generateInvoice(String orderId) {
		// Invoice generation logic
		System.out.println("Invoice generated for Order: " + orderId);

		// Payment processing logic
		processPayment(orderId);
	}

	private void processPayment(String orderId) {
		// Payment processing logic
		System.out.println("Payment processed for Order: " + orderId);
	}
}
