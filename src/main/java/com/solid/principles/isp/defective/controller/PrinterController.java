package com.solid.principles.isp.defective.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.solid.principles.isp.defective.service.InkjetPrinterService;
import com.solid.principles.isp.defective.service.PhotocopierService;

/**
 * @author vaibhav.kashyap
 */

@RestController
@RequestMapping("/defective/printer")
public class PrinterController {

	private final InkjetPrinterService inkjetPrinterService;
	private final PhotocopierService photocopierService;

	public PrinterController(InkjetPrinterService inkjetPrinterService, PhotocopierService photocopierService) {
		this.inkjetPrinterService = inkjetPrinterService;
		this.photocopierService = photocopierService;
	}

	@PostMapping("/print")
	public String printDocument(@RequestParam String document) {
		inkjetPrinterService.print(document);
		return "Document printed: " + document;
	}

	@PostMapping("/scan")
	public String scanDocument(@RequestParam String document) {
		try {
			photocopierService.scan(document);
			return "Document scanned: " + document;
		} catch (UnsupportedOperationException e) {
			return "Scan failed: " + e.getMessage();
		}
	}

}
