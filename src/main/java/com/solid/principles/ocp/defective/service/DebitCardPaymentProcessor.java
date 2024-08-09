package com.solid.principles.ocp.defective.service;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service
public class DebitCardPaymentProcessor extends CreditCardPaymentProcessor {

	@Override
	public void processPayment() {
		// Reusing credit card payment logic in debit card payment processing
		super.processPayment(); // Calls processCreditCardPayment method from the parent class
		System.out.println("Processing debit card payment");
	}
}