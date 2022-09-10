package com.behavioral.Observer.exercise1;

/**
 * @author khalil el maghraoui <khalil.elmaghraoui.1@gmail.com>
 * @created 12/20/2020.
 */
public class Person implements Observer {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.printf("%s Got new notification: %s%n", this.name, message);
    }
}
