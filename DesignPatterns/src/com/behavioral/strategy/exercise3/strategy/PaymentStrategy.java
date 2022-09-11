package com.behavioral.strategy.exercise3.strategy;

public interface PaymentStrategy {
    void collectPaymentDetails();

    boolean validatePaymentDetails();

    void pay(int amount);
}
