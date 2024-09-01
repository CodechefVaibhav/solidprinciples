package com.solid.principles.solutions.ocp;

public class StandardShippingService implements ShippingCost{
    /**
     * @param weight
     * @return
     */
    @Override
    public double calculateCost(double weight) {
        return weight * 1.0;
    }
}
