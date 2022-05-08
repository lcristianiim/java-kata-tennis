package com.kata.tennis;

import java.util.List;
import java.util.Random;

public class TennisGame implements Game {

    public boolean isGameWon(ScoreEvaluator evaluator, int playerOnePoints, int playerTwoPoints) {
        return evaluator.evaluateScore(playerOnePoints, playerTwoPoints) == GameStatus.GAME_WON;
    }

    public void playRound(Player one, Player two) {
        one.addPoint(getRandomPoint());
        two.addPoint(getRandomPoint());
    }

    protected String getRandomPoint() {
        List<String> availablePoints = List.of("love", "15", "30", "40");
        Random random = new Random();

        return availablePoints.get(random.nextInt(availablePoints.size()));
    }

}
