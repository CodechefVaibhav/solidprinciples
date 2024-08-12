package com.solid.principles.isp.refactored.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.solid.principles.isp.refactored.service.Printable;
import com.solid.principles.isp.refactored.service.Scannable;

/**
 * @author vaibhav.kashyap
 */

@RestController("RefactoredPrinterController")
@RequestMapping("/refactored/printer")
public class PrinterController {

	private final Printable inkjetPrinterService;
	private final Printable photocopierService;
	private final Scannable scannablePhotocopierService;

	public PrinterController(@Qualifier("RefactoredInkjet") Printable inkjetPrinterService,
			@Qualifier("RefactoredPhotocopier") Printable photocopierService, Scannable scannablePhotocopierService) {
		this.inkjetPrinterService = inkjetPrinterService;
		this.photocopierService = photocopierService;
		this.scannablePhotocopierService = scannablePhotocopierService;
	}

	@PostMapping("/print")
	public String printDocument(@RequestParam String document) {
		inkjetPrinterService.print(document);
		return "Document printed: " + document;
	}

	@PostMapping("/scan")
	public String scanDocument(@RequestParam String document) {
		scannablePhotocopierService.scan(document);
		return "Document scanned: " + document;
	}
}
