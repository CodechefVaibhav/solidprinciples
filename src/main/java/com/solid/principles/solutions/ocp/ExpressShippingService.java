package com.solid.principles.solutions.ocp;

public class ExpressShippingService implements ShippingCost{

    /**
     * @param weight
     * @return
     */
    @Override
    public double calculateCost(double weight) {
        return weight * 2.0;
    }
}
