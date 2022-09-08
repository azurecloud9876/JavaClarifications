package com.creational.abstractfactory.exercise3.component;

import com.creational.abstractfactory.exercise3.Currency;

public class USD implements Currency {
    @Override
    public String currencyType(String amount) {
        return "Here is your requested US Dollars:" + amount;
    }
}
