package com.solid.principles.solutions.dip;

/**
 * The interface Report exporter.
 */
public interface ReportExporter {

    /**
     * Export.
     *
     * @param data the data
     */
    public void export(String data);
}
