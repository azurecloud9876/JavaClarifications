package com.behavioral.state.exercise2;

public class Context {
    public Istate State;

    public Context(Istate state) {
        State = state;
    }

    public void request() {
        State.Handle(this);

    }
}
