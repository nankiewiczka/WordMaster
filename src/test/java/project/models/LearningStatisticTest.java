package project.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LearningStatisticTest {

    @Test
    void shouldScoreBeZeroWhenNotAddPoint() {
        LearningStatistic learningStatistic = new LearningStatistic(10);
        assertEquals(0, learningStatistic.getScore() );
    }

    @Test
    void shouldScoreBeOneWhenAddOnePoint() {
        LearningStatistic learningStatistic = new LearningStatistic(10);
        learningStatistic.increasePoints();
        assertEquals(1, learningStatistic.getScore() );
    }

    @Test
    void shouldScoreBeOneWhenAddThreePoint() {
        LearningStatistic learningStatistic = new LearningStatistic(10);
        learningStatistic.increasePoints();
        learningStatistic.increasePoints();
        learningStatistic.increasePoints();
        assertEquals(3, learningStatistic.getScore() );
    }

    @Test
    void shouldAvailablePointsBeAsSentInConstructor() {
        LearningStatistic learningStatistic = new LearningStatistic(10);
        learningStatistic.increasePoints();
        assertEquals(10, learningStatistic.getAvailablePoints());
    }
}