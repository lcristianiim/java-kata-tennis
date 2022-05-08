package com.kata.tennis;

public class ScoreEvaluator {
    public static final int WINNING_SCORE = 40;
    boolean isDeuced;

    public GameStatus evaluateScore(int playerOneScore, int playerTwoScore) {
        if (playerOneScore == WINNING_SCORE && playerOneScore == playerTwoScore) {
            isDeuced = true;
            return GameStatus.DEUCE;
        }

        if ((playerOneScore == playerTwoScore ) && isDeuced) {
            return GameStatus.NO_WINNER;
        }

        if (playerOneScore >= WINNING_SCORE || playerTwoScore >= WINNING_SCORE) {
            return GameStatus.GAME_WON;
        }
        return GameStatus.NO_WINNER;
    }
}
