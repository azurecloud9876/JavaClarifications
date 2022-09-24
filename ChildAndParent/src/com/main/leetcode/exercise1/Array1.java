package com.main.leetcode.exercise1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
* Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant extra space.

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
Example 2:

Input: nums = [1,1,2]
Output: [1]
Example 3:

Input: nums = [1]
Output: []
*
* https://www.baeldung.com/arrays-sortobject-vs-sortint - JMH
* https://javarevisited.blogspot.com/2015/06/3-ways-to-find-duplicate-elements-in-array-java.html
* https://github.com/amaembo/streamex
*
* */
public class Array1 {

    public static void main(String[] args) {
        Integer[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        findDuplicates1(nums);
        findDuplicates2(nums);
        findDuplicates3(nums);
        findDuplicates4(nums);
        findDuplicates5(nums);
        findDuplicates6(nums);
        findDuplicates7(nums);
    }

    private static List<Integer> findDuplicates1(Integer[] num) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i].equals(num[j])) {
                    //System.out.println("Duplicate Value : "+num[j]);
                    result.add(num[j]);
                }
            }
        }
        System.out.println("findDuplicates1:" + result);
        return result;
    }

    private static List<Integer> findDuplicates2(Integer[] num) {
        Arrays.sort(num);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i].equals(num[j])) {
                    //System.out.println("Duplicate Value : "+num[j]);
                    result.add(num[j]);
                }
            }
        }
        System.out.println("findDuplicates2:" + result);
        return result;
    }

    private static List<Integer> findDuplicates3(Integer[] num) {
        //Arrays.sort(num);
        List<Integer> result = new ArrayList<>();
        Set<Integer> setResult = new HashSet<>();
        for (Integer number : num) {
            if (!setResult.add(number)) {
                result.add(number);
            }
        }
        System.out.println("findDuplicates3:" + result);
        return result;
    }

    private static List<Integer> findDuplicates4(Integer[] num) {
        Arrays.sort(num);
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> mapResult = new HashMap();
        for (Integer number : num) {
            Integer count = mapResult.get(number);
            if (count == null) {
                mapResult.put(number, 1);
            } else {
                mapResult.put(number, ++count);//pre increment to store incremented value otherwise current value is stored
            }
        }
        Set<Map.Entry<Integer, Integer>> entrySet = mapResult.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                result.add(entry.getKey());
            }
        }
        System.out.println("findDuplicates4:" + result);
        return result;
    }

    private static List<Integer> findDuplicates5(Integer[] num) {
        // Set to store the duplicate elements
        Set<Integer> items = new HashSet<>();
        var numbers = Arrays.stream(num);
        var list = numbers.filter(n -> !items.add(n)).collect(Collectors.toList());
        System.out.println("findDuplicates5:" + list);
        return list;
    }

    private static List<Integer> findDuplicates6(Integer[] num) {
        var numbers = Arrays.stream(num);
        var result = numbers.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(n -> n.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("findDuplicates6:" + result);

        return result;
    }

    private static List<Integer> findDuplicates7(Integer[] num) {
        var numbers = Arrays.asList(num);
        var result = numbers.stream()
                .filter(n -> Collections.frequency(numbers, n) > 1) //IllegalStateException: stream has already been operated upon or closed - when stream 'numbers' converted to tolist
                .distinct()//O/p: findDuplicates7:[2, 2, 3, 3] - if we don't use distinct
                .collect(Collectors.toList());
        System.out.println("findDuplicates7:" + result);
        //Alternative
        /*numbers.stream().filter(i -> Collections.frequency(numbers, i) >1)
                .collect(Collectors.toSet()).forEach(System.out::println);*/
        return result;
    }

    private static List<Integer> findDuplicates8(Integer[] num) {
        Arrays.sort(num);

        return Arrays.asList(num);
    }
}
