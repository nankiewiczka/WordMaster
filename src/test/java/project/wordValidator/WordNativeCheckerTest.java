package project.wordValidator;

import org.junit.jupiter.api.Test;
import project.word.Word;

import static org.junit.jupiter.api.Assertions.*;

class WordNativeCheckerTest {
    @Test
    void shouldReturnTrueWhenInputAsNative() {
        WordNativeValidator wordNativeValidator = new WordNativeValidator();
        assertTrue(wordNativeValidator.validateWord(new Word("aaa", "bbb"), "aaa"));
    }

    @Test
    void shouldReturnFalseWhenInputNotAsNative() {
        WordNativeValidator wordNativeValidator = new WordNativeValidator();
        assertFalse(wordNativeValidator.validateWord(new Word("aaa", "bbb"), "ccc"));
    }

}