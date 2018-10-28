package project.model;

public class LearningRate {
    private final int availablePoints;
    private int score;

    public LearningRate(int availablePoints) {
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
