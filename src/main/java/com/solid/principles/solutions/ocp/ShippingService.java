package com.solid.principles.solutions.ocp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ShippingService {

    private Map<String, ShippingCost> shippingCosts;

    public ShippingService(Map<String, ShippingCost> shippingCosts) {
        this.shippingCosts = shippingCosts;
    }
    public double calculateCost(String costMethod,double weight) {
        Double cost = null;
        try{
            ShippingCost shippingCost = shippingCosts.get(costMethod);
            cost = shippingCost.calculateCost(weight);// it can throw null pointer
            // if shippingCosts map does have requiredCostMethod
        } catch (Exception e) {
            //log exception
            throw e;
        }
        return cost;
    }
}
