package project.models;

import org.junit.jupiter.api.Test;
import project.checker.WordNativeChecker;
import project.word.Word;

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