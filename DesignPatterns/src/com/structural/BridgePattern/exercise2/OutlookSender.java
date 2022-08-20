package com.structural.BridgePattern.exercise2;

public class OutlookSender implements Sender {
    @Override
    public void sendMessage(String sub, String body) {
        System.out.println("Outlook " + sub +
            " - "
        + body);

    }
}
