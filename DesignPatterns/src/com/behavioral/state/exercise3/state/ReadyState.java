package com.behavioral.state.exercise3.state;

import com.behavioral.state.exercise3.Phone;

public class ReadyState extends State {


    public ReadyState(Phone phone) {
        super(phone);
    }

    @Override
    public String onSate() {
        return phone.home();
    }

    @Override
    public String offState() {
        phone.setState(new OffState(phone));
        return phone.lock();
    }
}
