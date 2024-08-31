package com.solid.principles.exercises.srp.services.order;

import com.solid.principles.exercises.srp.enums.InvoiceType;
import com.solid.principles.exercises.srp.enums.PaymentType;
import com.solid.principles.exercises.srp.factories.InvoiceServiceFactory;
import com.solid.principles.exercises.srp.factories.PaymentServiceFactory;
import com.solid.principles.exercises.srp.services.payment.PaymentService;
import com.solid.principles.exercises.srp.services.invoice.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final InvoiceServiceFactory invoiceServiceFactory;
    private final PaymentServiceFactory paymentServiceFactory;

    @Autowired
    public OrderService(InvoiceServiceFactory invoiceServiceFactory, PaymentServiceFactory paymentServiceFactory) {
        this.invoiceServiceFactory = invoiceServiceFactory;
        this.paymentServiceFactory = paymentServiceFactory;
    }

    public void processOrder(String orderId, PaymentType paymentType, InvoiceType invoiceType) {
        try {
            InvoiceService invoiceService = invoiceServiceFactory.generateInvoiceService(invoiceType);
            invoiceService.generateInvoice(orderId);

            PaymentService paymentService = paymentServiceFactory.generatePaymentService(paymentType);
            paymentService.processPayment(orderId);
        } catch (Exception e) {
            throw new RuntimeException("Error occured while processing order", e);
        }
    }
}
