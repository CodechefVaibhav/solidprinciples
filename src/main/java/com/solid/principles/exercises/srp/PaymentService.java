package com.solid.principles.exercises.srp;

import org.springframework.stereotype.Service;

/**
 * @author praveen.krishna
 */

@Service
public class PaymentService {

    public void processPayment(String orderId) {
        // Payment processing logic
        System.out.println("Payment processed for Order: " + orderId);
    }
}
