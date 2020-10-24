package com.epam.upskill.module2.arrayOfArrays;
import java.util.Scanner;
public class ArraysOfArraysProg5 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myMatrixHeight = MatrixUtils.getMatrixHeight(scanner);
        int myMatrixLength = myMatrixHeight;
        int[][] myMatrix = new int[myMatrixHeight][myMatrixLength];
        int temp = 1;
        int temp2 = myMatrixHeight;
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = temp2-1; j >= 0; j--) {
                if (i == temp -1) {
                    myMatrix[i][j] = temp;
                }
            }
            temp++;
            temp2--;
        }
        MatrixUtils.printMatrix(myMatrixHeight, myMatrixLength, myMatrix);
    }
}
