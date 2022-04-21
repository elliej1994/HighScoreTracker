package dev.johnson.models;

public class Score {
    private String initials;
    private int points;

    public Score(){}
    public Score(String initials, int points) {
        this.initials = initials;
        this.points = points;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Score{" +
                "initials='" + initials + '\'' +
                ", points=" + points +
                '}';
    }
}
