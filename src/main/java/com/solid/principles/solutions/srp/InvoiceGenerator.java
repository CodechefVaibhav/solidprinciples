package com.solid.principles.exercises.srp;

import org.springframework.stereotype.Service;

@Service
public class InvoiceGenerator {

    public void generateInvoice(String orderId) {
        // Invoice generation logic
        System.out.println("Invoice generated for Order: " + orderId);
    }
}
