/*
12.Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
13.Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 */
package com.epam.upskill.module2.arrayOfArrays;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import static com.epam.upskill.module2.arrayOfArrays.MatrixUtils.*;
public class ArraysOfArraysProg12_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the matrix: ");
        int myMatrixHeight = getMatrixHeight(scanner);
        System.out.print("Enter the Length of the matrix: ");
        int myMatrixLength = getMatrixHeight(scanner);

        final int[][] myMatrix = getRandomMatrix(myMatrixHeight, myMatrixLength);
        formatPrintIntMatrix(myMatrix.length, myMatrix[0].length, myMatrix);

        System.out.println("sort rows up: ");
        int[][] rowsUpMatrix = sortRowsUp(cloneMatrix(myMatrix));
        formatPrintIntMatrix(rowsUpMatrix.length, rowsUpMatrix[0].length, rowsUpMatrix);

        System.out.println("sort rows down: ");
        int[][] rowsDownMatrix = sortRowsDown(cloneMatrix(myMatrix));
        formatPrintIntMatrix(rowsDownMatrix.length, rowsDownMatrix[0].length, rowsDownMatrix);

        System.out.println("sort columns up: ");
        int [][] ColumnsUpMatrix = sortColumnsUp(cloneMatrix(myMatrix));
        formatPrintIntMatrix(ColumnsUpMatrix.length, ColumnsUpMatrix[0].length, ColumnsUpMatrix);

        System.out.println("sort columns down: ");
        int [][] ColumnsDownMatrix = sortColumnsDown(cloneMatrix(myMatrix));
        formatPrintIntMatrix(ColumnsDownMatrix.length, ColumnsDownMatrix[0].length, ColumnsDownMatrix);
    }

    private static int [][] cloneMatrix (int [][] myMatrix){
        int [][] newMatrix = new int[myMatrix.length][myMatrix[0].length];
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[0].length; j++) {
                newMatrix [i][j] = myMatrix [i][j];
            }
        }
        return newMatrix;
    }

    private static int[][] sortRowsUp(int[][] myMatrix) {
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < myMatrix.length; i++) {
                for (int j = 0; j < myMatrix[i].length - 1; j++) {
                    if (myMatrix[i][j] > myMatrix[i][j + 1]) {
                        isSorted = false;
                        temp = myMatrix[i][j + 1];
                        myMatrix[i][j + 1] = myMatrix[i][j];
                        myMatrix[i][j] = temp;
                    }
                }
            }
        }
        return myMatrix;
    }
    private static int[][] sortRowsDown(int[][] myMatrix) {
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < myMatrix.length; i++) {
                for (int j = 0; j < myMatrix[i].length - 1; j++) {
                    if (myMatrix[i][j] < myMatrix[i][j + 1]) {
                        isSorted = false;
                        temp = myMatrix[i][j + 1];
                        myMatrix[i][j + 1] = myMatrix[i][j];
                        myMatrix[i][j] = temp;
                    }
                }
            }
        }
        return myMatrix;
    }
    private static int[][] sortColumnsUp(int[][] myMatrix) {
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < myMatrix.length-1; i++) {
                for (int j = 0; j < myMatrix[i].length; j++) {
                    if (myMatrix[i][j] > myMatrix[i+1][j]) {
                        isSorted = false;
                        temp = myMatrix[i + 1][j];
                        myMatrix[i+1][j] = myMatrix[i][j];
                        myMatrix[i][j] = temp;
                    }
                }
            }
        }
        return myMatrix;
    }
    private static int[][] sortColumnsDown(int[][] myMatrix) {
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < myMatrix.length-1; i++) {
                for (int j = 0; j < myMatrix[i].length; j++) {
                    if (myMatrix[i][j] < myMatrix[i+1][j]) {
                        isSorted = false;
                        temp = myMatrix[i + 1][j];
                        myMatrix[i+1][j] = myMatrix[i][j];
                        myMatrix[i][j] = temp;
                    }
                }
            }
        }
        return myMatrix;
    }

    static int [][] getRandomMatrix(int myMatrixLength, int myMatrixHeight) {
        Random random = new Random();
        int[][] myMatrix = new int[myMatrixHeight][myMatrixLength];
        for (int i = 0; i < myMatrixHeight; i++) {
            for (int j = 0; j < myMatrixLength; j++) {
                myMatrix[i][j] = random.nextInt(10);
            }
        }
        return myMatrix;
    }
}
