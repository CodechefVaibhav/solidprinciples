package com.solid.principles.exercises.ocp.solution;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service
public class StandardShippingSolutionStrategy implements ShippingSolutionStrategy {

	@Override
	public double calculateCost(double weight) {
		return weight * 1.0;
	}
}