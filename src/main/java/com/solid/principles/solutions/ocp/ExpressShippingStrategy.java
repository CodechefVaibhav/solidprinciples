package com.solid.principles.exercises.ocp;

public class ExpressShippingStrategy implements ShippingStrategy {

    @Override
    public double calculateShippingCost(double weight) {
        return weight * 2.0;
    }
}
