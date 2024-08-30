package com.solid.principles.exercises.dip;

/**
 * @author praveen.krishna
 */

public class ExcelExportor implements FileExporterInterface{

    @Override
	public void export(String data) {
		System.out.println("Exporting report to Excel: " + data);
	}
    
}
