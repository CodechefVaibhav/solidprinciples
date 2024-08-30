package com.solid.principles.exercises.dip;

/**
 * @author yash.agarwal
 */

public class PDFExporter implements FileExporter{

	@Override
	public void export(String data) {
		System.out.println("Exporting report to PDF: " + data);
	}
}