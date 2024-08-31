package com.solid.principles.exercises.ocp;

public class StandardShippingStrategy implements ShippingStrategy {

    @Override
    public double calculateShippingCost(double weight) {
        return weight * 1.0;
    }
}
