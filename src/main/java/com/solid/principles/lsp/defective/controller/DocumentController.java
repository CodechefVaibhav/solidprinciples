package com.solid.principles.lsp.defective.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.solid.principles.lsp.defective.service.TextDocumentService;
import com.solid.principles.lsp.defective.service.ReadOnlyDocumentService;

/**
 * @author vaibhav.kashyap
 */

@RestController
@RequestMapping("/defective/document")
public class DocumentController {

	private final TextDocumentService textDocumentService;
	private final ReadOnlyDocumentService readOnlyDocumentService;

	public DocumentController(TextDocumentService textDocumentService,
			ReadOnlyDocumentService readOnlyDocumentService) {
		this.textDocumentService = textDocumentService;
		this.readOnlyDocumentService = readOnlyDocumentService;
	}

	@PostMapping("/add-content")
	public String addContent(@RequestParam String content) {
		textDocumentService.write(content);
		return "Content added: " + textDocumentService.read();
	}


	@GetMapping("/view-content")
	public String viewContent() {
		return textDocumentService.read();
	}

	@GetMapping("/view-content-read-only")
	public String viewReadOnlyContent() {
		return readOnlyDocumentService.read();
	}
}
