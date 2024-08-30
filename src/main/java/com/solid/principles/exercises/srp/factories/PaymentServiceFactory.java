package com.solid.principles.exercises.srp.factories;

import com.solid.principles.exercises.srp.enums.PaymentType;
import com.solid.principles.exercises.srp.services.payment.PaymentService;
import com.solid.principles.exercises.srp.services.payment.types.PayPalPaymentService;
import com.solid.principles.exercises.srp.services.payment.types.UpiPaymentService;
import org.springframework.stereotype.Component;

@Component
public class PaymentServiceFactory {

    public PaymentService generatePaymentService(PaymentType paymentType) {
        switch (paymentType) {
            case PAYPAL:
                return new PayPalPaymentService();
            case UPI:
                return new UpiPaymentService();
            default:
                throw new IllegalArgumentException("Unsupported payment type: " + paymentType);
        }
    }
}
