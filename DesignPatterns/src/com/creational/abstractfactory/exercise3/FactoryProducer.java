package com.creational.abstractfactory.exercise3;

import com.creational.abstractfactory.exercise3.factory.AccountFactory;
import com.creational.abstractfactory.exercise3.factory.CurrencyFactory;

public class FactoryProducer {


    public static String getFactoryInstance(String details) {


        if (details.contains("account"))
            return new AccountFactory().getAccess(details);
        else if (details.contains("withdraw"))
            return new CurrencyFactory().getCurrency(details);
        else {
            System.out.println("Not a valid input");
            return null;
        }


    }


}
