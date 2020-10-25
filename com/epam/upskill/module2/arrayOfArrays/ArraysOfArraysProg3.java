/*Дана матрица. Вывести k-ю строку и p-й столбец матрицы
 */
package com.epam.upskill.module2.arrayOfArrays;
import java.util.Scanner;
import static com.epam.upskill.module2.arrayOfArrays.MatrixUtils.*;
public class ArraysOfArraysProg3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myMatrixHeight = getMatrixHeight(scanner);
        int myMatrixLength = getMatrixLength(scanner);
        int[][] myMatrix = new int[myMatrixHeight][myMatrixLength];
        getRandomMatrix(myMatrix);
        printIntMatrix(myMatrixHeight, myMatrixLength, myMatrix);
        int rowK = 3;
        int columnP = 3;
        System.out.println(rowK + "-th string of matrix:");
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[i].length; j++) {
                if (i == rowK - 1) {
                    System.out.print(" " + myMatrix[i][j] + " ");
                }
            }
        }
        System.out.println();
        System.out.println(columnP + "-th column of matrix:");
        for (int[] matrix : myMatrix) {
            for (int j = 0; j < matrix.length; j++) {
                if (j == columnP - 1) {
                    System.out.println(matrix[j] + "");
                }
            }
        }
    }
}
