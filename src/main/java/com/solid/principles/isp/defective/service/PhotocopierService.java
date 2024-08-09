package com.solid.principles.isp.defective.service;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service
public class PhotocopierService implements PrinterService {

	@Override
	public void print(String document) {
		System.out.println("Printing document: " + document);
	}

	@Override
	public void scan(String document) {
		System.out.println("Scanning document: " + document);
	}

	@Override
	public void fax(String document) {
		throw new UnsupportedOperationException("Fax not supported by Photocopier");
	}
}