package com.solid.principles.isp.defective.service;

import com.solid.principles.isp.defective.Interfaces.Printable;
import com.solid.principles.isp.defective.Interfaces.Scanable;
import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service
public class PhotocopierService implements Printable, Scanable {

	@Override
	public void print(String document) {
		System.out.println("Printing document: " + document);
	}

	@Override
	public void scan(String document) {
		System.out.println("Scanning document: " + document);
	}
	}
