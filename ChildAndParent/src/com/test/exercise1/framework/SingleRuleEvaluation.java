package com.test.exercise1.framework;

import com.test.exercise1.persistant.DecisionStorage;
import com.test.exercise1.persistant.Outcome;

public abstract class SingleRuleEvaluation implements FRule {

    public String ruleID;
    public String ruleMessage;

    public String ruleType;

    public String ruleError;

    public int ruleOrder;

    public SingleRuleEvaluation() {
        System.out.println("This is SingleRuleEvaluation constructor");
    }


  /*  @Override
    public void evaluateCondition(Claim claim, DecisionStorage decision) {
        System.out.println("This is SingleRuleEvaluation - evaluateCondition");
        var outcome = new Outcome(this.ruleID,"Rule evaluation failed");
        //return decision.outcome;
    }*/

    public void errorMessage(DecisionStorage decision) {
        decision.outcome = false;
        var outcome = new Outcome(this.ruleID, this.ruleMessage);
        decision.setOutcomeReasons(outcome);
    }

}
