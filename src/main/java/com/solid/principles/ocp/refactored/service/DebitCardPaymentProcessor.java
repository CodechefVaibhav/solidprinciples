package com.solid.principles.ocp.refactored.service;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service("DEBIT_CARD")
public class DebitCardPaymentProcessor implements PaymentProcessor {

	@Override
	public void processPayment() {
		// Logic for processing debit card payment
		System.out.println("Processing debit card payment");
	}
}