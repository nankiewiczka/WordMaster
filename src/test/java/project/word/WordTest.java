package project.word;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {

    @Test
    void shouldPolishWordBeTheSameAsInConstructor() {
        Word word = new Word("aaa", "bbb");
        assertEquals(word.getNativeWord(), "aaa");
    }

    @Test
    void shouldForeignWordBeTheSameAsInConstructor() {
        Word word = new Word("aaa", "bbb");
        assertEquals(word.getForeignWord(), "bbb");
    }

    @Test
    void shouldPolishWordBeEmpty() {
        Word word = new Word("", "bbb");
        assertTrue(word.getNativeWord().isEmpty());
    }

}