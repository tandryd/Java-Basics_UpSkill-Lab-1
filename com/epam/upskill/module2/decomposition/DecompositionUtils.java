package com.epam.upskill.module2.decomposition;

import java.util.Scanner;

public class DecompositionUtils {
     static int calculateGreatestCommonDivisor(int a, int b) {
        if (a<=0 || b<=0) throw new UnsupportedOperationException("Incorrect input");
        while(a!=0 && b!=0){
            if (a>b) {
                a = a % b;
            }
            else b=b%a;
        }
        return a+b;
    }

    static int getIntFromKeyboard(Scanner scanner) {
        int number;
        while (!scanner.hasNextInt()) {
            System.out.println("Incorrect input! Please enter a number!");
            scanner.next();
        }
        number = scanner.nextInt();
        System.out.println("Thank you! Got " + number);
        return number;
    }

    static int getNaturalFromKeyboard(Scanner scanner) {
        int natural;
        while (true) {
            try {
                System.out.print("Please, enter a natural number: ");
                natural = Integer.parseInt(scanner.nextLine());
                if (natural < 0) {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Incorrect input. ");
                continue;
            }
            break;
        }
        return natural;
    }


}
