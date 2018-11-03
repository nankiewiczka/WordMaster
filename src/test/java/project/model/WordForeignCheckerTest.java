package project.model;

import org.junit.jupiter.api.Test;
import project.checking.WordForeignChecker;

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