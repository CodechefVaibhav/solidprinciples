package com.solid.principles.ocp.defective.service;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service
public class PaymentService {

	public PaymentService() {

	}

	public void processPayment(String paymentType) {
		if (paymentType.equals("CREDIT_CARD")) {
			CreditCardPaymentProcessor processor = new CreditCardPaymentProcessor();
			processor.processPayment();
		} else if (paymentType.equals("DEBIT_CARD")) {
			DebitCardPaymentProcessor processor = new DebitCardPaymentProcessor();
			processor.processPayment();
		} else if (paymentType.equals("PAYPAL")) {
			processPayPalPayment();
		} else {
			throw new IllegalArgumentException("Unsupported payment type");
		}
	}

	private void processPayPalPayment() {
		// Logic for processing PayPal payment
		System.out.println("Processing PayPal payment");
	}
}
