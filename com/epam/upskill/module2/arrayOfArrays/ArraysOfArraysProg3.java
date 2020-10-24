package com.epam.upskill.module2.arrayOfArrays;

import java.util.Scanner;

public class ArraysOfArraysProg3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myMatrixHeight = MatrixUtils.getMatrixHeight(scanner);
        int myMatrixLength = MatrixUtils.getMatrixLength(scanner);
        int[][] myMatrix = new int[myMatrixHeight][myMatrixLength];
        MatrixUtils.getRandomMatrix(myMatrix);
        MatrixUtils.printMatrix(myMatrixHeight, myMatrixLength, myMatrix);

        int stringK = 3;
        int columnP = 3;
        System.out.println(stringK + "-th string of matrix:");
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[i].length; j++) {
                if (i == stringK - 1) {
                    System.out.print(" " + myMatrix[i][j] + " ");
                }
            }
        }
        System.out.println();
        System.out.println(columnP + "-th colomn of matrix:");
        for (int i = 0; i < myMatrix.length; i++) {
             for (int j = 0; j < myMatrix[i].length; j++) {
                  if (j == columnP - 1) {
                     System.out.println(myMatrix[i][j] + "");
                  }
             }
        }
    }
}
