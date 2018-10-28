package project.model;

import java.util.Optional;

public class LearningUnit {
    private WordLearningList wordLearningList;
    private final int wordsAmount;

    public LearningUnit(WordList wordList) {
        this.wordLearningList = new WordLearningList(wordList.getWordsList());
        this.wordsAmount = wordLearningList.getWordAmount();
    }

    public Optional<Word> getNextWord() {
        if(wordLearningList.hasNext())
            return Optional.of(wordLearningList.getNextWord());
        else
            return Optional.empty();
    }

    public int getWordsAmount() {
        return wordsAmount;
    }
}
