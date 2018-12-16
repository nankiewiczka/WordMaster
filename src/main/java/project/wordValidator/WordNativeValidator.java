package project.wordValidator;

import project.word.Word;

public class WordNativeValidator implements WordValidator {

    public boolean validateWord(Word correctWord, String inputWord) {
        return correctWord.getNativeWord().equals(inputWord);
    }
}
