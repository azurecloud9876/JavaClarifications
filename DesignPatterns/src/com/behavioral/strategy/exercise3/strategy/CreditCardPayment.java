package com.behavioral.strategy.exercise3.strategy;

import com.behavioral.strategy.exercise3.CreditCard;

public class CreditCardPayment implements PaymentStrategy {

    private CreditCard card;


    @Override
    public void collectPaymentDetails() {
        card = new CreditCard("cardNumber", "expiryDate", "cvv");
        System.out.println("Collecting Card Details...");
    }

    @Override
    public boolean validatePaymentDetails() {
        System.out.println("Validating Card Info: " + card);
        return true;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using Credit Card");
        card.setAmount(card.getAmount() - amount);
    }
}
