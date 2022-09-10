package com.behavioral.strategy.exercise1;

import java.util.ArrayList;
import java.util.Collections;

public class ConcretStrategyB implements IStrategy {
    @Override
    public ArrayList<Integer> algo(Object data) {
        ArrayList list = (ArrayList) data;
        Collections.sort(list);
        Collections.reverse(list);
        return list;

    }
}
