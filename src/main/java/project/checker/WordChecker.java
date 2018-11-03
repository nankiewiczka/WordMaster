package project.checker;

import project.model.Word;

public interface WordChecker {
    boolean checkCorrectness(Word word, String input);
}
