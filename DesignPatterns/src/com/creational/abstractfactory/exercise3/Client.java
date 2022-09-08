package com.creational.abstractfactory.exercise3;

public class Client {
    public static void main(String[] args) {

        String fact = FactoryProducer.getFactoryInstance("withdraw NOK {1000}");
        System.out.println(fact);
        String fact1 = FactoryProducer.getFactoryInstance("savings account");
        System.out.println(fact1);
    }
}
