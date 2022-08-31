package com.main.exercise4;

public class RuleConditionLine {

    private RuleCondition ruleCondition;

    private String RuleConditionLineid;
    private boolean left;
    private boolean right;
    private ExpressionFragment leftExpressionFragment;
    private ExpressionFragment rightExpressionFragment;

    public RuleConditionLine() {
    }

    public RuleCondition getRuleCondition() {
        return ruleCondition;
    }

    public void setRuleCondition(RuleCondition ruleCondition) {
        this.ruleCondition = ruleCondition;
    }

    public boolean isLeft() {
        return left;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public boolean isRight() {
        return right;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public ExpressionFragment getLeftExpressionFragment() {
        return leftExpressionFragment;
    }

    public void setLeftExpressionFragment(ExpressionFragment leftExpressionFragment) {
        this.leftExpressionFragment = leftExpressionFragment;
    }

    public ExpressionFragment getRightExpressionFragment() {
        return rightExpressionFragment;
    }

    public void setRightExpressionFragment(ExpressionFragment rightExpressionFragment) {
        this.rightExpressionFragment = rightExpressionFragment;
    }

    public String getRuleConditionLineid() {
        return RuleConditionLineid;
    }

    public void setRuleConditionLineid(String ruleConditionLineid) {
        RuleConditionLineid = ruleConditionLineid;
    }
}
