package project.model;

public class LearningUnit {
    private WordList wordList;
    private String fileName;

    public LearningUnit(WordList wordList, String fileName) {
        this.wordList = wordList;
        this.fileName = fileName;
    }

    public WordList getWordList() {
        return wordList;
    }

    public int getWordsAmount() {
        return wordList.getAmount();
    }

    public String getFileName() {
        return fileName;
    }
}
