package com.solid.principles.exercises.ocp;

public class StandardShippingService implements ShippingService {

    @Override
    public double calculateCost(double weight) {
        return weight * 1.0;
    }

}
