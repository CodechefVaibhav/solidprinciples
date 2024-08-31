package com.solid.principles.exercises.ocp.enums;

public enum ShippingType {
    STANDARD("STANDARD"),
    EXPRESS("EXPRESS");

    private final String value;

    ShippingType(String value) {
        this.value = value;
    }
}
