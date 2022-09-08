package com.behavioral.templatePattern.example2;

public class ConcreteClass1 extends AbstractClass {
    @Override
    void RequiredOperation1() {
        super.RequiredOperation1();
        System.out.println("Concrete Class 1 : RequiredOperation1");
    }

    @Override
    void RequiredOperation2() {
        super.RequiredOperation2();
        System.out.println("Concrete Class 1 : RequiredOperation2");

    }
}
