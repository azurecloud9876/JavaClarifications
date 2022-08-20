package com.structural.FlyweightPattern.Exercise1;

public class Main {
    public static void main(String[] args) {
        ColorObjectFactory colorObjectFactory = new ColorObjectFactory();
        Color color = colorObjectFactory.GetColor("Red");
        color.Printt();

        Color color1 = colorObjectFactory.GetColor("Blue");
        color1.Printt();

        Color color2 = colorObjectFactory.GetColor("Blue");
        color2.Printt();

        int nbrObject=colorObjectFactory.TotalObjectCreated();
        System.out.println("objects created : " + nbrObject);
    }
}
