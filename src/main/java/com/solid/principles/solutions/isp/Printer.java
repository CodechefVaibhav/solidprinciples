package com.solid.principles.solutions.isp;

/**
 * The type Printer.
 *
 * @author himanshu.pandey
 */
public class Printer implements PrintingDevice {

	@Override
	public void print(String document) {
		System.out.println("Printing: " + document);
	}

}
