package project.models;

import org.junit.jupiter.api.Test;
import project.checker.WordForeignChecker;
import project.word.Word;

import static org.junit.jupiter.api.Assertions.*;

class WordForeignCheckerTest {

    @Test
    void shouldReturnTrueWhenInputAsForeign() {
        WordForeignChecker wordForeignChecker = new WordForeignChecker();
        assertTrue(wordForeignChecker.checkCorrectness(new Word("aaa", "bbb"), "bbb"));
    }

    @Test
    void shouldReturnFalseWhenInputNotAsForeign() {
        WordForeignChecker wordForeignChecker = new WordForeignChecker();
        assertFalse(wordForeignChecker.checkCorrectness(new Word("aaa", "bbb"), "ccc"));
    }
}