package project.checker;

import project.word.Word;

public class WordForeignValidator implements WordValidator {

    public boolean validateWord(Word correctWord, String inputWord) {
        return correctWord.getForeignWord().equals(inputWord);
    }
}
