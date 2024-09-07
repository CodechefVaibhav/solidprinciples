package com.solid.principles.exercises.srp;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private InvoiceService invoiceService;
    private PaymentService paymentService;

    void orderProcessing(String orderId) {

        invoiceService.generateInvoice(orderId);

        paymentService.processPayment(orderId);

        System.out.println("Order processed for : " + orderId);

    }
}
