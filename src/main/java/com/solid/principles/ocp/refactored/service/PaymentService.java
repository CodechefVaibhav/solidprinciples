package com.solid.principles.ocp.refactored.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author vaibhav.kashyap
 */

@Service("RefactoredPaymentService")
public class PaymentService {

	private final Map<String, PaymentProcessor> paymentProcessors = new HashMap<>();

	public PaymentService(Map<String, PaymentProcessor> processors) {
		this.paymentProcessors.putAll(processors);
	}

	public void processPayment(String paymentType) {
		PaymentProcessor processor = paymentProcessors.get(paymentType);
		if (processor != null) {
			processor.processPayment();
		} else {
			throw new IllegalArgumentException("Unsupported payment type");
		}
	}
}
