package com.solid.principles.exercises.ocp;

public class ExpressCostCalculate implements CostMangerInterface{
    
    @Override
    public double calculateCost(double weight){
        return weight * 2.0;
    }
}
