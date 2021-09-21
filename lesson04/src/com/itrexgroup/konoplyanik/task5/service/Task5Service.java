package com.itrexgroup.konoplyanik.task5.service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task5Service {
	
	public static void partitioningWords() {
        String[] words = {"aaaa", "aaa", "a", "aa"};
        //String[] words = {"level", "bbaa", "ac"};

        Map<Boolean, List<String>> palindromeOrNoMap = Arrays.stream(words)
          .collect(Collectors.partitioningBy(word -> new StringBuilder(word).reverse().toString().equals(word)));
        System.out.println(palindromeOrNoMap);
    }
}
