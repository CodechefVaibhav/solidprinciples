package com.solid.principles.lsp.refactored.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.solid.principles.lsp.refactored.service.TextDocumentService;
import com.solid.principles.lsp.refactored.service.ReadOnlyDocumentService;

/**
 * @author vaibhav.kashyap
 */

@RestController("RefactoredDocumentController")
@RequestMapping("/refactored/document")
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
		textDocumentService.addContent(content);
		return "Content added: " + textDocumentService.getContent();
	}

	@GetMapping("/view-content")
	public String viewContent() {
		return textDocumentService.getContent();
	}

	@GetMapping("/view-content-read-only")
	public String viewReadOnlyContent() {
		return readOnlyDocumentService.getContent();
	}
}
