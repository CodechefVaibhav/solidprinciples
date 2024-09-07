package com.solid.principles.exercises.ocp;

public class ExpressShipping implements ShippingStrategy {
    @Override
    public double calculateCost(double weight) {
        return weight * 2.0;
    }
}