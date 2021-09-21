package com.itrexgroup.konoplyanik.task1.service;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class Task1ServiceTest {
	
	@Test
	public void isDifferentTest_True() {
		Assert.assertTrue(Task1Service.isDifferent(-2, 5, 28));
	}
	
	@Test
	public void isDifferentTest_False() {
		Assert.assertFalse(Task1Service.isDifferent(1, 1, -1));
	}
}
