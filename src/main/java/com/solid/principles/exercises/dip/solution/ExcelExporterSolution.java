package com.solid.principles.exercises.dip.solution;

/**
 * @author vaibhav.kashyap
 */

public class ExcelExporterSolution implements ReportExporterSolution {

	@Override
	public void export(String data) {
		System.out.println("Exporting report to Excel: " + data);
	}
}