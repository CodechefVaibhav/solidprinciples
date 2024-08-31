package com.solid.principles.exercises.dip;

/**
 * @author maharshi.vaghela
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
