package com.solid.principles.exercises.isp;

/**
 * @author shubhang21
 */


public class Printer implements Printable {

	@Override
	public void print(String document) {
		System.out.println("Printing: " + document);
	}
}
