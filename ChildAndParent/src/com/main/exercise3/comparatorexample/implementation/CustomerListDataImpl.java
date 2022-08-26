package com.main.exercise3.comparatorexample.implementation;

import com.main.exercise3.comparatorexample.IData;
import com.main.exercise3.comparatorexample.dto.Customer;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public abstract class CustomerListDataImpl implements IData {


    public CustomerListDataImpl() {
    }


    @Override
    public List getListData() {
        Customer customer1 = new Customer(1, "Daniel", "locality1", "city1");
        Customer customer2 = new Customer(2, "Fredrik", "locality2", "city2");
        Customer customer3 = new Customer(3, "Kyle", "locality3", "city3");
        Customer customer4 = new Customer(4, "Bob", "locality4", "city4");
        Customer customer5 = new Customer(5, "Cat", "locality5", "city5");
        Customer customer6 = new Customer(6, "John", "locality6", "city6");
        List<Customer> list1 = Arrays.asList(customer3, customer2, customer1, customer4, customer5, customer6);
        //List<Customer> list2 = Arrays.asList(customer4, customer5, customer6);
        //List<Customer> list3 = Arrays.asList(customer1, customer2);
        //List<Customer> temp = list1; This is not handling the reference of old list
        //List<Customer> temp = new ArrayList<>(list1);
        return list1;
    }

    @Override
    public Map getMapData() {
        return null;
    }


}
