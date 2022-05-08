package com.kata.tennis.mocks;

import com.kata.tennis.*;

public class GameMock implements Game {
    boolean isGameWon;
    int rounds;

    @Override
    public boolean isGameWon(ScoreEvaluator evaluator, int playerOnePoints, int playerTwoPoints) {
        return isGameWon;
    }

    @Override
    public void playRound(Player one, Player two) {
        rounds++;
    }

    public void setGameWon(boolean gameWon) {
        isGameWon = gameWon;
    }
}
