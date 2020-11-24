/*Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */
package com.epam.upskill.module2.arrayOfArrays;
import java.util.Scanner;
import static com.epam.upskill.module2.arrayOfArrays.MatrixUtils.*;
public class ArraysOfArraysProg1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the matrix: ");
        int myMatrixHeight = getMatrixHeight(scanner);
        System.out.print("Enter the length of the matrix: ");
        int myMatrixLength = getMatrixHeight(scanner);
        int[][] myMatrix = new int[myMatrixHeight][myMatrixLength];
        getMatrixFromKeyboard(scanner, myMatrixHeight, myMatrixLength, myMatrix);
        printIntMatrix(myMatrixHeight, myMatrixLength, myMatrix);
        System.out.println("the columns we were looking for:");
        for (int i = 0; i < myMatrixHeight; i++) {
            for (int j = 0; j < myMatrixLength; j += 2) {
                if (myMatrix[0][j] > myMatrix[myMatrixHeight - 1][j]) {
                    System.out.print(myMatrix[i][j] + "\t");
                }
            }
        System.out.println();
        }
    }
}

