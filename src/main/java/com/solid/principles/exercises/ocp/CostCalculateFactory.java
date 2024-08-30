package com.solid.principles.exercises.ocp;

public class CostCalculateFactory {
   
    public static CostMangerInterface createCostManager(String method) {
        switch (method.toUpperCase()) {
            case "STANDARD":
                return  new StandardCostCalculate();
            case "EXPRESS":
                return new ExpressCostCalculate();
            default:
                throw new IllegalArgumentException("Invalid cost calculation method: " + method);
        }
    }

}
