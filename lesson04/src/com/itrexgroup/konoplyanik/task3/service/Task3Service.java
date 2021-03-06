package com.itrexgroup.konoplyanik.task3.service;

import java.security.MessageDigest;
import java.util.Base64;

import com.itrexgroup.konoplyanik.task3.model.Request;

public class Task3Service {
	
    static RequestHandler wrapInTransactionTag = req ->
      new Request(String.format("<transaction>%s</transaction>", req.getData()));

    final static RequestHandler createDigest = (req) -> {
        String digest = "";
        try {
            final MessageDigest md5 = MessageDigest.getInstance("MD5");
            final byte[] digestBytes = md5.digest(req.getData().getBytes("UTF-8"));
            digest = new String(Base64.getEncoder().encode(digestBytes));
        } catch (Exception ignored) {
        }
        return new Request(req.getData() + String.format("<digest>%s</digest>", digest));
    };

    static RequestHandler wrapInRequestTag = req ->
      new Request(String.format("<request>%s</request>", req.getData()));

    public static RequestHandler commonRequestHandler =  wrapInTransactionTag.andThen(createDigest).andThen(wrapInRequestTag);
	
}
