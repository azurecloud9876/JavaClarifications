package com.test.one;

/*
 * Derived class extended base
 * 1. When child instance is created parent super constructor is invoked first before child constructor.
 * 2. How does the same behave when we have no param and parameterized constructor, unless explicitly invoked super
 *  parameterized  constructor, a base non parameterized constructor is called.
 * 3. Only one super keyword is allowed in constructor, decide yourself to call either parameterized or non, or leave up
 * to JVM
 *  */
public class TestClient {

    public static void main(String[] args) {
        Base base = new Derived("Hello ");
    }

}
