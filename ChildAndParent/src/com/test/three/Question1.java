package com.test.three;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Question1 {
    public static void main(String[] args) {
        List<String> songTitles = Arrays.asList("telugu", "hindi", "english");
        Function<String, String> capitalize = str -> str.toUpperCase();
        songTitles.stream().map(capitalize).forEach(System.out::println);
    }
}
