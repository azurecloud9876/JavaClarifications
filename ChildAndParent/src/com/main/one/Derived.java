package com.main.one;

public class Derived extends Base {

    public Derived(String s) {
        //super(); // Stmt-1
        super(s); // Stmt-2
        System.out.println("Derived: " + s);
    }

    public Derived() {
        System.out.println("Derived ");
    }

}
