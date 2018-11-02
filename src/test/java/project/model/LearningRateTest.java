package project.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LearningRateTest {

    @Test
    void shouldScoreBeZeroWhenNotAddPoint() {
        LearningRate learningRate = new LearningRate(10);
        assertEquals(0, learningRate.getScore() );
    }

    @Test
    void shouldScoreBeOneWhenAddOnePoint() {
        LearningRate learningRate = new LearningRate(10);
        learningRate.increasePoints();
        assertEquals(1, learningRate.getScore() );
    }

    @Test
    void shouldScoreBeOneWhenAddThreePoint() {
        LearningRate learningRate = new LearningRate(10);
        learningRate.increasePoints();
        learningRate.increasePoints();
        learningRate.increasePoints();
        assertEquals(3, learningRate.getScore() );
    }

    @Test
    void shouldAvailablePointsBeAsSentInConstructor() {
        LearningRate learningRate = new LearningRate(10);
        learningRate.increasePoints();
        assertEquals(10, learningRate.getAvailablePoints());
    }
}