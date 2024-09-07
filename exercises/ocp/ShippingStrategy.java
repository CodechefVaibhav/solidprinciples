package com.solid.principles.exercises.ocp;

public interface ShippingStrategy {
    double calculateCost(double weight);
}