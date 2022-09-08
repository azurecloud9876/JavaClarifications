package com.creational.abstractfactory.exercise3.component;

import com.creational.abstractfactory.exercise3.Account;

public class Current implements Account {
    @Override
    public String accountType() {
        return "Access to your Current account is success";
    }
}
