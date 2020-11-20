/*На плоскости заданы своими координатами n точек. Написать метод(методы),
определяющие, между какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив. */
package com.epam.upskill.module2.decomposition;
import java.util.Arrays;
import java.util.Scanner;
public class DecompositionProg4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of points. ");
        int height = getNaturalFromKeyboard(scanner);
        int[][] coordinates = new int[height][2];
            System.out.println("Enter coordinates: ");
            getCoordinatesFromKeyboard(scanner, coordinates);
            printCoordinates(coordinates);
            int count = 0;
            double maxDistance = 0;
            for (int i = 0; i < coordinates.length - 1; i++) {
                for (int j = i + 1; j <= coordinates.length - 1; j++) {
                    double distanceBetweenPoints = findDistanceBetweenPoints(coordinates[i][0], coordinates[i][1], coordinates[j][0], coordinates[j][1]);
                    if (maxDistance < distanceBetweenPoints) {
                        maxDistance = distanceBetweenPoints;
                    }
                    count++;
                    System.out.println("distance between " +  count +"-th pair of points = " + distanceBetweenPoints);
                }
            }
        System.out.println("Max distance: " + maxDistance);
    }

    private static int getIntFromKeyboard(Scanner scanner) {
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

    private static void printCoordinates(int[][] coordinates) {
        for (int i = 0; i < coordinates.length; i++) {
            System.out.print((i + 1) + "-th coordinate: ");
            for (int j = 0; j < coordinates[0].length; j++) {
                System.out.printf( "%2d", coordinates[i][j] );
            }
            System.out.println();
        }
    }

    private static void getCoordinatesFromKeyboard(Scanner scanner, int[][] coordinates) {
        for (int i = 0; i < coordinates.length; i++) {
            System.out.println((i + 1) + "-th coordinate: ");
            for (int j = 0; j < coordinates[0].length; j++) {
                coordinates[i][j] = getIntFromKeyboard(scanner);
            }
        }
    }

    private static double findDistanceBetweenPoints(int x1, int y1, int x2, int y2) {
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }
}


