package com.itrexgroup.konoplyanik.task2.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;

import org.junit.Assert;
import org.junit.Test;

public class Task2ServiceTest {
	
	@Test
	public void disjunctAllTest_True() {
		@SuppressWarnings("serial")
		List<IntPredicate> predicates = new ArrayList<>() {{
			add((int arg) -> arg > 2);
			add((int arg) -> arg <= 6);
			add((int arg) -> arg * arg < 19);
		}};
		
		Assert.assertTrue(Task2Service.disjunctAll(predicates).test(3));
	}
	
	@Test
	public void disjunctAllTest_Fase() {
		@SuppressWarnings("serial")
		List<IntPredicate> predicates = new ArrayList<>() {{
			add((int arg) -> arg < 2);
			add((int arg) -> arg + 2 >= 6);
			add((int arg) -> arg * arg > 19);
		}};
		
		Assert.assertFalse(Task2Service.disjunctAll(predicates).test(3));
	}
	
	@Test
	public void disjunctAllTest_EmptyList() {
		List<IntPredicate> predicates = new ArrayList<>();
		
		Assert.assertFalse(Task2Service.disjunctAll(predicates).test(3));
	}
	
}
