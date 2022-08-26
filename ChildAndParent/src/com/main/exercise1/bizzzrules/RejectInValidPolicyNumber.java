package com.main.exercise1.bizzzrules;

import com.main.exercise1.dto.Claim;
import com.main.exercise1.framework.SingleRuleEvaluation;
import com.main.exercise1.persistant.DecisionStorage;

public class RejectInValidPolicyNumber extends SingleRuleEvaluation {

    public RejectInValidPolicyNumber() {
        System.out.println("RejectInValidPolicyNumber class");
        this.ruleID = this.getClass().getName();
        this.ruleMessage = "InvalidPolicyNumber";
        this.ruleError = null;
        this.ruleOrder = 1;
        this.ruleType = "Rejection";
    }

    @Override
    public void evaluateCondition(Claim claim, DecisionStorage decision) {
        System.out.println("I'm in RejectInValidPolicyNumber");
        if (claim.getPolicyNumber().length() > 5) {
            this.errorMessage(decision);
        }
    }
}
