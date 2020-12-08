package com.epam.upskill.module5.task4.action;

import com.epam.upskill.module5.task4.enity.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TreasureAction {

//    List<Treasure> treasures = new ArrayList<>();

    public void fillCaveWithTreasures(Cave cave) {

        try {
            FileReader fileReader = new FileReader("com/epam/upskill/module5/task4/data/treasures_list.txt");
//            FileReader fileReader = new FileReader("C:/Documents/Java-Basics_UpSkill-Lab-1/com/epam/upskill/module5/task4/data/treasures_list.txt");
            Scanner scanner = new Scanner(fileReader);
            List<Treasure> treasures = cave.getTreasures();
            while (scanner.hasNextLine() &&  treasures.size()<100) {
                String [] treasureLine = scanner.nextLine().split(" - ");
                String treasureType = treasureLine[0];
                String treasureName = treasureLine[1];
                int treasureValue = Integer.parseInt(treasureLine[2]);
                String descriptionOfTreasure = treasureLine[3];
                switch (treasureType) {
                    case "Porcelain":
                        treasures.add(new Porcelain(treasureName, treasureValue, descriptionOfTreasure));
                        break;
                    case "Necklace":
                        treasures.add(new Necklace(treasureName, treasureValue, descriptionOfTreasure));
                        break;
                    case "Combat Weapon":
                        treasures.add(new CombatWeapon(treasureName, treasureValue, descriptionOfTreasure));
                        break;
                    case "Coin":
                        treasures.add(new Coin(treasureName, treasureValue, descriptionOfTreasure));
                        break;
                    case "Gem":
                        treasures.add(new Gem(treasureName, treasureValue, descriptionOfTreasure));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Treasure information file not found.");
        }
    }

    Treasure chooseMostExpensive(Cave cave) {
        int highestPrice = 0;
        Treasure treasure = null;
        for (Treasure element : cave.getTreasures()) {
            if(element.getValue() > highestPrice) {
                highestPrice = element.getValue();
                treasure = element;
            }
        }
        return treasure;


    }

    List<Treasure> selectForGivenAmount(Cave cave, int [] valueRange) {
        List<Treasure> selectedTreasures = new ArrayList<>();
        List<Treasure> treasures = cave.getTreasures();
        for (Treasure element : treasures) {
            if (element.getValue() >= valueRange[0] && element.getValue() <= valueRange[1]) {
                selectedTreasures.add(element);
            }
        }
        return selectedTreasures;
    }
    void print(List<Treasure> treasures) {
        int id = 1;
        if(treasures.size() == 0) {
            System.out.println("No treasures found.\n");
        } else {
            for (Treasure element : treasures) {
                System.out.println(String.format("%-3d %-100s", id++, element));
            }
            System.out.println();
        }
    }
}
