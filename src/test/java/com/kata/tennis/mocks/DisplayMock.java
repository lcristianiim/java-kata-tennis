package com.kata.tennis.mocks;

import com.kata.tennis.Display;
import com.kata.tennis.Player;

public class DisplayMock implements Display {
    int displayScoreTriggeredCount;
    int displayWinnerTriggeredCount;

    @Override
    public void displayScore(Player playerOne, Player playerTwo) {
        displayScoreTriggeredCount++;
    }

    @Override
    public void displayWinner(Player playerOne, Player playerTwo) {
        displayWinnerTriggeredCount++;
    }

    public int getDisplayScoreTriggeredCount() {
        return displayScoreTriggeredCount;
    }

    public int getDisplayWinnerTriggeredCount() {
        return displayWinnerTriggeredCount;
    }
}
