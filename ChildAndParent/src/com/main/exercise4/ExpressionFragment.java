package com.main.exercise4;

public class ExpressionFragment {

    public static final String CONDITION_TYPE_1 = "CONDITION_TYPE_1";
    public static final String CONDITION_TYPE_2 = "CONDITION_TYPE_2";
    private RuleCondition fragmentRuleCondition;
    private String expressionFragID;
    private String fragmentType;

    public ExpressionFragment() {
    }

    public RuleCondition getFragmentRuleCondition() {
        return fragmentRuleCondition;
    }

    public void setFragmentRuleCondition(RuleCondition fragmentRuleCondition) {
        this.fragmentRuleCondition = fragmentRuleCondition;
    }

    public String getFragmentType() {
        return fragmentType;
    }

    public void setFragmentType(String fragmentType) {
        this.fragmentType = fragmentType;
    }

    public String getExpressionFragID() {
        return expressionFragID;
    }

    public void setExpressionFragID(String expressionFragID) {
        this.expressionFragID = expressionFragID;
    }
}
