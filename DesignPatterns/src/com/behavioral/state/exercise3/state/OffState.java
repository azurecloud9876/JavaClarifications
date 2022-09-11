package com.behavioral.state.exercise3.state;

import com.behavioral.state.exercise3.Phone;

public class OffState extends State {


    public OffState(Phone phone) {
        super(phone);
    }

    @Override
    public String onSate() {
        phone.setState(new LockedState(phone));
        return phone.turnOn();
    }

    @Override
    public String offState() {
        phone.setState(new LockedState(phone));
        return phone.turnOn();
    }
}
