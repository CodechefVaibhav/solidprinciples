package com.solid.principles.exercises.srp;

/**
 * @author shubhang21
 */

import org.springframework.stereotype.Service;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Override
    public void generateInvoice(String orderId) {
        // Invoice generation logic
        System.out.println("Invoice generated for Order: " + orderId);
    }
    
}
