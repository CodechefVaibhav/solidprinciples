package com.solid.principles.isp.defective.service;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service
public class InkjetPrinterService implements PrinterService {

	@Override
	public void print(String document) {
		System.out.println("Printing document: " + document);
	}

	@Override
	public void scan(String document) {
		throw new UnsupportedOperationException("Scan not supported by Inkjet Printer");
	}

	@Override
	public void fax(String document) {
		throw new UnsupportedOperationException("Fax not supported by Inkjet Printer");
	}
}
