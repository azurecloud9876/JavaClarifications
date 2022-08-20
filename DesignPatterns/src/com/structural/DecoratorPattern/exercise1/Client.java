package com.structural.DecoratorPattern.exercise1;

public class Client {
    public static void main(String[] args) {
        Sandwich sandwich = new BasicSandwich();
        Sandwich withCheese = new Cheese(new BasicSandwich());
        Sandwich withEgg = new Egg(new Cheese(new BasicSandwich()));


        //customer A wants plain sandwich
        System.out.println(sandwich.getCost());
        System.out.println(sandwich.getItemName());

        //customer B wants sandwich with cheese
        System.out.println(withCheese.getCost());
        System.out.println(withCheese.getItemName());

        //customer c wants egg and plain sandwich

        //customer D wants cheese,sandwich and egg
        System.out.println(withEgg.getCost());
        System.out.println(withEgg.getItemName());

    }
}
