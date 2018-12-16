package project.wordValidator;

import project.word.Word;

public interface WordValidator {
    boolean validateWord(Word correctWord, String inputWord);
}
