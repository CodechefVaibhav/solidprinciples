package com.solid.principles.exercises.ocp;

public interface ShippingMethod {
    double calculateCost(double weight);
    String getMethodName(); // To identify the shipping method
}

