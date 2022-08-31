package com.main.exercise4;

import java.util.List;

public class RuleCondition {


    private String ruleConditionID;
    private ExpressionFragment[] conditionExpression;

    private List<RuleConditionLine> ruleConditionLines;


    public RuleCondition() {

    }


    public ExpressionFragment[] getConditionExpression() {
        return conditionExpression;
    }

    public void setConditionExpression(ExpressionFragment[] conditionExpression) {
        this.conditionExpression = conditionExpression;
    }

    public List<RuleConditionLine> getRuleConditionLines() {
        return ruleConditionLines;
    }

    public void setRuleConditionLines(List<RuleConditionLine> ruleConditionLines) {
        this.ruleConditionLines = ruleConditionLines;
    }

    public String getRuleConditionID() {
        return ruleConditionID;
    }

    public void setRuleConditionID(String ruleConditionID) {
        this.ruleConditionID = ruleConditionID;
    }
}
