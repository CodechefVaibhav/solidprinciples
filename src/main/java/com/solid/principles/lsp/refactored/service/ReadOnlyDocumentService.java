package com.solid.principles.lsp.refactored.service;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service("RefactoredReadOnlyDocumentService")
public class ReadOnlyDocumentService implements DocumentService {

	private String content;

	public ReadOnlyDocumentService() {

	}

	public ReadOnlyDocumentService(String content) {
		this.content = content;
	}

	@Override
	public String getContent() {
		return content;
	}
}