package com.solid.principles.solutions.ocp;

public class StandardShippingStrategy implements ShippingStrategy {

    @Override
    public double calculateShippingCost(double weight) {
        return weight * 1.0;
    }
}
