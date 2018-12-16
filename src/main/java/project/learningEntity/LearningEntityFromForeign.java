package project.learningEntity;

import project.wordValidator.WordNativeValidator;
import project.models.LearningUnit;

public class LearningEntityFromForeign extends LearningEntity {

    public LearningEntityFromForeign(LearningUnit learningUnit) {
        super(learningUnit);
        wordValidator = new WordNativeValidator();
    }

    @Override
    public String getWordForLabel() {
        if(learningList.isNextWord()) {
            word = learningList.getNextWord();
            return word.getForeignWord();
        }
        else
            return null;
    }
}
