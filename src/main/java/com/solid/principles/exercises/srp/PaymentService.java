package com.solid.principles.exercises.srp;

public class PaymentService {
    public PaymentStatus processPayment(Purchase purchase, PaymentDetails paymentDetails) {

        PaymentStatus status = new PaymentStatus();

        return status;
    }

    public PaymentStatus getPaymentStatus(String paymentId) {

        return new PaymentStatus();
    }
}