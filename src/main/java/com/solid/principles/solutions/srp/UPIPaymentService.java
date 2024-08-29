package com.solid.principles.solutions.srp;

import org.springframework.stereotype.Service;

@Service
public class UPIPaymentService implements PaymentService {

    @Override
    public bool processPayment(String orderId) {
        System.out.print("Process payment for Order: " + orderId + " using UPI");
    }
}