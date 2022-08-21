package com.structural.CompositePattern.Exercise3;

public class Manager implements Employee {

    private final String empName;
    private final long empId;
    private final String position;

    public Manager(long empId, String name, String position) {
        this.empId = empId;
        this.empName = name;
        this.position = position;

    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(empName + " : " + empId + " : " + position);
    }
}
