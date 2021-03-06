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
        getNaturalMatrixFromKeyboard(scanner, myMatrixHeight, myMatrixLength, myMatrix);
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
            System.out.print(j + "\t");
        }
        System.out.println();
        System.out.println("Max sum: " + findMaxInArray(arraySum));
        scanner.close();
    }

    static void getNaturalMatrixFromKeyboard(Scanner scanner, int myMatrixHeight, int myMatrixLength, int[][] myMatrix)  {
        for (int i = 0; i < myMatrixHeight; i++) {
            System.out.println((i + 1) + "-th string of matrix: ");
            for (int j = 0; j < myMatrixLength; j++) {
                if (scanner.hasNextInt()){
                    int temp = scanner.nextInt();
                    if (temp>0) {
                        myMatrix[i][j] = temp;
                    }
                        else {
                            System.out.println("Please, enter positive number");
                            j--;
                        }
                }
                else {
                    System.out.println("Incorrect input. Please, enter positive number ");
                    j--;
                    scanner.next();
                }
            }
        }
    }
}

