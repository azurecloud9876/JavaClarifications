package com.creational.abstractfactory.exercise3.factory;

import com.creational.abstractfactory.exercise3.component.Current;
import com.creational.abstractfactory.exercise3.component.Savings;

public class AccountFactory extends AbstractFactory {
    @Override
    public String getAccess(String type) {

        if (type.contains("savings account"))
            return new Savings().accountType();
        else if (type.contains("current account"))
            return new Current().accountType();
        else {
            System.out.println("Not a valid input");
            return null;
        }

    }

    @Override
    public String getCurrency(String type) {
        return null;
    }
}
