package com.solid.principles.exercises.isp;

public class ScannerImpl implements ScannerInterface{

    @Override
	public void scan(String document) {
		System.out.println("Scaning: " + document);
	
	}
    
}
