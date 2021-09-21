package com.itrexgroup.konoplyanik.task1.service;

public class Task1Service {
	
	public static boolean isDifferent(int first, int second, int third) {
		TernaryIntPredicate ternaryIntPredicate = (x, y, z) -> x != y && x != z && y != z;
		return ternaryIntPredicate.test(first, second, third);
	}
}
