package com.main.exercise3.comparatorexample.service;

import com.main.exercise3.comparatorexample.dto.Employee;
import com.main.exercise3.comparatorexample.implementation.EmployeeMapDataImpl;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapDataHelper extends EmployeeMapDataImpl {

    public MapDataHelper() {
    }

    @Override
    public Map getMapData() {
        return super.getMapData();
    }

    private void mapUtility1() {

        Map<String, Employee> map1 = new HashMap<>();
        Map<String, Employee> map2 = new HashMap<>();
        Map<String, Employee> resultMap = getMapData();

        //Convert a Map into a Stream, sort it , Collect and return a new LinkedHashMap (keep the order) b
        Map<String, Employee> result = resultMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o1, o2) -> o1, LinkedHashMap::new));

        //printing map results
        result.forEach((key, value) -> System.out.println(key + " " + value.getId()));

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
}
