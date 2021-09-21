package com.itrexgroup.konoplyanik.task6.service;

import java.util.function.Function;

public class Task6Service {
	
	public static void functionApplying() {
        Function<Integer, Function<Integer, Function<Integer, Integer>>> function1 = x -> y -> z -> x + y * y + z * z * z;

        Function<String, Function<String, Function<String, Function<String, String>>>> function2 = a -> b -> c -> d -> new StringBuilder(a.toLowerCase())
          .append(c.toUpperCase())
          .append(b.toLowerCase())
          .append(d.toUpperCase())
          .toString();
        
        System.out.println(function1.apply(0).apply(3).apply(2));
        System.out.println(function2.apply("a").apply("b").apply("c").apply("d"));
    }
}
