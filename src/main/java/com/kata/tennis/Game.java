package com.kata.tennis;

public interface Game {

    void playRound(Player one, Player two);
    boolean isGameWon(ScoreEvaluator evaluator, int playerOnePoints, int playerTwoPoints);

    default void play(ScoreEvaluator evaluator, Display display, Player playerOne, Player playerTwo) {
        while (!isGameWon(evaluator, playerOne.calculatePoints(), playerTwo.calculatePoints())) {
            playRound(playerOne, playerTwo);
        }

        display.displayWinner(playerOne, playerTwo);
        display.displayScore(playerOne, playerTwo);
    }
}
