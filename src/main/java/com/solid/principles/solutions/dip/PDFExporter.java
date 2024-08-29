package com.solid.principles.solutions.dip;

public class PDFExporter implements ReportExporter {

	@Override
	public void export(String data) {
		System.out.println("Exporting report to PDF: " + data);
	}
}