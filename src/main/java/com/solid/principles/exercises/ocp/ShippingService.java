package com.solid.principles.exercises.ocp;

import org.springframework.stereotype.Service;

/**
 * @author praveen.krishna
 */

@Service
public class ShippingService {

    public double calculateShippingCost(String method, double weight) {
        CostMangerInterface costMangerInterface =  CostCalculateFactory.createCostManager(method);
        return costMangerInterface.calculateCost(weight);
    }
}
