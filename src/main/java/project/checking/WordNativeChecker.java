package project.checking;

import project.model.Word;

public class WordNativeChecker implements WordChecker {

    public boolean checkCorrectness(Word word, String input) {
        return word.getPolishWord().equals(input);
    }
}
