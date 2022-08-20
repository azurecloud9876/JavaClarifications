package com.structural.DecoratorPattern.exercise1;

public class BasicSandwich implements Sandwich {
    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String getItemName() {
        return "Basic Sandwich";
    }
}
