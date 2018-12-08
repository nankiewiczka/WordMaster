package project.checker;

import project.word.Word;

public class WordNativeChecker implements WordChecker {

    public boolean checkCorrectness(Word word, String input) {
        return word.getPolishWord().equals(input);
    }
}
