package com.behavioral.state.exercise3.state;

import com.behavioral.state.exercise3.Phone;

public abstract class State {

    protected Phone phone;

    public State(Phone phone) {
        this.phone = phone;
    }

    public abstract String onSate();

    public abstract String offState();
}
