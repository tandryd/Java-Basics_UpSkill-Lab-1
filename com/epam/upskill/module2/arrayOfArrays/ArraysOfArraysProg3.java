/*Дана матрица. Вывести k-ю строку и p-й столбец матрицы
 */
package com.epam.upskill.module2.arrayOfArrays;
import java.util.Scanner;
import static com.epam.upskill.module2.arrayOfArrays.MatrixUtils.*;
public class ArraysOfArraysProg3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the matrix: ");
        int myMatrixHeight = getMatrixHeight(scanner);
        System.out.print("Enter the Length of the matrix: ");
        int myMatrixLength = getMatrixHeight(scanner);
        int[][] myMatrix = new int[myMatrixHeight][myMatrixLength];
        getRandomMatrix(myMatrix);
        printIntMatrix(myMatrixHeight, myMatrixLength, myMatrix);
        int rowK = 3;
        int columnP = 3;
        System.out.println(rowK + "-th string of matrix:");
        for (int i = 0; i < myMatrixLength; i++) {
            System.out.print(" " + myMatrix[rowK-1][i] + " ");
        }
        System.out.println();
        System.out.println(columnP + "-th column of matrix:");
        for (int j = 0; j < myMatrix.length; j++) {
                System.out.println(myMatrix[j][columnP-1] + "");
        }
    }
}
