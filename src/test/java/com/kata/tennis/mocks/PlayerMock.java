package com.kata.tennis.mocks;

import com.kata.tennis.Player;

import java.util.List;

public class PlayerMock implements Player {
    boolean addPointTriggered;

    @Override
    public void addPoint(String point) {
        addPointTriggered = true;
    }

    @Override
    public int calculatePoints() {
        return 0;
    }

    @Override
    public List<String> getPoints() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    public boolean isAddPointTriggered() {
        return addPointTriggered;
    }
}
