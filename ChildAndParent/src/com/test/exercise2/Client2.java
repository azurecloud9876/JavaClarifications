package com.test.exercise2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Client2 {


    public static void main(String[] args) {

        Customer customer1 = new Customer(1, "Daniel", "locality1", "city1");
        Customer customer2 = new Customer(2, "Fredrik", "locality2", "city2");
        Customer customer3 = new Customer(3, "Kyle", "locality3", "city3");
        Customer customer4 = new Customer(4, "Bob", "locality4", "city4");
        Customer customer5 = new Customer(5, "Cat", "locality5", "city5");
        Customer customer6 = new Customer(6, "John", "locality6", "city6");

        List<Customer> list1 = Arrays.asList(customer3, customer2, customer1);
        List<Customer> list2 = Arrays.asList(customer4, customer5, customer6);
        List<Customer> list3 = Arrays.asList(customer1, customer2);
        List<Customer> temp = list1;
        System.out.println("Before Sort");
        for (Customer c : list1) {
            System.out.println(c.name);
        }
        System.out.println("=========================================");
        //Java 8 Comparator - Order by First name
        list1.sort(Comparator.comparing(byName -> byName.name));
        System.out.println("After Sort");
        for (Customer c : list1) {
            System.out.println(c.name);
        }
        //or
        list1 = temp;
        Comparator<Customer> sortCustomer = (o1, o2) -> o1.name.compareTo(o2.name);
        System.out.println("=========================================");
        System.out.println("After Sort");
        for (Customer c : list1) {
            System.out.println(c.name);
        }
        //or
        list1 = temp;
        list1.sort(Comparator.comparing(Customer::getName));
        System.out.println("=========================================");
        System.out.println("After Sort");
        for (Customer c : list1) {
            System.out.println(c.name);
        }

        ////Sorting on multiple fields; Group by.
        list1 = temp;
        Comparator<Customer> multiField = Comparator.comparing(Customer::getName).thenComparing(Customer::getId);
        list1.sort(multiField);
        System.out.println("=========================================");
        System.out.println("After Sort");
        for (Customer c : list1) {
            System.out.println(c.name);
        }

        //You can sort the collection of objects in parallel using multiple threads as well.
        // It is going to be very fast if the collection is big enough to have thousands of objects.
        list1 = temp;
        Customer[] customers = list1.toArray(new Customer[list1.size()]);
        Arrays.parallelSort(customers, multiField);
        System.out.println("=========================================");
        System.out.println("After Sort");
        for (Customer c : list1) {
            System.out.println(c.name);
        }

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.forEach(System.out::println);


        List<Customer> linkedList1 = new LinkedList<>(list1);
    }

    static class Customer {
        private final Integer id;
        private final String name;
        private final Address address;


        public Customer(int id, String name, String locality1, String city1) {
            this.id = id;
            this.name = name;
            this.address = new Address(locality1, city1);
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

        // standard getters and setters
    }

    static class Address {
        private final String locality;
        private final String city;

        Address(String locality, String city) {
            this.locality = locality;
            this.city = city;
        }

        // standard getters and setters
    }


}
