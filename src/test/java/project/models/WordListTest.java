package project.models;

import org.junit.jupiter.api.Test;
import project.word.Word;
import project.word.WordList;

import static org.junit.jupiter.api.Assertions.*;

class WordListTest {

    @Test
    void shouldReturnNotEmptyListWhenAddWord() {
        WordList wordList = new WordList();
        Word word = new Word("a", "b");
        wordList.addWord(word);
        assertFalse(wordList.getWordsList().isEmpty());
    }

    @Test
    void shouldContainWordWhenAddWord() {
        WordList wordList = new WordList();
        Word word = new Word("a", "b");
        wordList.addWord(word);
        assertTrue(wordList.getWordsList().contains(word));
    }

    @Test
    void shouldReturnZeroSizeWhenNotAddAnyWord() {
        WordList wordList = new WordList();
        assertEquals(0, wordList.getAmount());
    }

    @Test
    void shouldReturnOneSizeWhenNotAddAnyWord() {
        WordList wordList = new WordList();
        Word word = new Word("a", "b");
        wordList.addWord(word);
        assertEquals(1, wordList.getAmount());
    }

}