package com.main.exercise4;

public class Rule {

    private String ruleName;

    private String ruleid;
    private String ruleDescription;
    private RuleCondition ruleCondition;

    public Rule(String ruleName, String ruleDescription, String ruleid) {
        this.ruleName = ruleName;
        this.ruleDescription = ruleDescription;
        this.ruleid = ruleid;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getRuleDescription() {
        return ruleDescription;
    }

    public void setRuleDescription(String ruleDescription) {
        this.ruleDescription = ruleDescription;
    }

    public RuleCondition getRuleCondition() {
        return ruleCondition;
    }

    public void setRuleCondition(RuleCondition ruleCondition) {
        this.ruleCondition = ruleCondition;
    }

    public String getRuleid() {
        return ruleid;
    }

    public void setRuleid(String ruleid) {
        this.ruleid = ruleid;
    }
}
