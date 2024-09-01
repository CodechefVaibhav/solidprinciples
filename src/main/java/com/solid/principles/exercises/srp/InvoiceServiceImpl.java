package com.solid.principles.exercises.srp;

import org.springframework.stereotype.Service;

/**
 * @author praveen.krishna
 */

@Service
public class InvoiceServiceImpl implements InvoiceService {
	@Override
	public void generateInvoice(String orderId) {
		// Invoice generation logic
		System.out.println("Invoice generated for Order: " + orderId);
	}

}