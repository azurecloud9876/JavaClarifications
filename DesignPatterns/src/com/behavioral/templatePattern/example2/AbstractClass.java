package com.behavioral.templatePattern.example2;

public abstract class AbstractClass {
    public void TemplateMethod() {
        Operation1();
        RequiredOperation1();
        Operation2();
        Hook1();
        RequiredOperation2();
        Operation3();
        Hook2();

    }

    void Operation1() {
        System.out.println("Operation 1 ");
    }

    void Operation2() {
        System.out.println("Operation 2 ");
    }

    void Operation3() {
        System.out.println("Operation 3 ");
    }

    void RequiredOperation1() {
    }

    void RequiredOperation2() {
    }

    void RequiredOperation3() {
    }

    void Hook1() {
    }

    void Hook2() {
    }


}
