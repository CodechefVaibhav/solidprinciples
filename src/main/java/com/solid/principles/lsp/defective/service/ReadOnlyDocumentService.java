package com.solid.principles.lsp.defective.service;

import com.solid.principles.lsp.defective.service.interfaces.DocumentService;
import com.solid.principles.lsp.defective.service.interfaces.Readable;
import org.springframework.stereotype.Service;

/**
 * @author vaibhav.kashyap
 */

@Service
public class ReadOnlyDocumentService  implements DocumentService {
	private String content;
	public ReadOnlyDocumentService() {

	}
	public String read(){
		return content;
	}

}