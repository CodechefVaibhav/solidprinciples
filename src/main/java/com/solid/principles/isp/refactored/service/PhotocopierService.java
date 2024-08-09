package com.solid.principles.isp.refactored.service;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service("RefactoredPhoto")
public class PhotocopierService implements Printable, Scannable {

	@Override
	public void print(String document) {
		System.out.println("Printing document: " + document);
	}

	@Override
	public void scan(String document) {
		System.out.println("Scanning document: " + document);
	}
}
