package com.solid.principles.exercises.isp;

/**
 * @author maharshi.vaghela
 */

public class Printer implements Printable {

	@Override
	public void print(String document) {
		System.out.println("Printing: " + document);
	}
}
