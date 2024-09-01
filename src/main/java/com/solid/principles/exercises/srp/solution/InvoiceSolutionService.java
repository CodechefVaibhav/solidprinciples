package com.solid.principles.exercises.srp.solution;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service
public class InvoiceSolutionService {

	private final PaymentSolutionService paymentService;

	public InvoiceSolutionService(PaymentSolutionService paymentService) {
		this.paymentService = paymentService;
	}

	public void generateInvoice(String orderId) {
		// Invoice generation logic
		System.out.println("Invoice generated for Order: " + orderId);

		// Delegate payment processing to PaymentService
		paymentService.processPayment(orderId);
	}
}
