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
        int myMatrixHeight = getMatrixHeight(scanner);
        int myMatrixLength = getMatrixLength(scanner);
        int[][] myMatrix = new int[myMatrixHeight][myMatrixLength];
        getRandomMatrix(myMatrix);
        superPrintIntMatrix(myMatrixHeight, myMatrixLength, myMatrix);
        System.out.println("Enter column numbers: ");
        int column1 = scanner.nextInt();
        int column2 = scanner.nextInt();
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
        superPrintIntMatrix(myMatrixHeight, myMatrixLength, myMatrix);
    }
}

