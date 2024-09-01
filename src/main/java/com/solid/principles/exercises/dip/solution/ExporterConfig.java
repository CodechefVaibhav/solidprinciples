package com.solid.principles.exercises.dip.solution;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author vaibhav.kashyap
 */

//Configuration or usage
@Configuration
public class ExporterConfig {

	@Bean
	public ReportExporterSolution reportExporter() {
		return new PDFExporterSolution(); // You can switch to ExcelExporter or HTMLExporter as needed
	}

	@Bean
	public ReportGeneratorSolution reportGenerator(ReportExporterSolution reportExporter) {
		return new ReportGeneratorSolution(reportExporter);
	}
}