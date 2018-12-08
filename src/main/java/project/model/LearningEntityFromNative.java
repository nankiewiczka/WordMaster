package project.model;

import project.checker.WordForeignChecker;

public class LearningEntityFromNative extends LearningEntity {

    public LearningEntityFromNative(LearningUnit learningUnit) {
        this.learningUnit = learningUnit;
        this.wordLearningList = new LearningList(learningUnit.getWordList().getWordsList());
        wordChecker = new WordForeignChecker();
    }

    @Override
    public String getWordForLabel() {
        Word optionalWord = wordLearningList.getNextWord();
        if(optionalWord != null) {
            word = optionalWord;
            return word.getPolishWord();
        }
        else return null;
    }
}
