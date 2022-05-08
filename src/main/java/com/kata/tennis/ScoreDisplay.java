package com.kata.tennis;

public class ScoreDisplay implements Display {

    @Override
    public void displayScore(Player playerOne, Player playerTwo) {
        for (int i = 0; i < playerOne.getPoints().size(); i++) {
            System.out.printf("""
                    Round %s: %s | %s
                    """, i + 1, playerOne.getPoints().get(i), playerTwo.getPoints().get(i));
        }

        System.out.printf(
                """
                ------------------------------------
                Final Score: %s | %s
                ====================================
                """, playerOne.calculatePoints(), playerTwo.calculatePoints());
    }

    @Override
    public void displayWinner(Player playerOne, Player playerTwo) {
        System.out.printf("""
                         
                         JAVA TENNIS KATA
                ====================================
                The winner is: *** %s ***
                ====================================
                """, getWinnerName(playerOne, playerTwo));
    }

    protected static String getWinnerName(Player playerOne, Player playerTwo) {
        if (playerOne.calculatePoints() > playerTwo.calculatePoints()) {
            return playerOne.getName();
        }
        return playerTwo.getName();
    }
}
