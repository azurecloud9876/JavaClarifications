package com.creational.factory.exercise3;

public class IceCreamFactory {

    public static IceCream getInstance(String type) {

        switch (type) {
            case "1":
                return new VannilaIFlavor();
            case "2":
                return new ChoclateFlavor();
            case "3":
                return new StrawBerryFlavor();
        }
        return null;
    }
}
