package com.solid.principles.isp.refactored.service;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service("RefactoredInkjet")
public class InkjetPrinterService implements Printable {

	@Override
	public void print(String document) {
		System.out.println("Printing document: " + document);
	}
}