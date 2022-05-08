package com.kata.tennis;

import org.junit.jupiter.api.Test;

import static com.kata.tennis.ScoreDisplay.getWinnerName;
import static org.junit.jupiter.api.Assertions.*;

class ScoreDisplayTest {

    @Test
    void shouldReturnPlayerOne_GivenPlayerOneWinner() {
        GamePlayer playerOne = new GamePlayer("one");
        GamePlayer playerTwo = new GamePlayer("two");

        playerOne.addPoint("30");
        playerTwo.addPoint("15");

        String result = getWinnerName(playerOne, playerTwo);

        assertEquals("one", result);
    }

    @Test
    void shouldReturnPlayerTwo_GivenPlayerTwoWinner() {
        GamePlayer playerOne = new GamePlayer("one");
        GamePlayer playerTwo = new GamePlayer("two");

        playerOne.addPoint("15");
        playerTwo.addPoint("30");

        String result = getWinnerName(playerOne, playerTwo);

        assertEquals("two", result);
    }

}