package com.solid.principles.exercises.ocp;

import org.springframework.stereotype.Component;

@Component
public class ExpressShipping implements ShippingMethod {
    @Override
    public double calculateCost(double weight) {
        return weight * 2.0;
    }

    @Override
    public String getMethodName() {
        return "EXPRESS";
    }
}