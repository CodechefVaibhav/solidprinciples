package com.solid.principles.exercises.srp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author praveen.krishna
 */

@Service
public class OrderServiceImpl {

    private final InvoiceService invoiceService;
    private final PaymentService paymentService;

    @Autowired
    public OrderServiceImpl(InvoiceService invoiceService, PaymentService paymentService) {
        this.invoiceService = invoiceService;
        this.paymentService = paymentService;
    }

    public void processOrder(String orderId) {
        invoiceService.generateInvoice(orderId);
        paymentService.processPayment(orderId);
    }
}
