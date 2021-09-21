package com.itrexgroup.konoplyanik.task4.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task4Service {
	
	public static void collectProduct() {
		List<Integer> numbers = Arrays.asList(0, 1, 2, 3);
        long val = numbers.stream().collect(Collectors.reducing(1, (prod, item) -> prod * item * item));
        System.out.println(val);
	}
}
