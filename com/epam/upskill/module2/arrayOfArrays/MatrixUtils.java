package com.epam.upskill.module2.arrayOfArrays;

import java.util.Scanner;

public class MatrixUtils {
    static int getMatrixHeight(Scanner scanner) {
        int myMatrixHeight;
        while (true) {
            try {
                System.out.print("Enter the height of the matrix: ");
                myMatrixHeight = Integer.parseInt(scanner.nextLine());
                if (myMatrixHeight < 0) {
                    throw new IllegalArgumentException();
                }
            } catch (NegativeArraySizeException | NumberFormatException e) {
                System.out.println("Incorrect data. Please enter a natural number ");
                continue;
            }
            break;
        }
        return myMatrixHeight;
    }

    static int getMatrixLength(Scanner scanner) {
        int myMatrixLength;
        while (true) {
            try {
                System.out.print("Enter the length of the matrix: ");
                myMatrixLength = Integer.parseInt(scanner.nextLine());
                if (myMatrixLength < 0) {
                    throw new IllegalArgumentException();
                }
            } catch (NegativeArraySizeException | NumberFormatException e) {
                System.out.println("Incorrect data. Please enter a natural number ");
                continue;
            }
            break;
        }
        return myMatrixLength;
    }
     static void getMatrixFromKeyboard(Scanner scanner, int myMatrixHeight, int myMatrixLength, int[][] myMatrix) {
        for (int i = 0; i < myMatrixHeight; i++) {
            System.out.println((i + 1) + "-th string of matrix: ");
            for (int j = 0; j < myMatrixLength; j++) {
                myMatrix[i][j] = scanner.nextInt();
            }
        }
    }

     static void printMatrix(int myMatrixHeight, int myMatrixLength, int[][] myMatrix) {
        for (int i = 0; i < myMatrixHeight; i++) {
            for (int j = 0; j < myMatrixLength; j++) {
                System.out.print(" " + myMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
