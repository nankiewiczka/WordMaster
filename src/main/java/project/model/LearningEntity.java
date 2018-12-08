package project.model;

import project.checker.WordChecker;

public abstract class LearningEntity {
    protected LearningUnit learningUnit;
    protected LearningList learningList;
    protected WordChecker wordChecker;
    protected Word word;
    public abstract String getWordForLabel();
    public boolean checkCorrectness(String input) {
        return wordChecker.checkCorrectness(word, input);
    }
    public int getWordAmount() {
        return learningUnit.getWordsAmount();
    }
    public int getRemainAmount() {
        return learningList.remainsAmount();
    }
    public LearningUnit getLearningUnit() {
        return learningUnit;
    }



}
