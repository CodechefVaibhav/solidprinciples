package com.solid.principles.exercises.dip;

/**
 * @author Khalid.najam
 */

public class PDFExporter implements Exporter {
	@Override
	public void export(String data) {
		System.out.println("Exporting report to PDF: " + data);
	}
}