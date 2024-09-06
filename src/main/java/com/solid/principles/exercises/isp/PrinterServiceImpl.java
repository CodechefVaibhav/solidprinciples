package com.solid.principles.exercises.isp;

/**
 * @author praveen.krishna
 */

public class PrinterServiceImpl implements PrinterService{

	@Override
	public void print(String document) {
		System.out.println("Printing: " + document);
	}

	
}
