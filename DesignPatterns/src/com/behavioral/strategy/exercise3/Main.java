package com.behavioral.strategy.exercise3;

import com.behavioral.strategy.exercise3.strategy.CreditCardPayment;
import com.behavioral.strategy.exercise3.strategy.UPIPayment;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        // The strategy can now be easily picked at runtime

        paymentService.setStrategy(new CreditCardPayment());
        paymentService.processOrder(100);

        System.out.println("==========================================");

        paymentService.setStrategy(new UPIPayment());
        paymentService.processOrder(100);
    }
}
