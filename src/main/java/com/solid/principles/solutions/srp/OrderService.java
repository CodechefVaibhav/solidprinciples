package com.solid.principles.solutions.srp;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    InvoiceService invoiceService;
    PaymentService paymentService;

    public OrderService(InvoiceService invoiceService, PaymentService paymentService) {
        this.invoiceService = invoiceService;
        this.paymentService = paymentService;
    }

    @Override
    public bool processOrder(String orderId) {
        if (!invoiceService.generateInvoice(orderId)) {
            System.out.println("Error generating Invoice for Order - " + orderId);
            return false;
        }

        if (!paymentService.processPayment(orderId)) {
            System.out.println("Error processing payment for Order - " + orderId);
            return false;
        }

        return true;
    }
}