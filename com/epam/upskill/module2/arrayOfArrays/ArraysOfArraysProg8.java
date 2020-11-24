/*
В числовой матрице поменять местами два столбца любых столбца,
т. е. все элементы одного столбца поставить на соответствующие им позиции другого,
а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.
*/
package com.epam.upskill.module2.arrayOfArrays;
import java.util.Scanner;
import static com.epam.upskill.module2.arrayOfArrays.MatrixUtils.*;
public class ArraysOfArraysProg8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the matrix: ");
        int myMatrixHeight = getMatrixHeight(scanner);
        System.out.print("Enter the length of the matrix: ");
        int myMatrixLength = getMatrixHeight(scanner);
        int[][] myMatrix = new int[myMatrixHeight][myMatrixLength];
        getRandomMatrix(myMatrix);
        formatPrintIntMatrix(myMatrixHeight, myMatrixLength, myMatrix);
        System.out.println("Please enter the 1-th column number!");
        int column1 = getColumnWithinMatrix (scanner, myMatrixLength);
        System.out.println("Please enter the 2-th column number!");
        int column2 = getColumnWithinMatrix (scanner, myMatrixLength);
        changeColumnsWithinMatrix(myMatrix, column1, column2);
        formatPrintIntMatrix(myMatrixHeight, myMatrixLength, myMatrix);
        scanner.close();
    }

    private static void changeColumnsWithinMatrix(int[][] myMatrix, int column1, int column2) {
        int temp;
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[i].length; j++) {
                if (j == column1 - 1) {
                    temp = myMatrix[i][column2 - 1];
                    myMatrix[i][column2 - 1] = myMatrix[i][column1 - 1];
                    myMatrix[i][column1 - 1] = temp;
                }
            }
        }
    }

    private static int getColumnWithinMatrix (Scanner scanner, int myMatrixLength)  {
        int column;
        do {
            System.out.println("It must not be less than 1 and more than " + myMatrixLength);
            while (!scanner.hasNextInt()) {
                System.out.println("Incorrect input! Enter natural number within the matrix length!");
                scanner.next();
            }
            column = scanner.nextInt();
        }
        while (column <= 0 || column > myMatrixLength);
            System.out.println("Thank you! Got " + column);
            return column;
    }

}

