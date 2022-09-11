package com.behavioral.strategy.exercise3.strategy;

import com.behavioral.strategy.exercise3.UPIData;

public class UPIPayment implements PaymentStrategy {

    private UPIData upi;


    @Override
    public void collectPaymentDetails() {
        upi = new UPIData("498494949");
    }

    @Override
    public boolean validatePaymentDetails() {
        System.out.println("Validating upi Info: " + upi);
        return true;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using UPI");
        upi.setAmount(amount);
    }
}
