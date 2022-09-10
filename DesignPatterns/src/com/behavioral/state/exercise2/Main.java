package com.behavioral.state.exercise2;

public class Main {
    public static void main(String[] args) {
        Context client = new Context(new ConcreteState1());
        client.request();
        client.request();
        client.request();

    }
}
