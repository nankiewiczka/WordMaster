package project.checker;

import project.model.Word;

public class WordForeignChecker implements WordChecker {

    public boolean checkCorrectness(Word word, String input) {
        return word.getForeignWord().equals(input);
    }
}
