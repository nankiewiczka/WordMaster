package project.models;

import org.junit.jupiter.api.Test;
import project.checker.WordNativeValidator;
import project.word.Word;

import static org.junit.jupiter.api.Assertions.*;

class WordNativeCheckerTest {
    @Test
    void shouldReturnTrueWhenInputAsNative() {
        WordNativeValidator wordNativeChecker = new WordNativeValidator();
        assertTrue(wordNativeChecker.validateWord(new Word("aaa", "bbb"), "aaa"));
    }

    @Test
    void shouldReturnFalseWhenInputNotAsNative() {
        WordNativeValidator wordNativeChecker = new WordNativeValidator();
        assertFalse(wordNativeChecker.validateWord(new Word("aaa", "bbb"), "ccc"));
    }

}