package com.behavioral.state.exercise3.state;

import com.behavioral.state.exercise3.Phone;

public class LockedState extends State {


    public LockedState(Phone phone) {
        super(phone);
    }

    @Override
    public String onSate() {
        phone.setState(new ReadyState(phone));
        return phone.unlock();
    }

    @Override
    public String offState() {
        phone.setState(new OffState(phone));
        return phone.lock();
    }
}
