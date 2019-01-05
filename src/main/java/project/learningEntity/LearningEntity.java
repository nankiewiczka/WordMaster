package project.learningEntity;

import project.wordValidator.WordValidator;
import project.models.LearningList;
import project.models.LearningUnit;
import project.word.Word;

public abstract class LearningEntity {
    protected LearningUnit learningUnit;
    protected LearningList learningList;
    protected WordValidator wordValidator;
    protected Word word;

    protected LearningEntity(LearningUnit learningUnit) {
        this.learningUnit = learningUnit;
        this.learningList = new LearningList(learningUnit.getWordList());
        this.learningList.shuffleLearningList();
    }

    public abstract String getWordForLabel();

    public boolean isUserInputValid(String input) {
        return wordValidator.validateWord(word, input);
    }

    public int getAllWordsNumber() {
        return learningUnit.getWordNumber();
    }

    public int getRemainWordsNumber() {
        return learningList.getRemainWordNumber();
    }

    public LearningUnit getLearningUnit() {
        return learningUnit;
    }
}
