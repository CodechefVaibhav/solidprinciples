package com.solid.principles.exercises.isp.solution;

/**
 * @author vaibhav.kashyap
 */

public class PrinterSolution implements PrinterSolutionDevice {

	@Override
	public void print(String document) {
		System.out.println("Printing: " + document);
	}
}