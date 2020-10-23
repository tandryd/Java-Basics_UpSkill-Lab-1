package com.epam.upskill.module2.arrayOfArrays;
import java.util.Scanner;
public class ArroysOfArroysProg4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myMatrixHeight = MatrixUtils.getMatrixHeight(scanner);
        int myMatrixLength = myMatrixHeight;
        int[][] myMatrix = new int[myMatrixHeight][myMatrixLength];
        int temp1 = 1;
        int temp2 = myMatrixHeight;
        for (int i = 0; i < myMatrixHeight; i++) {
            for (int j = 0; j < myMatrixLength; j++) {
                if (i % 2 == 0) {
                    myMatrix[i][j] = temp1++;
                }
                else
                    myMatrix [i][j] = temp2--;
            }
            temp1 =1;
            temp2 = myMatrixHeight;
        }
        MatrixUtils.printMatrix(myMatrixHeight,myMatrixLength,myMatrix);
    }
}

