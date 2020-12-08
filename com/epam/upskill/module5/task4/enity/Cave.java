package com.epam.upskill.module5.task4.enity;

import com.epam.upskill.module5.task4.action.TreasureAction;

import java.util.ArrayList;
import java.util.List;

public class Cave {
    private String name;
    private int numberOfTreasure;
    private List<Treasure> treasures;
    private TreasureAction treasureAction;

    public Cave() {
        this.treasures = new ArrayList<>();
    }

    public Cave(String name) {
        this.name = name;
        this.numberOfTreasure = 0;
        this.treasures = new ArrayList<>();
        treasureAction = new TreasureAction();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfTreasure() {
        return treasures.size();
    }

    public void setNumberOfTreasure(int numberOfTreasure) {
        this.numberOfTreasure = numberOfTreasure;
    }

    public List<Treasure> getTreasures() {
        return treasures;
    }
}
