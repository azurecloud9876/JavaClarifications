package com.behavioral.state.exercise1;

public class Client {

    public static void main(String[] args) {
        Order order = new Order();

        order.paymentSuccessful();
        order.dispatched();

        order.cancel();
    }
}
