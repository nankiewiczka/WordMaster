package project.model;

import java.util.List;

public class LearningList {
    private List<Word> wordList;
    private int wordIndex;

    public LearningList(List<Word> wordList) {
        this.wordList = wordList;
        this.wordIndex = wordList.size() -1;
    }

    public Word getNextWord() {
        Word word = this.wordList.get(wordIndex);
        wordIndex--;
        return word;
    }

    public int remainsAmount() {
        return wordIndex + 1;
    }

}
