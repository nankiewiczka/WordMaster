package project.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataCSVLineValidatorTest {

    @Test
    void shouldReturnTrueWhenOneComma() {
        DataCSVLineValidator validator = new DataCSVLineValidator();
        assertTrue(validator.validLine("a,bc"));
    }

    @Test
    void shouldReturnFalseWhenMoreThanOneComma() {
        DataCSVLineValidator validator = new DataCSVLineValidator();
        assertFalse(validator.validLine("a,b,c"));
    }

    @Test
    void shouldReturnFalseWhenZeroComma() {
        DataCSVLineValidator validator = new DataCSVLineValidator();
        assertFalse(validator.validLine("abc"));
    }

    @Test
    void shouldReturnFalseWhenOneCommaAndAnyWords() {
        DataCSVLineValidator validator = new DataCSVLineValidator();
        assertFalse(validator.validLine(","));
    }

    @Test
    void shouldReturnFalseWhenEmptyLine() {
        DataCSVLineValidator validator = new DataCSVLineValidator();
        assertFalse(validator.validLine(""));
    }

}