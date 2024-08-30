package com.solid.principles.exercises.dip;

/**
 * @author praveen.krishna
 */

public class PDFExporter implements  FileExporterInterface{
    
	@Override
	public void export(String data) {
		System.out.println("Exporting report to PDF: " + data);
	}
}