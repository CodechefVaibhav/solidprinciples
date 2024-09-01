package com.solid.principles.solutions.srp;

public class InvoiceService {

    private paymentService paymentService;
    public void generateInvoice(String orderId) {
        // Invoice generation logic
        System.out.println("Invoice generated for Order: " + orderId);

        // Payment processing logic
        paymentService.processPayment(orderId);
    }
}
