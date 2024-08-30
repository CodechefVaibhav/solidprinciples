package com.solid.principles.exercises.ocp;

import org.springframework.stereotype.Component;

/**
 * @author yash.agarwal
 */

@Component("STANDARD")
public class StandardShippingUtils implements ShippingUtils {

    @Override
    public double calculateShippingCost(double weight) {
        return weight * 1.0;
    }
    
}
