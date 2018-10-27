package main.java.model;

import java.util.List;
import java.util.ArrayList;

public class WordList {
    private List<Word> wordsList;

    public WordList() {
        this.wordsList = new ArrayList<>();
    }

    public void addWord(Word word) {
        wordsList.add(word);
    }

    public List<Word> getWordsList() {
        return wordsList;
    }
}
