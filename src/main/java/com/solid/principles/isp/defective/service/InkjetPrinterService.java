package com.solid.principles.isp.defective.service;

import com.solid.principles.isp.defective.Interfaces.Printable;
import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service
public class InkjetPrinterService implements Printable {

	@Override
	public void print(String document) {
		System.out.println("Printing document: " + document);
	}

	}

