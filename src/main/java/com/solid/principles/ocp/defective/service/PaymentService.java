package com.solid.principles.ocp.defective.service;

import com.solid.principles.ocp.defective.service.Interfaces.PaymentProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author vaibhav.kashyap
 */

@Service
public class PaymentService {
	private final Map<String, PaymentProcessor> paymentProcessors = new HashMap<>();

	@Autowired
	public PaymentService(CreditCardPaymentProcessor creditCardProcessor,
						  DebitCardPaymentProcessor debitCardProcessor,
						  PaypalPaymentProcessor payPalProcessor) {
		paymentProcessors.put("CREDIT_CARD", creditCardProcessor);
		paymentProcessors.put("DEBIT_CARD", debitCardProcessor);
		paymentProcessors.put("PAYPAL", payPalProcessor);
	}


	public PaymentService() {

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
