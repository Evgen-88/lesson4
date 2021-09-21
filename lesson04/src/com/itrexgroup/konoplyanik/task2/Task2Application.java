package com.itrexgroup.konoplyanik.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;

import com.itrexgroup.konoplyanik.task2.service.Task2Service;

public class Task2Application {

	public static void main(String[] args) {
		
		@SuppressWarnings("serial")
		List<IntPredicate> predicates = new ArrayList<>() {{
			add((int arg) -> arg > 2);
			add((int arg) -> arg <= 6);
			add((int arg) -> arg * arg < 19);
		}};
		
		System.out.println(Task2Service.disjunctAll(predicates).test(5));
		
	}

}
