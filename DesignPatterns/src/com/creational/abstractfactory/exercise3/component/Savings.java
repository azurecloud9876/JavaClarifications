package com.creational.abstractfactory.exercise3.component;

import com.creational.abstractfactory.exercise3.Account;

public class Savings implements Account {

    @Override
    public String accountType() {
        return "Access to your savings account is success";
    }
}
