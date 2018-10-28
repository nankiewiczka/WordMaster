package project.model;

import java.util.List;

public class WordLearningList {
    private List<Word> wordList;
    private int wordIndex;
    private final int wordAmount;

    public WordLearningList(List<Word> wordList) {
        this.wordList = wordList;
        this.wordIndex = wordList.size() -1;
        this.wordAmount = wordList.size();
    }

    public boolean hasNext() {
        return wordIndex > 0;
    }

    public Word getNextWord() {
        Word word = this.wordList.get(wordIndex);
        wordIndex--;
        return word;
    }

    public int getWordAmount() {
        return wordAmount;
    }

}
