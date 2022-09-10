package com.behavioral.visitor.exercise1;

public class PerformanceRating {

    private final int id;

    private final int personalRating;

    private int teamAverageRating;

    private int finalRating;

    public PerformanceRating(int id, int personalRating) {
        this.id = id;
        this.personalRating = personalRating;
    }

    public int getId() {
        return id;
    }

    public int getPersonalRating() {
        return personalRating;
    }

    public int getTeamAverageRating() {
        return teamAverageRating;
    }

    public void setTeamAverageRating(int teamAverageRating) {
        this.teamAverageRating = teamAverageRating;
    }

    public int getFinalRating() {
        return finalRating;
    }

    public void setFinalRating(int finalRating) {
        this.finalRating = finalRating;
    }


}
