package com.solid.principles.exercises.srp.services.payment.types;

import com.solid.principles.exercises.srp.services.payment.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class PayPalPaymentService implements PaymentService {

    public boolean processPayment(String orderID) {
        System.out.println("Payment processed with PayPal: " + orderID);
        return true;
    }
}
