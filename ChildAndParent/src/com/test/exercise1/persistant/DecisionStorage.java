package com.test.exercise1.persistant;

import java.util.ArrayList;
import java.util.List;

public class DecisionStorage {

    private final List<Outcome> outcomeReasons;
    public boolean outcome;

    public DecisionStorage() {
        outcomeReasons = new ArrayList<>();
    }

    public List<Outcome> getOutcomeReasons() {
        return outcomeReasons;
    }

    public void setOutcomeReasons(Outcome outcomeReason) {
        outcomeReasons.add(outcomeReason);
    }
}
