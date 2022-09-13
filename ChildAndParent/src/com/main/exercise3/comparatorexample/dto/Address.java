package com.main.exercise3.comparatorexample.dto;

public class Address {

    private final String locality;
    private final String city;
    private Address address;

    public Address(String locality, String city) {
        this.locality = locality;
        this.city = city;
    }

    public String getLocality() {
        return locality;
    }

    public String getCity() {
        return city;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
