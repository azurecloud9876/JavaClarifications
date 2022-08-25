package com.test.exercise1.persistant;

public class Outcome {

    private final String ruleID;
    private String reason;

    public Outcome(String ruleID, String reason) {
        this.ruleID = ruleID;
        this.reason = reason;
    }

    public String getRuleID() {
        return ruleID;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
