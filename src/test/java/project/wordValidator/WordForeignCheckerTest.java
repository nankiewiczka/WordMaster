package project.wordValidator;

import org.junit.jupiter.api.Test;
import project.word.Word;

import static org.junit.jupiter.api.Assertions.*;

class WordForeignCheckerTest {

    @Test
    void shouldReturnTrueWhenInputAsForeign() {
        WordForeignValidator wordForeignValidator = new WordForeignValidator();
        assertTrue(wordForeignValidator.validateWord(new Word("aaa", "bbb"), "bbb"));
    }

    @Test
    void shouldReturnFalseWhenInputNotAsForeign() {
        WordForeignValidator wordForeignChecker = new WordForeignValidator();
        assertFalse(wordForeignChecker.validateWord(new Word("aaa", "bbb"), "ccc"));
    }
}