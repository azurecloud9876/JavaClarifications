package com.main.exercise3.comparatorexample.dto;

public class Employee {

    private final Long id;
    private final String name;

    public Employee(Long id, String name) {
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