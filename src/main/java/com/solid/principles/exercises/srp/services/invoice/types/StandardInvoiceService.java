package com.solid.principles.exercises.srp.services.invoice.types;

import com.solid.principles.exercises.srp.services.invoice.InvoiceService;
import org.springframework.stereotype.Service;

@Service
public class StandardInvoiceService implements InvoiceService {

    public void generateInvoice(String orderId) {
        System.out.println("Standard Invoice generated for Order: " + orderId);
    }
}
