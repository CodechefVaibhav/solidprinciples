package com.solid.principles.ocp.defective.service;

import com.solid.principles.ocp.defective.service.Interfaces.PaymentProcessor;
import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service
public class CreditCardPaymentProcessor implements PaymentProcessor {

	public void processPayment() {
		// Logic for processing credit card payment
		System.out.println("Processing credit card payment");
	}

	public void processCreditCardSpecificFunction() {
		// Specific logic related to credit cards
		System.out.println("Processing credit card specific function");
	}
}