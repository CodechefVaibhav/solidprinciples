package com.solid.principles.exercises.dip;

/**
 * @author shubhang21
 */


public class ReportGenerator {

	private final ReportExporter exporter;

	public ReportGenerator(ReportExporter exporter) {
		this.exporter = exporter;
	}

	public void generateReport(String data) {
		exporter.export(data);
	}
}
