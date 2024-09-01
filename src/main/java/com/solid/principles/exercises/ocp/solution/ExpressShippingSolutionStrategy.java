package com.solid.principles.exercises.ocp.solution;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service
public class ExpressShippingSolutionStrategy implements ShippingSolutionStrategy {

	@Override
	public double calculateCost(double weight) {
		return weight * 2.0;
	}
}