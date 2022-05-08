package com.kata.tennis;

import java.util.List;

public interface Player {
    void addPoint(String point);

    int calculatePoints();

    List<String> getPoints();

    String getName();
}
