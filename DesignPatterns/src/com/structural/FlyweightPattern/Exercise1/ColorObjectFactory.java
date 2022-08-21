package com.structural.FlyweightPattern.Exercise1;

import java.util.HashMap;

public class ColorObjectFactory {
    HashMap<String, Color> Colors = new HashMap<>();
    public int TotalObjectCreated(){
        return Colors.size();
    }
    public  Color GetColor(String ColorName){
        Color color =null;
        if(Colors.containsKey(ColorName)){
            color = Colors.get(ColorName);
        }
        else {
            switch (ColorName) {
                case "Red" -> {
                    color = new Red();
                    Colors.put("Red", color);
                }
                case "Green" -> {
                    color = new Green();
                    Colors.put("Green", color);
                }
                case "Blue" -> {
                    color = new Blue();
                    Colors.put("Blue", color);
                }
            }

        }
        return color;
    }
}
