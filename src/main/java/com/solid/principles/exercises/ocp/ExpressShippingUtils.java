package com.solid.principles.exercises.ocp;

import org.springframework.stereotype.Component;

/**
 * @author yash.agarwal
 */

@Component("EXPRESS")
public class ExpressShippingUtils implements ShippingUtils {

    @Override
    public double calculateShippingCost(double weight) {
        return weight * 2.0;
    }

}
