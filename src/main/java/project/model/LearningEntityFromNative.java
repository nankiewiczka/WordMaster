package project.model;

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
        word = learningUnit.getNextWord().get();
        return word.getPolishWord();
    }

    @Override
    public boolean checkCorrectness(String input) {
        return wordForeignChecker.checkCorrectness(word, input);
    }

    @Override
    public int getWordAmount() {
        return learningUnit.getWordsAmount();
    }
}
