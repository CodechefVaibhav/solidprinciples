package com.solid.principles.exercises.ocp;

/**
 * @author shubhang21
 */

public enum ShippingMethod {
    STANDARD,
    EXPRESS;

    double getRate() {
        switch(this) {
            case STANDARD:
                return 1.0;
            case EXPRESS:
                return 2.0;
            default:
                throw new IllegalArgumentException("Invalid shipping method");
        }
    }
}