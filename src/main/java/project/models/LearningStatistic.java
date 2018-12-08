package project.models;

public class LearningStatistic {
    private final int availablePoints;
    private int score;

    public LearningStatistic(int availablePoints) {
        this.availablePoints = availablePoints;
        this.score = 0;
    }

    public void increasePoints() {
        this.score++;
    }

    public int getAvailablePoints() {
        return availablePoints;
    }

    public int getScore() {
        return score;
    }
}
