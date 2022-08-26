package com.main.exercise3.comparatorexample.implementation;

import com.main.exercise3.comparatorexample.IData;
import com.main.exercise3.comparatorexample.dto.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class EmployeeMapDataImpl implements IData {


    public EmployeeMapDataImpl() {
    }

    @Override
    public Map getMapData() {

        Map<String, Employee> map1 = new HashMap<>();
        Map<String, Employee> map2 = new HashMap<>();
        Map<String, Employee> map3 = new HashMap<>(map1);

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

        map2.forEach(
                (key, value) -> map3.merge(key, value, (v1, v2) -> new Employee(v1.getId(), v2.getName())));
        //Merge maps
        //map1.putAll(map2); // duplicate keys will be overriden
        //Merge maps
        //map2.forEach((key, value) -> map3.merge(key, value, String::concat));
        return map3;
    }

    @Override
    public List getListData() {
        return null;
    }
}
