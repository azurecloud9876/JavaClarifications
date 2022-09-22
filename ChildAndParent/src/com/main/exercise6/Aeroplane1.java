package com.main.exercise6;

import java.util.Arrays;
import java.util.List;

/*
 * Plane seats availability for a family of 4 who needs to be closer
 * Rows in flight has a alphabetical order ABC DEFG HJK
 * */
public class Aeroplane1 {

    public static void main(String[] args) {
        String str = "J2";//A1 B3 D1 D4 F3 J2
        String[] seats = str.split(" ");
        List<String> blocked = Arrays.asList(seats);
        int rows = 4;
        int available = 0;
        for (int i = 1; i <= rows; i++) {
            if (!blocked.contains("B" + i) && !blocked.contains("C" + i)
                    && !blocked.contains("D" + i) && !blocked.contains("E" + i)) {
                available++;
            } else if (!blocked.contains("D" + i) && !blocked.contains("E" + i)
                    && !blocked.contains("F" + i) && !blocked.contains("G" + i)) {
                available++;
            }
            if (!blocked.contains("F" + i) && !blocked.contains("G" + i)
                    && !blocked.contains("H" + i) && !blocked.contains("J" + i)) {
                available++;
            }
        }
        System.out.println(available);
    }
}
