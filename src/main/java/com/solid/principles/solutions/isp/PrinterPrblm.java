package com.solid.principles.solutions.isp;

/**
 * @author vaibhav.kashyap
 */

public class PrinterPrblm implements Printable {

	@Override
	public void print(String document) {
		System.out.println("Printing: " + document);
	}
}
