package com.solid.principles.exercises.srp;

import org.springframework.stereotype.Service;

/**
 * @author Khalid.najam
 */

@Service
public class InvoiceService implements InoviceFacade {

    public void generateInvoice(String orderId) {

        System.out.println("Invoice generated for Order: " + orderId);
    }
}
