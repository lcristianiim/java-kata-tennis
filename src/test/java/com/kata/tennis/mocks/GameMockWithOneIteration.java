package com.kata.tennis.mocks;

import com.kata.tennis.Game;
import com.kata.tennis.Player;
import com.kata.tennis.ScoreEvaluator;

public class GameMockWithOneIteration implements Game {
    boolean isGameWonTriggered;
    int rounds;

    @Override
    public boolean isGameWon(ScoreEvaluator evaluator, int playerOnePoints, int playerTwoPoints) {
        if (isGameWonTriggered) {
            return true;
        }
        isGameWonTriggered = true;
        return false;
    }

    @Override
    public void playRound(Player one, Player two) {
        rounds++;
    }

    public int getRounds() {
        return rounds;
    }
}
