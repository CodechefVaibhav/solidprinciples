package com.solid.principles.lsp.defective.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.solid.principles.lsp.defective.service.TextDocumentService;
import com.solid.principles.lsp.defective.service.ReadOnlyDocumentService;

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
		textDocumentService.addContent(content);
		return "Content added: " + textDocumentService.getContent();
	}

	@PostMapping("/add-content-read-only")
	public String addContentToReadOnly(@RequestParam String content) {
		try {
			readOnlyDocumentService.addContent(content);
			return "Content added to read-only document: " + readOnlyDocumentService.getContent();
		} catch (UnsupportedOperationException e) {
			return "Failed to add content: " + e.getMessage();
		}
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
