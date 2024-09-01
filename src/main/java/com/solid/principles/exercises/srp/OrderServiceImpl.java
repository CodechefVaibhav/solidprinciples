package com.solid.principles.exercises.srp;

/**
 * @author shubhang21
 */

import org.springframework.beans.factory.annotation.Autowired;

public class OrderServiceImpl implements OrderService {
    private final InvoiceService invoiceService;
    private final PaymentService paymentService;

    @Autowired
    public OrderServiceImpl(InvoiceService invoiceService, PaymentService paymentService) {
        this.invoiceService = invoiceService;
        this.paymentService = paymentService;
    }

    @Override
    public void processOrder(String orderId) {
        invoiceService.generateInvoice(orderId);
        paymentService.processPayment(orderId);
    }
}
