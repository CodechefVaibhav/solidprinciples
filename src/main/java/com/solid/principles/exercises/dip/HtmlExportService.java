package com.solid.principles.exercises.dip;

/**
 * @author praveen.krishna
 */

public class HtmlExportService implements FileExportService {
    
    @Override
	public void export(String data) {
		System.out.println("Exporting report to HTML: " + data);
	}


}
