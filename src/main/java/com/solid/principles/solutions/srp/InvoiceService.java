package com.solid.principles.exercises.srp;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service
public class InvoiceService {

	private final InvoiceGenerator invoiceGenerator;
	private final PaymentProcessor paymentProcessor;

	public InvoiceService(InvoiceGenerator invoiceGenerator, PaymentProcessor paymentProcessor) {
		this.invoiceGenerator = invoiceGenerator;
		this.paymentProcessor = paymentProcessor;
	}

	public void processOrder(String orderId) {
		invoiceGenerator.generateInvoice(orderId);
		paymentProcessor.processPayment(orderId);
	}
}
