package com.solid.principles.exercises.ocp;

public class StandardCostCalculate implements CostMangerInterface {

    @Override
    public double calculateCost(double weight) {
        return weight * 1.0;
    }

}
