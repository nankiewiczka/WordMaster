package project.learningEntity;

import project.checker.WordForeignChecker;
import project.models.LearningList;
import project.models.LearningUnit;

public class LearningEntityFromNative extends LearningEntity {

    public LearningEntityFromNative(LearningUnit learningUnit) {
        this.learningUnit = learningUnit;
        this.learningList = new LearningList(learningUnit.getWordList());
        this.learningList.shuffleLearningList();
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
