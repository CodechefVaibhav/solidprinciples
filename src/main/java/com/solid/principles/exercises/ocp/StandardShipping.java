package com.solid.principles.exercises.ocp;

import org.springframework.stereotype.Component;

@Component
public class StandardShipping implements ShippingMethod {
    @Override
    public double calculateCost(double weight) {
        return weight * 1.0;
    }

    @Override
    public String getMethodName() {
        return "STANDARD";
    }
}