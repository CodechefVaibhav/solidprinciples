package com.solid.principles.ocp.defective.service;

import com.solid.principles.ocp.defective.service.Interfaces.PaymentProcessor;
import org.springframework.stereotype.Service;

@Service
public class PaypalPaymentProcessor implements PaymentProcessor {

    public void processPayment() {
        // Reusing credit card payment logic in debit card payment processing
        System.out.println("Processing PayPal card payment");
    }
}
