package com.solid.principles.lsp.defective.service;

import com.solid.principles.lsp.defective.service.interfaces.DocumentService;
import com.solid.principles.lsp.defective.service.interfaces.Writable;
import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service
public class TextDocumentService implements DocumentService, Writable {

	private String content;

	public TextDocumentService() {

	}

	public TextDocumentService(String content) {
		this.content = content;
	}

	public void write(String additionalContent) {
		if (content == null || content.isEmpty()) {
			content = new String("");
		}
		content += additionalContent;
	}

	public String read() {
		return content;
	}
}
