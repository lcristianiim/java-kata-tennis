package com.kata.tennis;

import org.junit.jupiter.api.Test;

import static com.kata.tennis.ScoreEvaluator.WINNING_SCORE;
import static org.junit.jupiter.api.Assertions.*;

class ScoreEvaluatorTest {

    @Test
    void givenDeuceConditions_ShouldReturnDeuceAndSetDeucedToTrue() {
        ScoreEvaluator evaluator = new ScoreEvaluator();
        GameStatus expected = GameStatus.DEUCE;
        GameStatus result = evaluator.evaluateScore(WINNING_SCORE, WINNING_SCORE);

        assertEquals(expected, result);
        assertTrue(evaluator.isDeuced);
    }

    @Test
    void givenPlayerOneWinScoreWithoutDeuce_ShouldReturnGameWon() {
        ScoreEvaluator evaluator = new ScoreEvaluator();
        GameStatus expected = GameStatus.GAME_WON;
        GameStatus result = evaluator.evaluateScore(WINNING_SCORE, 30);

        assertEquals(expected, result);
    }

    @Test
    void givenPlayerOneWithHigherWinScoreWithoutDeuce_ShouldReturnGameWon() {
        ScoreEvaluator evaluator = new ScoreEvaluator();
        GameStatus expected = GameStatus.GAME_WON;
        GameStatus result = evaluator.evaluateScore(WINNING_SCORE + 1, 30);

        assertEquals(expected, result);
    }

    @Test
    void givenPlayerTwoWinScoreWithoutDeuce_ShouldReturnGameWon() {
        ScoreEvaluator evaluator = new ScoreEvaluator();
        GameStatus expected = GameStatus.GAME_WON;
        GameStatus result = evaluator.evaluateScore(30, WINNING_SCORE);

        assertEquals(expected, result);
    }

    @Test
    void givenPlayerTwoWithHigherWinScoreWithoutDeuce_ShouldReturnGameWon() {
        ScoreEvaluator evaluator = new ScoreEvaluator();
        GameStatus expected = GameStatus.GAME_WON;
        GameStatus result = evaluator.evaluateScore(30, WINNING_SCORE + 1);

        assertEquals(expected, result);
    }

    @Test
    void givenDeucedAndEquality_ShouldReturnNoWinner() {
        ScoreEvaluator evaluator = new ScoreEvaluator();
        GameStatus expected = GameStatus.NO_WINNER;
        evaluator.evaluateScore(WINNING_SCORE, WINNING_SCORE);

        GameStatus result = evaluator.evaluateScore(55, 55);

        assertEquals(expected, result);
    }

    @Test
    void givenPlayerOneWinnerAfterDeuce_ShouldReturnGameWon() {
        ScoreEvaluator evaluator = new ScoreEvaluator();
        GameStatus expected = GameStatus.GAME_WON;

        makeItDeuce(evaluator);

        GameStatus result = evaluator.evaluateScore(60, 55);

        assertEquals(expected, result);
    }

    @Test
    void givenPlayerOneWinner_ShouldReturnGameWon() {
        ScoreEvaluator evaluator = new ScoreEvaluator();
        GameStatus expected = GameStatus.NO_WINNER;

        GameStatus result = evaluator.evaluateScore(15, 15);

        assertEquals(expected, result);
    }


    @Test
    void givenPlayerTwoWinnerAfterDeuce_ShouldReturnGameWon() {
        ScoreEvaluator evaluator = new ScoreEvaluator();
        GameStatus expected = GameStatus.GAME_WON;
        evaluator.evaluateScore(WINNING_SCORE, WINNING_SCORE);

        GameStatus result = evaluator.evaluateScore(55, 60);

        assertEquals(expected, result);
    }

    private void makeItDeuce(ScoreEvaluator evaluator) {
        evaluator.evaluateScore(WINNING_SCORE, WINNING_SCORE);
    }
}