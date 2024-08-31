package com.solid.principles.exercises.dip;

/**
 * @author vaibhav.kashyap
 */

public class PDFExporter implements Exporter {

	@Override
	public void export(String data) {
		System.out.println("Exporting report to PDF: " + data);
	}
}