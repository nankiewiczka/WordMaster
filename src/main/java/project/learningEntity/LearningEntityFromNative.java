package project.learningEntity;

import project.wordValidator.WordForeignValidator;
import project.models.LearningUnit;

public class LearningEntityFromNative extends LearningEntity {

    public LearningEntityFromNative(LearningUnit learningUnit) {
        super(learningUnit);
        wordValidator = new WordForeignValidator();
    }

    @Override
    public String getWordForLabel() {
        if(learningList.isNextWord()) {
            word = learningList.getNextWord();
            return word.getNativeWord();
        }
        else
            return null;
    }
}
