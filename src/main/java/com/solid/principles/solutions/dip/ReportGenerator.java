package com.solid.principles.exercises.dip;

/**
 * @author vaibhav.kashyap
 */

public class ReportGenerator {

	private final Exporter exporter;

	public ReportGenerator(Exporter exporter) {
		this.exporter = exporter;
	}

	public void generateReport(String data) {
		exporter.export(data);
	}
}
