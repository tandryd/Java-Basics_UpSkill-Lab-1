package com.epam.upskill.module5.task4.action;

import com.epam.upskill.module5.task4.enity.Cave;
import com.epam.upskill.module5.task4.enity.Treasure;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ConsoleMenuAction {
    private Cave cave = new Cave("cave");
    private Scanner scanner = new Scanner(System.in);

    public void startConsoleMenu(){
        ConsoleMenuAction consoleMenuAction = new ConsoleMenuAction();
        int choice;
        boolean isStopped = false;
        consoleMenuAction.printOptions();
        while (!isStopped) {
            System.out.println("Please enter the number of the operation. \nYour choice: ");
            choice = consoleMenuAction.makeChoice();
            isStopped = consoleMenuAction.processingOperation(choice);
        }
    }

    public void printOptions() {
        String menuText = "Available operations:\n" +
                "0 - fill the cave with treasures;\n" +
                "1 - Show all treasures;\n" +
                "2 - Choose the most expensive treasure;\n" +
                "3 - Select treasures for a given amount;\n" +
                "4 - Close application.";
        System.out.println(menuText);
    }

    public int makeChoice() {
        int choice;
        try {
            choice = Integer.parseInt(scanner.nextLine());
            if (choice > 4 || choice < 0) {
                System.out.println("There is no such option. Repeat entry.\n");
                printOptions();
            } else {
                return choice;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Try again.\n");
            printOptions();
        }
        return -1;
    }

    public boolean processingOperation(int choice) {
        TreasureAction treasureAction = new TreasureAction();
        switch (choice){
            case 0:
                treasureAction.fillCaveWithTreasures(cave);
                System.out.println("Cave is filled with " + cave.getNumberOfTreasure() + " treasures.");
                break;
            case 1:
                System.out.println("List of treasures in the cave:");
                treasureAction.print(this.cave.getTreasures());
                break;
            case 2:
                System.out.println("The most expensive treasure:");
                Treasure treasure = treasureAction.chooseMostExpensive(this.cave);
                System.out.println(treasure + "\n");
                break;
            case 3:
                int [] valueRange = new int[2];
                boolean isValid = false;
                while (!isValid) {
                    System.out.println("Enter the desired range of treasure value with a space.");
                    Scanner scanner = new Scanner(System.in);
                    try {
                        valueRange[0] = scanner.nextInt();
                        valueRange[1] = scanner.nextInt();
                        isValid = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Try again.");
                    }
                }
                System.out.println(String.format("Treasures value from %d to %d:", valueRange[0], valueRange[1]));
                List<Treasure> selectedTreasures = treasureAction.selectForGivenAmount(this.cave, valueRange);
                treasureAction.print(selectedTreasures);
                break;
            case 4:
                System.out.println("The work is completed.\nGoodbye");
                return true;
        }
        return false;
    }
}
