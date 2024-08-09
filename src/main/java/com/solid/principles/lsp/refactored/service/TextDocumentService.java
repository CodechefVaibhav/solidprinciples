package com.solid.principles.lsp.refactored.service;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service("RefactoredTextDocumentService")
public class TextDocumentService implements DocumentService {

	private String content;

	public TextDocumentService() {

	}

	public TextDocumentService(String content) {
		this.content = content;
	}

	public void addContent(String additionalContent) {
		content += additionalContent;
	}

	@Override
	public String getContent() {
		return content;
	}
}
