package com.solid.principles.exercises.dip.solution;

public class ReportGeneratorSolution {

	private final ReportExporterSolution reportExporter;

	public ReportGeneratorSolution(ReportExporterSolution reportExporter) {
		this.reportExporter = reportExporter;
	}

	public void generateReport(String data) {
		reportExporter.export(data);
	}
}