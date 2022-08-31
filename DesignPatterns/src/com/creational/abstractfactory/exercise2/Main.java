package com.creational.abstractfactory.exercise2;

public class Main {
    public static void main(String[] args) {
        Imobile samasung = new Samsung();

        MobileClient samsungClient = new MobileClient(samasung);
        System.out.println(samsungClient.getAndroidPhone());
        System.out.println(samsungClient.getIosPhone());

    }

}
