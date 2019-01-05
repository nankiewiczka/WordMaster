package project.models;

public class LearningStatistic {
    private final int AVAILABLE_POINTS;
    private int score;

    public LearningStatistic(int availablePoints) {
        this.AVAILABLE_POINTS = availablePoints;
        this.score = 0;
    }

    public void increasePoints() {
        this.score++;
    }

    public int getAvailablePoints() {
        return AVAILABLE_POINTS;
    }

    public int getScore() {
        return score;
    }
}
