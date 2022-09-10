package com.behavioral.strategy.exercise1;

import java.util.ArrayList;

public class Context {
    private IStrategy strategy;

    public Context() {

    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void businessLogic() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        ArrayList<Integer> results = strategy.algo(list);
        String resultString = " ";
        for (Integer e : results) {
            resultString += e + " ";


        }
        System.out.println(resultString);
    }
}
