package com.main.exercise3.comparatorexample.dto;


public class Customer {

    private final Integer id;
    private final String name;
    private final Address address;

    public Customer(Integer id, String name, String locality, String city) {
        this.id = id;
        this.name = name;
        this.address = new Address(locality, city);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}
