package com.solid.principles.solutions.isp;

public class PrinterPrblm implements Printer {

	@Override
	public void print(String document) {
		System.out.println("Printing: " + document);
	}
}