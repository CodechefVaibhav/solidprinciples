package com.solid.principles.exercises.dip;

/**
 * @author vaibhav.kashyap
 */

public class ReportGenerator {

	private final PDFExporter pdfExporter;

	public ReportGenerator() {
		this.pdfExporter = new PDFExporter();
	}

	public void generateReport(String data) {
		pdfExporter.export(data);
	}
}
