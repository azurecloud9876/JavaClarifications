package com.main.exercise3.comparatorexample.service;

import com.main.exercise3.comparatorexample.dto.Customer;
import com.main.exercise3.comparatorexample.implementation.CustomerListDataImpl;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListDataHelper extends CustomerListDataImpl {

    public ListDataHelper() {

    }


    public void getCustomerListData1() {
        listUtility1();
    }

    private void listUtility1() {
        List<Customer> list1 = getListData();
        List<Customer> temp = new ArrayList<>(list1);
        System.out.println("Before Sort");
        for (Customer c : list1) {
            System.out.println(c.getName());
        }
        System.out.println("=========================================");
        //Java 8 Comparator - Order by First name
        list1.sort(Comparator.comparing(byName -> byName.getName()));
        //or
        list1 = temp;
        Comparator<Customer> sortCustomer = (o1, o2) -> o1.getName().compareTo(o2.getName());
        list1.sort(sortCustomer);

        //or
        list1 = temp;
        list1.sort(Comparator.comparing(Customer::getName));

        ////Sorting on multiple fields; Group by.
        list1 = temp;
        Comparator<Customer> multiField = Comparator.comparing(Customer::getName).thenComparing(Customer::getId);
        list1.sort(multiField);

        //You can sort the collection of objects in parallel using multiple threads as well.
        // It is going to be very fast if the collection is big enough to have thousands of objects.
        list1 = temp;
        Customer[] customers = list1.toArray(new Customer[list1.size()]);
        Arrays.parallelSort(customers, multiField);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.forEach(System.out::println);
    }

    private void listUtility2() {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.forEach(System.out::println);
        numbers.forEach((n) -> System.out.println(n));
        //numbers.forEach((n) -> methodCustom(n));

        List<Integer> source = Arrays.asList(1, 2, 3);
        List<Integer> dest = Arrays.asList(5, 6, 7, 8, 9, 10);
        Collections.copy(dest, source);
        List<Integer> copy = dest.stream().collect(Collectors.toList());
        List<Integer> copy1 = dest.stream().skip(1).collect(Collectors.toList());
        List<Integer> copy2 = dest.stream().filter(s -> s > 10).collect(Collectors.toList());
        List<Integer> copy3 = Optional.ofNullable(dest)
                .map(List::stream)
                .orElseGet(Stream::empty)
                .collect(Collectors.toList());
        //java 10
        List<Integer> copy4 = List.copyOf(dest);

    }
}
