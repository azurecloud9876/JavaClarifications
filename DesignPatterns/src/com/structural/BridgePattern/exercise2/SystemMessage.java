package com.structural.BridgePattern.exercise2;

public class SystemMessage extends Message {
    @Override
    public void send() {
        sender.sendMessage(subject,body);

    }
}
