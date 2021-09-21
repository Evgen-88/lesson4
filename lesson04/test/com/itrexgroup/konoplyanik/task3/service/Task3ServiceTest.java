package com.itrexgroup.konoplyanik.task3.service;

import org.junit.Assert;
import org.junit.Test;

import com.itrexgroup.konoplyanik.task3.model.Request;

public class Task3ServiceTest {
	
	@Test
	public void commonRequestHandlerTest() {
		String expect = "<request><transaction>test</transaction><digest>MIOv6aGZeqU/nLDCrywDqA==</digest></request>";
		Assert.assertEquals(Task3Service.commonRequestHandler.handle(new Request("test")).getData(), expect);
	}
	
}
