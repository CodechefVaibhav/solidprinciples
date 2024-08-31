package com.solid.principles.exercises.ocp.services;

import com.solid.principles.exercises.ocp.enums.ShippingType;

public interface Shipping {

    double calculateShippingCost(double weight);

}
