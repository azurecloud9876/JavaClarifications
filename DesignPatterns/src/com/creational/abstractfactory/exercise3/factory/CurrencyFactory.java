package com.creational.abstractfactory.exercise3.factory;

import com.creational.abstractfactory.exercise3.component.Norway;
import com.creational.abstractfactory.exercise3.component.USD;

public class CurrencyFactory extends AbstractFactory {
    @Override
    public String getAccess(String type) {
        return null;
    }

    @Override
    public String getCurrency(String type) {
        if (type.contains("NOK"))
            return new Norway().currencyType(type);
        else if (type.contains("USD"))
            return new USD().currencyType(type);
        else {
            System.out.println("chose the currency");
            return null;
        }
    }
}