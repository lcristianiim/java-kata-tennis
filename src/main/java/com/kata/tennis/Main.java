package com.kata.tennis;

public class Main {
    public static void main(String[] args) {
        Game game = new TennisGame();
        ScoreEvaluator evaluator = new ScoreEvaluator();
        Display display = new ScoreDisplay();
        GamePlayer playerOne = new GamePlayer("Player One");
        GamePlayer playerTwo = new GamePlayer("Player Two");

        game.play(evaluator, display, playerOne, playerTwo);
    }
}
