package project.model;

import java.util.Optional;

public class LearningEntityFromNative extends LearningEntity {
    private LearningUnit learningUnit;
    private WordForeignChecker wordForeignChecker;
    private Word word;

    public LearningEntityFromNative(LearningUnit learningUnit) {
        this.learningUnit = learningUnit;
        wordForeignChecker = new WordForeignChecker();
    }

    @Override
    public String getWordForLabel() {
        Optional<Word> optionalWord = learningUnit.getNextWord();
        if(optionalWord.isPresent()) {
            word = optionalWord.get();
            return word.getPolishWord();
        }
        else return null;

    }

    @Override
    public boolean checkCorrectness(String input) {
        return wordForeignChecker.checkCorrectness(word, input);
    }

    @Override
    public int getWordAmount() {
        return learningUnit.getWordsAmount();
    }

    @Override
    public int getRemainAmount() {
        return learningUnit.getRemainsAmount();
    }
}
