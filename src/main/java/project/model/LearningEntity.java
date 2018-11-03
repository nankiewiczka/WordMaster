package project.model;

public abstract class LearningEntity {
    public abstract String getWordForLabel();
    public abstract boolean checkCorrectness(String input);
    public abstract int getWordAmount();
    public abstract int getRemainAmount();
    public abstract LearningUnit getLearningUnit();

}
