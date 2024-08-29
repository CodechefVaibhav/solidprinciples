package com.solid.principles.solutions.ocp;

public enum ShippingType {
    STANDARD(1.0),
    EXPRESS(2.0),
    PREMIUM(3.0);

    private final double rate; 
    
    private ShippingType(double rate) { this.rate = rate; }

    public double calculateCost(double weight) {
        return weight * rate;
    }
}