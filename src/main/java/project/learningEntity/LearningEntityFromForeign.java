package project.learningEntity;

import project.checker.WordNativeChecker;
import project.models.LearningUnit;

public class LearningEntityFromForeign extends LearningEntity {

    public LearningEntityFromForeign(LearningUnit learningUnit) {
        super(learningUnit);
        wordChecker = new WordNativeChecker();
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
