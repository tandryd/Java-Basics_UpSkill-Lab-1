/*Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */
package com.epam.upskill.module2.arrayOfArrays;
import java.util.Scanner;
import static com.epam.upskill.module2.arrayOfArrays.MatrixUtils.*;
public class ArraysOfArraysProg2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the matrix: ");
        int myMatrixHeight = getMatrixHeight(scanner);
        int myMatrixLength = myMatrixHeight;
        int[][] myMatrix = new int[myMatrixHeight][myMatrixLength];
        getMatrixFromKeyboard(scanner, myMatrixHeight, myMatrixLength, myMatrix);
        formatPrintIntMatrix(myMatrixHeight, myMatrixLength, myMatrix);
        System.out.println("main diagonal:");
        for (int i = 0, j = 0; i < myMatrixHeight & j < myMatrixLength; i++) {
            System.out.print(myMatrix[i][i] + " ");
        }
        System.out.println();
        System.out.println("side diagonal:");
        for (int i = 0, j = myMatrixLength - 1; i < myMatrixHeight & j >= 0; i++, j--) {
            System.out.print(myMatrix[i][j] + " ");
        }
    }
}
