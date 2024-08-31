package com.solid.principles.exercises.ocp.services;

import com.solid.principles.exercises.ocp.enums.ShippingType;

public class StandardShipping implements Shipping {

    @Override
    public double calculateShippingCost(double weight) {
        return weight * 1.0;
    }
}
