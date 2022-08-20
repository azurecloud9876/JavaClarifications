package com.structural.FlyweightPattern.Exercise1;

import java.util.HashMap;
import java.util.Hashtable;

public class ColorObjectFactory {
    HashMap<String,Color>  Colors = new HashMap<String , Color>();
    public int TotalObjectCreated(){
        return Colors.size();
    }
    public  Color GetColor(String ColorName){
        Color color =null;
        if(Colors.containsKey(ColorName)){
            color = Colors.get(ColorName);
            return color;
        }
        else {
            switch (ColorName)
            {  case "Red":
                color=new Red();
                Colors.put("Red",color);
                break;
                case "Green":
                    color=new Green();
                    Colors.put("Green",color);
                    break;
                case "Blue":
                    color=new Blue();
                    Colors.put("Blue",color);
                    break;

                }
                return color;

        }
    }
}
