package com.epam.upskill.module2.arrayOfArrays;
import java.util.Scanner;
public class ArraysOfArraysProg2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myMatrixHeight = MatrixUtils.getMatrixHeight(scanner);
        int myMatrixLength = MatrixUtils.getMatrixLength(scanner);
        int[][] myMatrix = new int[myMatrixHeight][myMatrixLength];
        MatrixUtils.getMatrixFromKeyboard(scanner, myMatrixHeight, myMatrixLength, myMatrix);
        MatrixUtils.printMatrix(myMatrixHeight, myMatrixLength, myMatrix);
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
