package com.main.exercise3.comparatorexample.dto;


public class Customer {

    private Integer id;
    private String name;
    private Address address;

    public Integer withsetId(Integer id) {
        this.id = id;

        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

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
