package com.solid.principles.exercises.srp;

import org.springframework.stereotype.Service;

@Service
public class EmailInvoiceService implements InvoiceService {

    @Override
	public bool generateInvoice(String orderId) {
		System.out.println("Invoice generated for Order: " + orderId + " through Email");
        return true;
    }
}
