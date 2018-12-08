package project.models;

import project.word.Word;
import project.word.WordList;

public class LearningList {
    private WordList wordList;
    private int index;

    public LearningList(WordList wordList) {
        this.wordList = wordList;
        this.index = wordList.getWordNumber();
    }

    public Word getNextWord() {
        index--;
        return wordList.getWord(index);
    }

    public int getRemainWordNumber() {
        return wordList.getWordNumber() - index;
    }

    public void shuffleLearningList() {
        this.wordList.shuffleWordList();
    }

    public boolean isNextWord() {
        return index >= 1;
    }


}
