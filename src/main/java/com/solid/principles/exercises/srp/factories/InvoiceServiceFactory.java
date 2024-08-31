package com.solid.principles.exercises.srp.factories;

import com.solid.principles.exercises.srp.enums.InvoiceType;
import com.solid.principles.exercises.srp.services.invoice.InvoiceService;
import com.solid.principles.exercises.srp.services.invoice.types.DetailedInvoiceService;
import com.solid.principles.exercises.srp.services.invoice.types.StandardInvoiceService;
import org.springframework.stereotype.Component;

@Component
public class InvoiceServiceFactory {

    public InvoiceService generateInvoiceService(InvoiceType type) {
        switch (type) {
            case DETAILED:
                return new DetailedInvoiceService();
            case STANDARD:
                return new StandardInvoiceService();
            default:
                throw new IllegalArgumentException("Invalid invoice type: " + type);
        }
    }
}
