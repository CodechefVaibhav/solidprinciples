package com.solid.principles.exercises.ocp.factories;

import com.solid.principles.exercises.ocp.enums.ShippingType;
import com.solid.principles.exercises.ocp.services.ExpressShipping;
import com.solid.principles.exercises.ocp.services.Shipping;
import com.solid.principles.exercises.ocp.services.StandardShipping;
import org.springframework.stereotype.Component;

@Component
public class ShippingMethodFactory {

    public Shipping createShipping(ShippingType shippingType) {
        switch (shippingType) {
            case STANDARD:
                return new StandardShipping();

            case EXPRESS:
                return new ExpressShipping();

            default:
                return new StandardShipping();
        }
    }
}
