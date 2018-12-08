package project.models;

import project.word.WordList;

public class LearningUnit {
    private WordList wordList;
    private String fileName;

    public LearningUnit(WordList wordList, String fileName) {
        this.wordList = wordList;
        this.fileName = fileName;
    }

    public int getWordNumber() {
        return wordList.getWordNumber();
    }

    public String getFileName() {
        return fileName;
    }

    public WordList getWordList() {
        return this.wordList;
    }
}
