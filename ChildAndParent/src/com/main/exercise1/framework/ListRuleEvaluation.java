package com.main.exercise1.framework;

import com.main.exercise1.dto.Claim;
import com.main.exercise1.persistant.DecisionStorage;

import java.util.ArrayList;
import java.util.List;

public abstract class ListRuleEvaluation extends SingleRuleEvaluation {

    public List<FRule> ruleList = new ArrayList<>();

    public ListRuleEvaluation() {
        System.out.println("Common rules instantiated, but i'm ListRuleEvaluation");
    }

    public void addRule(FRule rule) {
        ruleList.add(rule);
    }

    //you can order the list by rules based on rule order, enhance with lambdas
    public List<FRule> sortRuleExecution() {
        return ruleList.stream().toList();
    }

    @Override
    public void evaluateCondition(Claim claim, DecisionStorage decision) {
        System.out.println("This is ListRuleEvaluation - evaluateCondition");
        for (FRule fRule : ruleList) {
            fRule.evaluateCondition(claim, decision);
        }
    }
}
