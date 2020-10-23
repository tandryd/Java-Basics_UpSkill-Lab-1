package com.epam.upskill.module2.arrayOfArrays;
import java.util.Scanner;
public class ArraysOfArraysProg1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myMatrixHeight = MatrixUtils.getMatrixHeight(scanner);
        int myMatrixLength = MatrixUtils.getMatrixLength(scanner);
        int[][] myMatrix = new int[myMatrixHeight][myMatrixLength];
        MatrixUtils.getMatrixFromKeyboard(scanner, myMatrixHeight, myMatrixLength, myMatrix);
        MatrixUtils.printMatrix(myMatrixHeight, myMatrixLength, myMatrix);
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

