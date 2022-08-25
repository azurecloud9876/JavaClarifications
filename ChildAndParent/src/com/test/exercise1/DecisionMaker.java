package com.test.exercise1;

import com.test.exercise1.bizzzrules.CommonRules;
import com.test.exercise1.dto.Claim;
import com.test.exercise1.framework.ListRuleEvaluation;
import com.test.exercise1.persistant.DecisionStorage;

/*
 * Making a class that helps to find the outcome, this could apply to different purposes,however below example
 * will decide that the client has valid insurance and therefore claim is processed without rejection.
 * */
public class DecisionMaker {


    public static void main(String[] args) {
        //Given
        Claim claim = new Claim();
        claim.setPolicyNumber("4646546465445");
        DecisionStorage decision = new DecisionStorage();
        //When
        ListRuleEvaluation commRule = new CommonRules();
        commRule.evaluateCondition(claim, decision);
        //Then
        System.out.println("decision..." + decision.outcome);
        decision.getOutcomeReasons().stream().forEach(outcome -> {
            System.out.println(outcome.getRuleID());
            System.out.println(outcome.getReason());
        });

    }
}
