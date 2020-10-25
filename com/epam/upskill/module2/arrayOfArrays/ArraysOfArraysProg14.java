/*Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца.
(условие выполняется корреектно только если m>=n) */
package com.epam.upskill.module2.arrayOfArrays;
import java.util.Random;
import java.util.Scanner;
import static com.epam.upskill.module2.arrayOfArrays.MatrixUtils.*;
public class ArraysOfArraysProg14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myMatrixHeight = getMatrixHeight(scanner);
        int myMatrixLength = getMatrixLength(scanner);
        int[][] myMatrix = new int[myMatrixHeight][myMatrixLength];
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[i].length; j++) {
                if (i <= j){
                    myMatrix[i][j] = 1;
                }
            }
        }
        Random rnd = new Random();
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[i].length; j++) {
                int index = rnd.nextInt(i + 1);
                int a = myMatrix[index][j];
                myMatrix[index][j] = myMatrix[i][j];
                myMatrix[i][j] = a;
            }
        }
        superPrintIntMatrix(myMatrix.length, myMatrix[0].length, myMatrix);
    }
}

