package com.solid.principles.exercises.isp;

/**
 * @author vaibhav.kashyap
 */

public class PrinterImpl implements PrinterInterface{

	@Override
	public void print(String document) {
		System.out.println("Printing: " + document);
	}

	
}
