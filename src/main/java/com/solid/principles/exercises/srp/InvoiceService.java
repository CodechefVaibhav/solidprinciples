package com.solid.principles.exercises.srp;
import org.springframework.stereotype.Service;
/**
 * @author shubhang21
 */


public interface InvoiceService {

	public void generateInvoice(String orderId);
}

