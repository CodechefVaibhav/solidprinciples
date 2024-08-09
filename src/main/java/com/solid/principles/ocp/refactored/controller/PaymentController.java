package com.solid.principles.ocp.refactored.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.solid.principles.ocp.refactored.service.PaymentService;

/**
 * @author vaibhav.kashyap
 */

@RestController("RefactoredPaymentController")
@RequestMapping("/refactored/payment")
public class PaymentController {

	private final PaymentService paymentService;

	@Autowired
	public PaymentController(PaymentService paymentService) {
		this.paymentService = paymentService;
	}

	@GetMapping("/process")
	public String processPayment(@RequestParam String paymentType) {
		paymentService.processPayment(paymentType);
		return "Payment processed for: " + paymentType;
	}
}
