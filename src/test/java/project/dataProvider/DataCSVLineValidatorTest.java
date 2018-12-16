package project.dataProvider;

import org.junit.jupiter.api.Test;
import project.dataValidator.DataCSVLineValidator;

import static org.junit.jupiter.api.Assertions.*;

class DataCSVLineValidatorTest {

    @Test
    void shouldReturnTrueWhenOneComma() {
        DataCSVLineValidator validator = new DataCSVLineValidator();
        assertTrue(validator.isDataValid("a,bc"));
    }

    @Test
    void shouldReturnFalseWhenMoreThanOneComma() {
        DataCSVLineValidator validator = new DataCSVLineValidator();
        assertFalse(validator.isDataValid("a,b,c"));
    }

    @Test
    void shouldReturnFalseWhenZeroComma() {
        DataCSVLineValidator validator = new DataCSVLineValidator();
        assertFalse(validator.isDataValid("abc"));
    }

    @Test
    void shouldReturnFalseWhenOneCommaAndAnyWords() {
        DataCSVLineValidator validator = new DataCSVLineValidator();
        assertFalse(validator.isDataValid(","));
    }

    @Test
    void shouldReturnFalseWhenEmptyLine() {
        DataCSVLineValidator validator = new DataCSVLineValidator();
        assertFalse(validator.isDataValid(""));
    }

}