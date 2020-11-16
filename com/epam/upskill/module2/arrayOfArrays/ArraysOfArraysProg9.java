/*Задана матрица неотрицательных чисел.
Посчитать сумму элементов в каждом столбце. Определить, какой столбец содержит максимальную сумму.
 */
package com.epam.upskill.module2.arrayOfArrays;
import java.util.Scanner;
import static com.epam.upskill.module2.arrayOfArrays.MatrixUtils.*;
public class ArraysOfArraysProg9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the matrix: ");
        int myMatrixHeight = getMatrixHeight(scanner);
        System.out.print("Enter the Length of the matrix: ");
        int myMatrixLength = getMatrixHeight(scanner);
        int[][] myMatrix = new int[myMatrixHeight][myMatrixLength];
        getMatrixFromKeyboard(scanner, myMatrixHeight, myMatrixLength, myMatrix);
        formatPrintIntMatrix(myMatrixHeight, myMatrixLength, myMatrix);
        int[] arraySum = new int[myMatrix[0].length];
        for (int i = 0; i < myMatrixLength; i++) {
            int sum = 0;
            for (int j = 0; j < myMatrixHeight; j++) {
                sum += myMatrix[j][i];
            }
            arraySum[i] = sum;
        }
        System.out.println("The sum of column elements: ");
        for (int j : arraySum) {
            System.out.printf(j + "\t");
        }
        System.out.println();
        System.out.println("Max sum: " + findMaxInArray(arraySum));
    }
}

