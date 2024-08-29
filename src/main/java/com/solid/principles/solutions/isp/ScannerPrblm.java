package com.solid.principles.solutions.isp;

public class ScannerPrblm implements Scanner {

	@Override
	public void scan(String document) {
		System.out.println("Scanning: " + document);
	}
}