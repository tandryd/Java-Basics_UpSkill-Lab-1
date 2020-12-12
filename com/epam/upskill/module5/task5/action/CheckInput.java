package com.epam.upskill.module5.task5.action;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckInput {
    private static Scanner scanner = new Scanner(System.in);

    public static String getStringFromKeyboard() {
        Pattern pattern = Pattern.compile("[\\D\\w ]{2,30}");
        scanner.useDelimiter("[\r\n]");
        while (!scanner.hasNext(pattern)) {
            scanner.nextLine();
            System.out.println("Invalid input. Make sure the name is between 2 and 30 characters long.");
        }
        return scanner.nextLine();
    }

    public static double getDoubleFromKeyboard() {
        Pattern pattern = Pattern.compile("[\\d ]{1,5}");
        scanner.useDelimiter("[\r\n]");
        while (true) {
            while (!scanner.hasNext(pattern)) {
                scanner.nextLine();
                System.out.println("The cost of goods can be from 5 to 10000");
            }
            double input = scanner.nextDouble();
            if (input >= 5 && input <= 10000) {
                return input;
            } else {
                System.out.println("The cost of goods can be from 5 to 10000");
            }
        }
    }

    public static int getIntOptionFromKeyboard() {
        Pattern pattern = Pattern.compile("[1-4]");
        scanner.useDelimiter("[\r\n]");
        while (!scanner.hasNext(pattern)) {
            scanner.nextLine();
            System.out.println("Invalid input. Enter 1, 2, 3 or 4");
        }
        return scanner.nextInt();
    }

}
