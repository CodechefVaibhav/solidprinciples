package com.solid.principles.exercises.ocp.solution;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service
public class ShippingSolutionService {

	private final List<ShippingSolutionStrategy> shippingStrategies;

	public ShippingSolutionService(List<ShippingSolutionStrategy> shippingStrategies) {
		this.shippingStrategies = shippingStrategies;
	}

	public double calculateShippingCost(double weight) {
		double cost = 0;
		for (ShippingSolutionStrategy strategy : shippingStrategies) {
			cost += strategy.calculateCost(weight);
		}
		return cost;
	}
}