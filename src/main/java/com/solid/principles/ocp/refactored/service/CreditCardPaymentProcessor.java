package com.solid.principles.ocp.refactored.service;

import org.springframework.stereotype.Service;

@Service("CREDIT_CARD")
public class CreditCardPaymentProcessor implements PaymentProcessor {

	@Override
	public void processPayment() {
		// Logic for processing credit card payment
		System.out.println("Processing credit card payment");
	}

	private void processCreditCardSpecificFunction() {
		// Specific logic related to credit cards
		System.out.println("Processing credit card specific function");
	}
}
