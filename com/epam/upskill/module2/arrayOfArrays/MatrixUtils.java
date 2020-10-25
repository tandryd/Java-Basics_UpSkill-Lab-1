package com.epam.upskill.module2.arrayOfArrays;
import java.util.Random;
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

    static void getRandomMatrix(int[][] myMatrix) {
        Random random = new Random();
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[i].length; j++) {
                myMatrix[i][j] = random.nextInt(10);
            }
        }
    }

    static void printIntMatrix(int myMatrixHeight, int myMatrixLength, int[][] myMatrix) {
        for (int i = 0; i < myMatrixHeight; i++) {
            for (int j = 0; j < myMatrixLength; j++) {
                System.out.print(" " + myMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printDoubleMatrix(int myMatrixHeight, int myMatrixLength, double[][] myMatrix) {
        for (int i = 0; i < myMatrixHeight; i++) {
            for (int j = 0; j < myMatrixLength; j++) {
                System.out.printf("%.6f \t", myMatrix[i][j]);
            }
            System.out.println();
        }
    }

    static void superPrintIntMatrix(int myMatrixHeight, int myMatrixLength, int myMatrix[][]) {
        int maxLength = 0;
        String format = "";
        int temp = 0;
        for (int i = 0; i < myMatrixHeight; i++) {
            for (int j = 0; j < myMatrixLength; j++) {
                temp = String.valueOf(myMatrix[i][j]).length();
                if (temp > maxLength) {
                    maxLength = temp;
                }
            }
        }
        format = "%" + maxLength + "d\t";
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[i].length; j++) {
                System.out.printf(format, myMatrix[i][j]);
            }
            System.out.println();
        }
    }

    static int findMaxInArray(int[] newArray) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] >= max) {
                max = newArray[i];
            }
        }
        return max;
    }

    static int findMaxInMatrix(int[][] myMatrix) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[i].length; j++) {
                if (myMatrix[i][j] >= max) {
                    max = myMatrix[i][j];
                }
            }
        }
        return max;
    }



}
