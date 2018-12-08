package project.model;

import java.util.Collection;
import java.util.Collections;
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

    public Word getWord(int index) {
        return this.wordsList.get(index);
    }


    public List<Word> getWordsList() {
        return wordsList;
    }

    public int getAmount() {
        return this.wordsList.size();
    }

    public void shuffleWordList() {
        Collections.shuffle(this.wordsList);
    }

//    public WordList cloneWordList() {
//        WordList wordListToReturn = new WordList();
//        for(Word w: wordsList) {
//            wordListToReturn.addWord(w);
//        }
//        return wordListToReturn;
//    }

}
