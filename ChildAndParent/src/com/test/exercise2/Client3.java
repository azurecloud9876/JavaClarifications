package com.test.exercise2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client3 {

    public static void main(String[] args) {

        Map<String, Employee> map1 = new HashMap<>();
        Map<String, Employee> map2 = new HashMap<>();

        Employee employee1 = new Employee(1L, "Henry");
        map1.put(employee1.getName(), employee1);
        Employee employee2 = new Employee(22L, "Annie");
        map1.put(employee2.getName(), employee2);
        Employee employee3 = new Employee(8L, "John");
        map1.put(employee3.getName(), employee3);
        Employee employee6 = new Employee(3L, "Henry");
        map1.put(employee6.getName(), employee6);

        Employee employee4 = new Employee(2L, "George");
        map2.put(employee4.getName(), employee4);
        Employee employee5 = new Employee(3L, "Henry");
        map2.put(employee5.getName(), employee5);

        //Convert a Map into a Stream, sort it , Collect and return a new LinkedHashMap (keep the order) b
        Map<String, Employee> result = map1.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o1, o2) -> o1, LinkedHashMap::new));

        //printing map results
        result.forEach((key, value) -> System.out.println(key + " " + value.getId()));

        // new HashMap by copying all the entries from the map1
        Map<String, Employee> map3 = new HashMap<>(map1);

        //we'll iterate over the map2 and merge the entries into map3:
        map2.forEach(
                (key, value) -> map3.merge(key, value, (v1, v2) -> new Employee(v1.getId(), v2.getName())));

        //Stream API in Java 8 can also provide an easy solution to our problem. First,
        // we need to combine our Map instances into one Stream. That's exactly what Stream.concat() operation does
        Stream combined = Stream.concat(map1.entrySet().stream(), map2.entrySet().stream());

        Map<String, Employee> result1 = Stream.concat(map1.entrySet().stream(), map2.entrySet().stream())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (value1, value2) -> new Employee(value2.getId(), value1.getName())));

        Map<String, Employee> result2 = Stream.of(map1, map2)
                .flatMap(map -> map.entrySet().stream())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> new Employee(v1.getId(), v2.getName())));

        Map<String, Employee> result3 = map2.entrySet()
                .stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> new Employee(v1.getId(), v2.getName()),
                        () -> new HashMap<>(map1)));

     /*   //StreamEx is a library that provides additional functionality
        // for the standard Stream API along with the performance improvements.
        Map<String, Employee> result4 = EntryStream.of(map1)
                .append(EntryStream.of(map2))
                .toMap((e1, e2) -> e1);*/


    }

    public static class Employee {

        private final Long id;
        private final String name;

        Employee(Long id, String name) {
            this.id = id;
            this.name = name;

        }

        public Long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        // constructor, getters, setters
    }
}
