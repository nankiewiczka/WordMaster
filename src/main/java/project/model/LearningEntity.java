package project.model;

public abstract class LearningEntity {
    public abstract String getWordForLabel();
    public abstract boolean checkCorrectness(String input);
    public abstract int getWordAmount();

}
