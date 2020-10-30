/*На плоскости заданы своими координатами n точек. Написать метод(методы),
определяющие, между какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив. */
package com.epam.upskill.module2.decomposition;
import java.util.Arrays;
import java.util.Scanner;
public class DecompositionProg4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of points:  ");
        int height = scanner.nextInt();
        int [][] coordinates = new int[height][2];
        System.out.println("Enter coordinates: ");
        getCoordinatesFromKeyboard(scanner, coordinates);
        printCoordinates(coordinates);
        double[] distances = new double[coordinates.length-1];
        int count =0;
        for (int i = 0; i < coordinates.length-1; i++) {
            for (int j = i+1; j <= coordinates.length-1; j++) {
                distances[i] = findDistanceBetweenPoints(coordinates[i][0], coordinates[i][1], coordinates[j][0], coordinates[j][1]);
                count++;
                System.out.println("distance between " +  count +"-th pair of points = " + distances[i]);
            }
        }
        Arrays.sort(distances);
        System.out.println("Max distance: " + distances[distances.length-1] );
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
                coordinates[i][j] = scanner.nextInt();
            }
        }
    }
    private static double findDistanceBetweenPoints(int x1, int y1, int x2, int y2) {
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }
}


