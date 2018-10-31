package project.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {

    @Test
    void shouldPolishWordBeTheSameAsInConstructor() {
        Word word = new Word("aaa", "bbb");
        assertEquals(word.getPolishWord(), "aaa");
    }

    @Test
    void shouldForeignWordBeTheSameAsInConstructor() {
        Word word = new Word("aaa", "bbb");
        assertEquals(word.getForeignWord(), "bbb");
    }

    @Test
    void shouldPolishWordBeEmpty() {
        Word word = new Word("", "bbb");
        assertTrue(word.getPolishWord().isEmpty());
    }

}