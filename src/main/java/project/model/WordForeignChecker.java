package project.model;

public class WordForeignChecker implements WordChecker {

    public boolean checkCorrectness(Word word, String input) {
        return word.getPolishWord().equals(input);
    }
}
