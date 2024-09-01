package com.solid.principles.exercises.isp.solution;

/**
 * @author vaibhav.kashyap
 */

public class ScannerSolution implements ScannerSolutionDevice {

	@Override
	public void scan(String document) {
		System.out.println("Scanning: " + document);
	}
}