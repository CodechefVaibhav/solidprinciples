package com.solid.principles.exercises.srp.enums;

public enum InvoiceType {
    DETAILED("DETAILED"),
    STANDARD("STANDARD");

    private final String value;

    InvoiceType(String value) {
        this.value = value;
    }
}
