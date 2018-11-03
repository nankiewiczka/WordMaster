package project.model;

import project.checker.WordForeignChecker;

public class LearningEntityFromNative extends LearningEntity {
    private LearningUnit learningUnit;
    private LearningList wordLearningList;
    private WordForeignChecker wordForeignChecker;
    private Word word;

    public LearningEntityFromNative(LearningUnit learningUnit) {
        this.learningUnit = learningUnit;
        this.wordLearningList = new LearningList(learningUnit.getWordList().getWordsList());
        wordForeignChecker = new WordForeignChecker();
    }

    @Override
    public boolean checkCorrectness(String input) {
        return wordForeignChecker.checkCorrectness(word, input);
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

    @Override
    public int getWordAmount() {
        return learningUnit.getWordsAmount();
    }

    @Override
    public int getRemainAmount() {
        return wordLearningList.remainsAmount();
    }

    @Override
    public LearningUnit getLearningUnit() {
        return learningUnit;
    }
}
