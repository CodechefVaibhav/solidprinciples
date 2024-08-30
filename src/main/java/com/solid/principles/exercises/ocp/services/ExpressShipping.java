package com.solid.principles.exercises.ocp.services;

public class ExpressShipping implements Shipping {
    @Override
    public double calculateShippingCost(double weight) {
        return weight * 2.0;
    }
}
