package project.models;

import org.junit.jupiter.api.Test;
import project.checker.WordForeignValidator;
import project.word.Word;

import static org.junit.jupiter.api.Assertions.*;

class WordForeignCheckerTest {

    @Test
    void shouldReturnTrueWhenInputAsForeign() {
        WordForeignValidator wordForeignChecker = new WordForeignValidator();
        assertTrue(wordForeignChecker.validateWord(new Word("aaa", "bbb"), "bbb"));
    }

    @Test
    void shouldReturnFalseWhenInputNotAsForeign() {
        WordForeignValidator wordForeignChecker = new WordForeignValidator();
        assertFalse(wordForeignChecker.validateWord(new Word("aaa", "bbb"), "ccc"));
    }
}