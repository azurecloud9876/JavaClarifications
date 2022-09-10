package com.main.exercise2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Client1 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("testtttttt");
        list.add(null);
        addIgnoreNull(list, 1); // NullPointerException: Collection is empty
        System.out.println(list.isEmpty());//NullPointerException: Cannot invoke "java.util.List.isEmpty()"
        System.out.println(list.size());                                   // because "list" is null
    }

    private static boolean addIgnoreNull(final Collection<Integer> collection, final Integer object) {
        Objects.requireNonNull(collection, "Collection is empty");
        return object != null && collection.add(object);
    }

    //This method is from common utils 4
    public static <T> boolean addIgnoreNull(final Collection<T> collection, final T object) {
        Objects.requireNonNull(collection, "collection");
        return object != null && collection.add(object);
    }
}
