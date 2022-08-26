package com.main.exercise1.framework;

import com.main.exercise1.dto.Claim;
import com.main.exercise1.persistant.DecisionStorage;

public interface FRule {
    /*String ruleID();
    String ruleMessage();
    String ruleType();
    String ruleError();

    public int ruleOrder();*/
    void evaluateCondition(Claim claim, DecisionStorage decision);
}
