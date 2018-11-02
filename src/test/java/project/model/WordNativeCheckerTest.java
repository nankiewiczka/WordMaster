package project.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordNativeCheckerTest {
    @Test
    void shouldReturnTrueWhenInputAsNative() {
        WordNativeChecker wordNativeChecker = new WordNativeChecker();
        assertTrue(wordNativeChecker.checkCorrectness(new Word("aaa", "bbb"), "aaa"));
    }

    @Test
    void shouldReturnFalseWhenInputNotAsNative() {
        WordNativeChecker wordNativeChecker = new WordNativeChecker();
        assertFalse(wordNativeChecker.checkCorrectness(new Word("aaa", "bbb"), "ccc"));
    }

}