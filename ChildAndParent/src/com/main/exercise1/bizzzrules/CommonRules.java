package com.main.exercise1.bizzzrules;

import com.main.exercise1.framework.ListRuleEvaluation;

public class CommonRules extends ListRuleEvaluation {


    public CommonRules() {
        System.out.println("CommonRules class");
        this.ruleID = "CommonRules";
        this.ruleMessage = "CommonRules execution";
        this.ruleOrder = 1;
        this.ruleError = null;
        this.ruleType = "Rejection Rules Execution";
        listRules();
    }

    private void listRules() {
        System.out.println("Building rules for execution");
        this.ruleList.add(new RejectInValidPolicyNumber());
    }
}
