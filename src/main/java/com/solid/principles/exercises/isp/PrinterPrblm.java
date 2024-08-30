package com.solid.principles.exercises.isp;

/**
 * @author yash.agarwal
 */

public class PrinterPrblm implements Printer {

	@Override
	public void print(String document) {
		System.out.println("Printing: " + document);
	}

}
