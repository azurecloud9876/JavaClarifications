package com.structural.CompositePattern.Exercise3;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Employee {

    private final List<Employee> empList = new ArrayList<>();

    @Override
    public void showEmployeeDetails() {
        for (Employee emp : empList) {
            emp.showEmployeeDetails();
        }
    }

    public void addEmployee(Employee emp) {
        empList.add(emp);
    }

    public void removeEmployee(Employee emp) {
        empList.remove(emp);
    }
}
