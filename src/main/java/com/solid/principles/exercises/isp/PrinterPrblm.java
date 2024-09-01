package com.solid.principles.exercises.isp;

/**
 * @author vaibhav.kashyap
 */

public class PrinterPrblm implements Device {

	@Override
	public void print(String document) {
		System.out.println("Printing: " + document);
	}

	@Override
	public void scan(String document) {
		// Not applicable for Printer
	}
}
