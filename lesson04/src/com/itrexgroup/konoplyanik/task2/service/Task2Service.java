package com.itrexgroup.konoplyanik.task2.service;

import java.util.List;
import java.util.function.IntPredicate;

public class Task2Service {
	
	public static IntPredicate disjunctAll(List<IntPredicate> predicates) {
		IntPredicate intPredicate = arg -> false;
        return predicates.stream()
        		.reduce((intPred, intPredNext) -> intPred.or(intPredNext)).orElse(intPredicate);
    }
	
}
