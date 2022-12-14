package com.main.exercise3.comparatorexample.service;

import com.main.exercise3.comparatorexample.dto.Customer;
import com.main.exercise3.comparatorexample.implementation.CustomerListDataImpl;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListDataHelper extends CustomerListDataImpl {

    public ListDataHelper() {

    }


    public void getCustomerListData1() {
        //listUtility1();
        //listUtility2();
        //listUtility3();
        listUtility6();
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
        list1.sort(Comparator.comparing(customer -> customer.getName()));
        list1.forEach(a -> System.out.println(a));
        //list1.stream().collect(Collectors.toSet());
        list1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
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

    }

    private void listUtility2() {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.sort(Comparator.naturalOrder());
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

    private void listUtility3() {
        // Returns consecutive sublists of a list, each of the same size (the final list may be smaller) - partitioning
        final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        final int chunkSize = 3;
        final AtomicInteger counter = new AtomicInteger();

        final Collection<List<Integer>> result = numbers.stream()
                .collect(Collectors.groupingBy(it -> counter.getAndIncrement() / chunkSize))
                .values();

        System.out.println(result);
    }

    private void listUtility4() {
        // Returns consecutive sublists of a list, each of the same size (the final list may be smaller) - partitioning
        //https://e.printstacktrace.blog/divide-a-list-to-lists-of-n-size-in-Java-8/
        final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        final List<List<Integer>> result = new ArrayList<>();
        final int chunkSize = 3;
        final AtomicInteger counter = new AtomicInteger();

        for (int number : numbers) {
            System.out.println(counter.get());
            if (counter.getAndIncrement() % chunkSize == 0) {
                System.out.println("counter in");
                result.add(new ArrayList<>());
            }
            result.get(result.size() - 1).add(number);
        }
        System.out.println(result);
        System.out.println(result.size());

    }


    private void listUtility5() {
        //Finding Largest String in ArrayList

        List<String> str = new ArrayList<>();
        // Add names to ArrayList
        str.add("Jim Bob");
        str.add("Bobby Jones");
        str.add("Rob Stiles");
        var res = Collections.max(str, Comparator.comparing(String::length)); // or s -> s.length()
        String max = str.stream().max(Comparator.comparing(String::length)).get();
        Optional<String> op = str.stream().sorted((e1, e2) -> e1.length() > e2.length() ? -1 : 1).findFirst();


       /* List<Integer> numList = Arrays.stream(str).map(String::length).collect(Collectors.toList());
        Integer m = numList.stream().mapToInt(i->i).max().orElse(4000);  //get strings with their length
        int k = numList.indexOf(m);  //index of String with Maximum Length
        System.out.println(str.get(k)); //get your longest string*/

    }

    private void listUtility6() {
        List<Customer> list1 = getListData();
        var map1 = list1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map1);
        var map2 = list1.stream().collect(Collectors.groupingBy(Customer::getName));
        System.out.println(map2);
        var db1 = list1.stream().mapToInt(customer -> customer.getId()).average();
        System.out.println(db1);
        var db2 = list1.stream().mapToInt(customer -> customer.getId()).average().getAsDouble();
        System.out.println(db2);
        var fil1 = list1.stream()
                .filter(zone -> zone.getAddress().getLocality().equalsIgnoreCase("Zone2"))
                .filter(name -> name.getName().equalsIgnoreCase("Cat"))
                .collect(Collectors.toList());
        System.out.println(fil1);
        var fil2 = list1.stream()
                .filter(customer -> customer.getName().equalsIgnoreCase("John"))
                .map(mapID -> mapID.withsetId(10))
                .collect(Collectors.toList());
        System.out.println(fil2);

        var fil3 = list1.stream()
                .filter(customer -> customer.getName().equalsIgnoreCase("John"))
                .min(Comparator.comparing(Customer::getId));
        System.out.println(fil3);

       /*list1.stream()
                .filter(customer -> customer.getName().equalsIgnoreCase("John"))
                .map(cust-> new Customer(11, "Daniel", "Zone1", "city1"))
                .forEach(list1::add);//java.util.ConcurrentModificationException
        list1.forEach(System.out::println);*/

        Stream<Customer> pointsResults = Stream.concat(list1.stream(),
                list1.stream()
                        .filter(customer -> customer.getName().equalsIgnoreCase("John"))
                        .map(cust -> new Customer(11, "Daniel", "Zone1", "city1")));

        List<Customer> result = list1.stream()
                .filter(customer -> customer.getName().equalsIgnoreCase("John"))
                .collect(Collectors.toCollection(ArrayList::new));

    }

    public Map<String, List<Customer>> groupByJobTitle(List<Customer> employeeList) {
        Map<String, List<Customer>> resultMap = new HashMap<>();
        for (int i = 0; i < employeeList.size(); i++) {
            Customer employee = employeeList.get(i);
            List<Customer> employeeSubList = resultMap.getOrDefault(employee.getName(), new ArrayList<Customer>());
            employeeSubList.add(employee);
            resultMap.put(employee.getName(), employeeSubList);
        }
        return resultMap;
    }

    public Map<String, List<Customer>> groupByJobTitle_java8(List<Customer> employeeList) {
        return employeeList.stream().collect(Collectors.groupingBy(Customer::getName));
    }

    private void listUtility7() {
        int[] A = {1, 3, 6, 4, 1, 2};
        List a = List.of(A);
        a.sort(Comparator.comparing(Object::hashCode));
        a.forEach(System.out::println);

    }
}
