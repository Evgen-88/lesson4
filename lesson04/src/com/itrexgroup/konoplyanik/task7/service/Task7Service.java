package com.itrexgroup.konoplyanik.task7.service;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Task7Service {

	public static void mapperLauncher() {
		System.out.println(multTwoAndThenAddOneTransformation.apply(Arrays.asList(1, 1, 1)));
		System.out.println(multTwoAndThenAddOneTransformation.apply(Arrays.asList(1, 2, 3)));
		System.out.println(squareAndThenGetNextEvenNumberTransformation.apply(Arrays.asList(1, 1, 1)));
		System.out.println(squareAndThenGetNextEvenNumberTransformation.apply(Arrays.asList(1, 2, 3)));
	}

	public static final Function<List<IntUnaryOperator>, UnaryOperator<List<Integer>>> multifunctionalMapper = opList -> {
		IntUnaryOperator operator = opList.stream().reduce(op -> op, IntUnaryOperator::andThen);
		return list -> list.stream().map(operator::applyAsInt).collect(Collectors.toList());
	};

	public static final UnaryOperator<List<Integer>> identityTransformation = multifunctionalMapper
			.apply(Arrays.asList(x -> x));

	public static final UnaryOperator<List<Integer>> multTwoAndThenAddOneTransformation = multifunctionalMapper
			.apply(Arrays.asList(x -> 2 * x, x -> x + 1));

	public static final UnaryOperator<List<Integer>> squareAndThenGetNextEvenNumberTransformation = multifunctionalMapper
			.apply(Arrays.asList(x -> x * x, x -> (x + 1) % 2 == 0 ? x + 1 : x + 2));

}
