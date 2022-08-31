package com.creational.factory.exercise3;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        System.out.println("Enter your choice of ice cream");
        System.out.println("1-vanilla, 2- strawberry, 3- chocolate, 4- exit");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        System.out.println("\n your choice of ice cream is getting ready");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        IceCream iceCream = IceCreamFactory.getInstance(type);
        iceCream.prepare();

    }
}
