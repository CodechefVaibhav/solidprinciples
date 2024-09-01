package com.solid.principles.exercises.dip.solution;

public class PDFExporterSolution implements ReportExporterSolution {

	@Override
	public void export(String data) {
		System.out.println("Exporting report to PDF: " + data);
	}
}
