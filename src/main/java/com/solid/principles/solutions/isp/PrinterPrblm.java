package com.solid.principles.exercises.isp;

/**
 * @author vaibhav.kashyap
 */

public class PrinterPrblm implements Printable {

	@Override
	public void print(String document) {
		System.out.println("Printing: " + document);
	}
}
