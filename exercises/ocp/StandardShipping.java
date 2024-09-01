package com.solid.principles.exercises.ocp;

public class StandardShipping implements ShippingStrategy {
    @Override
    public double calculateCost(double weight) {
        return weight;
    }
}
