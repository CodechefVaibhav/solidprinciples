package com.solid.principles.exercises.srp;

import org.springframework.stereotype.Service;

@Service
public class PaymentService implements PaymentFacade {

    public void processPayment(String orderId) {
        // Payment processing logic
        System.out.println("Payment processed for Order: " + orderId);
    }
}