package com.behavioral.templatePattern.example2;

public class ConcreteClass2 extends AbstractClass {

    @Override
    void RequiredOperation1() {
        super.RequiredOperation1();
        System.out.println("Concrete Class 2 : RequiredOperation1");
    }

    @Override
    void RequiredOperation2() {
        super.RequiredOperation2();
        System.out.println("Concrete Class 2 : RequiredOperation2");

    }

    @Override
    void Hook1() {
        super.Hook1();
        System.out.println("Concrete Class 2 : hook 1 ");
    }
}
