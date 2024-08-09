package com.solid.principles.lsp.defective.service;

import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service
public class TextDocumentService {

	private String content;

	public TextDocumentService() {

	}

	public TextDocumentService(String content) {
		this.content = content;
	}

	public void addContent(String additionalContent) {
		if (content == null || content.isEmpty()) {
			content = new String("");
		}
		content += additionalContent;
	}

	public String getContent() {
		return content;
	}
}
