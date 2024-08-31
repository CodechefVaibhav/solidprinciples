package com.solid.principles.exercises.isp;

public class ScannerServiceImpl implements ScannerService{

    @Override
	public void scan(String document) {
		System.out.println("Scaning: " + document);
	
	}
    
}
