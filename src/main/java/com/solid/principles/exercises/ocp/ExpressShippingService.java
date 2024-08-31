package com.solid.principles.exercises.ocp;

public class ExpressShippingService implements ShippingService{
    
    @Override
    public double calculateCost(double weight){
        return weight * 2.0;
    }
}
