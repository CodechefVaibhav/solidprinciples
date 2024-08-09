package com.solid.principles.ocp.defective.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.solid.principles.ocp.defective.service.PaymentService;

/**
 * @author vaibhav.kashyap
 */

@RestController
@RequestMapping("/defective/payment")
public class PaymentController {

	private final PaymentService paymentService;

	public PaymentController(PaymentService paymentService) {
		this.paymentService = paymentService;
	}

	@GetMapping("/process")
	public String processPayment(@RequestParam String paymentType) {
		paymentService.processPayment(paymentType);
		return "Payment processed for: " + paymentType;
	}
}
