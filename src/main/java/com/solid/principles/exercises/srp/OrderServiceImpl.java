package com.solid.principles.exercises.srp;

import org.springframework.stereotype.Service;

/**
 * @author yash.agarwal
 */

@Service
public class OrderServiceImpl implements OrderService {

    InvoiceService invoiceService;
    PaymentService paymentService;

    OrderServiceImpl(InvoiceService invoiceService, PaymentService paymentService) {
        this.invoiceService = invoiceService;
        this.paymentService = paymentService;
    }

    @Override
    public void processOrder(String orderId) {
        invoiceService.generateInvoice(orderId);

        paymentService.processPayment(orderId);

        System.out.println("Order processed for Order: " + orderId);
    }

}
