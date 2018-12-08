package project.learningEntity;

import project.checker.WordForeignChecker;
import project.models.LearningUnit;

public class LearningEntityFromNative extends LearningEntity {

    public LearningEntityFromNative(LearningUnit learningUnit) {
        super(learningUnit);
        wordChecker = new WordForeignChecker();
    }

    @Override
    public String getWordForLabel() {
        if(learningList.isNextWord()) {
            word = learningList.getNextWord();
            return word.getPolishWord();
        }
        else
            return null;
    }
}
