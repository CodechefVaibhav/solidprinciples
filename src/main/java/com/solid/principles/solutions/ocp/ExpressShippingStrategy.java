package com.solid.principles.solutions.ocp;

public class ExpressShippingStrategy implements ShippingStrategy {

    @Override
    public double calculateShippingCost(double weight) {
        return weight * 2.0;
    }
}
