package com.behavioral.strategy.exercise1;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        System.out.println("sort asd");
        context.setStrategy(new ConcreteStrategyA());
        context.businessLogic();
        System.out.println("reverse sort");
        context.setStrategy(new ConcretStrategyB());
        context.businessLogic();
    }
}
