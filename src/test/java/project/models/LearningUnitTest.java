package project.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LearningUnitTest {
    @Test
    public void shouldReturnFileName() {
        LearningUnit learningUnit = new LearningUnit(null, "simpleName");
        assertEquals("simpleName", learningUnit.getFileName());
    }

}