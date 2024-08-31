package com.solid.principles.exercises.srp.services.invoice.types;

import com.solid.principles.exercises.srp.services.invoice.InvoiceService;

public class DetailedInvoiceService implements InvoiceService {

    public void generateInvoice(String orderId) {
        System.out.println("Detailed Invoice generated for Order: " + orderId);
    }
}
