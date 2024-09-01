package com.solid.principles.exercises.srp;

import org.springframework.stereotype.Service;

/**
 * @author shubhang21
 */

@Service
public class OrderServiceImpl implements OrderService {
    private final InvoiceService invoiceService;
    private final PaymentService paymentService;

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
