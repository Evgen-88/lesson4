package com.itrexgroup.konoplyanik.task3.service;

import com.itrexgroup.konoplyanik.task3.model.Request;

@FunctionalInterface
public interface RequestHandler {
	
	Request handle(Request request);
	
	default RequestHandler andThen(RequestHandler requestHandler1) {
		return (requestHandler2) -> requestHandler1.handle(this.handle(requestHandler2));
	}

}
