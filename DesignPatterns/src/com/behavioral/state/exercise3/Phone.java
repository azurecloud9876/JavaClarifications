package com.behavioral.state.exercise3;

import com.behavioral.state.exercise3.state.OffState;
import com.behavioral.state.exercise3.state.State;

public class Phone {

    private State state;

    public Phone() {
        state = new OffState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public String lock() {
        return "Locking phone and turning off the screen";
    }

    public String home() {
        return "Going to home-screen";
    }

    public String unlock() {
        return "Unlocking the phone to home";
    }

    public String turnOn() {
        return "Turning screen on, device still locked";
    }

    public String clickHome() {
        return state.onSate();
    }

    public String clickPower() {
        return state.offState();
    }
}
