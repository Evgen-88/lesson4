package com.itrexgroup.konoplyanik.task3.model;

public class Request {
	private final String data;

    public Request(String requestData) {
        this.data = requestData;
    }

    public String getData() {
        return data;
    }
}
