package com.solid.principles.exercises.dip;

/**
 * @author maharshi.vaghela
 */

public class PDFExporter implements Exporter {

	@Override
	public void export(String data) {
		System.out.println("Exporting report to PDF: " + data);
	}
}