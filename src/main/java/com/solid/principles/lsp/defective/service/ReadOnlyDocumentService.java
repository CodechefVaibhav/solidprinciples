package com.solid.principles.lsp.defective.service;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service
public class ReadOnlyDocumentService extends TextDocumentService {

	public ReadOnlyDocumentService() {

	}

	public ReadOnlyDocumentService(String content) {
		super(content);
	}

	@Override
	public void addContent(String additionalContent) {
		throw new UnsupportedOperationException("Cannot modify a read-only document");
	}
}