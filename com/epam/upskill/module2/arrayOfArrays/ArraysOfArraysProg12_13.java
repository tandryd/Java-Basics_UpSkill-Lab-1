/*
12.Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
13.Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 */
package com.epam.upskill.module2.arrayOfArrays;
import java.util.Scanner;
import static com.epam.upskill.module2.arrayOfArrays.MatrixUtils.*;
public class ArraysOfArraysProg12_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the matrix: ");
        int myMatrixHeight = getMatrixHeight(scanner);
        System.out.print("Enter the Length of the matrix: ");
        int myMatrixLength = getMatrixHeight(scanner);
        int[][] myMatrix = new int[myMatrixHeight][myMatrixLength];
        getRandomMatrix(myMatrix);
        formatPrintIntMatrix(myMatrix.length, myMatrix[0].length, myMatrix);
        System.out.println("sort rows up: ");
        sortRowsUp(myMatrix);
        formatPrintIntMatrix(myMatrix.length, myMatrix[0].length, myMatrix);
        System.out.println("sort rows down: ");
        sortRowsDown(myMatrix);
        formatPrintIntMatrix(myMatrix.length, myMatrix[0].length, myMatrix);
        System.out.println("sort columns up: ");
        sortColumnsUp(myMatrix);
        formatPrintIntMatrix(myMatrix.length, myMatrix[0].length, myMatrix);
        System.out.println("sort columns down: ");
        sortColumnsDown(myMatrix);
        formatPrintIntMatrix(myMatrix.length, myMatrix[0].length, myMatrix);
    }
    private static void sortRowsUp(int[][] myMatrix) {
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
    }
    private static void sortRowsDown(int[][] myMatrix) {
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
    }
    private static void sortColumnsUp(int[][] myMatrix) {
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
    }
    private static void sortColumnsDown(int[][] myMatrix) {
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
    }
}
