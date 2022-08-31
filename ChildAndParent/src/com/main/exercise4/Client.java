package com.main.exercise4;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Rule rule = new Rule("Test1", "My First rule", "Rule:01");
        RuleCondition ruleCondition1 = new RuleCondition();
        rule.setRuleCondition(ruleCondition1);
        ruleCondition1.setRuleConditionID("RuleCond:01");
        RuleConditionLine ruleConditionLine1 = new RuleConditionLine();
        ruleConditionLine1.setRuleConditionLineid("RuleCondLine:01");
        ruleConditionLine1.setRuleCondition(ruleCondition1);
        ruleConditionLine1.setLeft(true);
        ExpressionFragment leftExpressionFrag1 = new ExpressionFragment();
        leftExpressionFrag1.setExpressionFragID("ExprFrag:01");
        leftExpressionFrag1.setFragmentRuleCondition(null);
        leftExpressionFrag1.setFragmentType(ExpressionFragment.CONDITION_TYPE_1);
        ruleConditionLine1.setLeftExpressionFragment(leftExpressionFrag1);
        ruleConditionLine1.setRight(true);
        ruleConditionLine1.setRightExpressionFragment(null);

        List<RuleConditionLine> condition1 = new ArrayList<>(); //RuleCond:01
        condition1.add(ruleConditionLine1);
        ruleCondition1.setRuleConditionLines(condition1);

        //Rule condition 2 exists when right fragment is type 2
        RuleCondition ruleCondition2 = new RuleCondition();
        ruleCondition2.setRuleConditionID("RuleCond:02");

        RuleConditionLine ruleConditionLine2 = new RuleConditionLine();
        ruleConditionLine2.setRuleConditionLineid("RuleCondLine:02");
        ruleConditionLine2.setRuleCondition(ruleCondition1);
        ruleConditionLine2.setLeft(true);
        ExpressionFragment leftExpressionFrag2 = new ExpressionFragment();
        leftExpressionFrag2.setExpressionFragID("ExprFrag:02");
        ExpressionFragment rightExpressionFrag3 = new ExpressionFragment();
        rightExpressionFrag3.setExpressionFragID("ExprFrag:02");
        rightExpressionFrag3.setFragmentType(ExpressionFragment.CONDITION_TYPE_2);
        rightExpressionFrag3.setFragmentRuleCondition(ruleCondition2);

        ruleConditionLine2.setLeftExpressionFragment(leftExpressionFrag2);
        ruleConditionLine2.setRight(true);
        ruleConditionLine2.setRightExpressionFragment(rightExpressionFrag3);

        List<RuleConditionLine> condition2 = new ArrayList<>(); //RuleCond:01
        condition2.add(ruleConditionLine2);
        ruleCondition2.setRuleConditionLines(condition2);
        System.out.println(condition2);


    }
}
