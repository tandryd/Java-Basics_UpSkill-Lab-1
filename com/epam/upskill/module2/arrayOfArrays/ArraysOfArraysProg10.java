/*Найти положительные элементы главной диагонали квадратной матрицы. */
package com.epam.upskill.module2.arrayOfArrays;
import java.util.Scanner;
import static com.epam.upskill.module2.arrayOfArrays.MatrixUtils.*;
public class ArraysOfArraysProg10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myMatrixHeight = getMatrixHeight(scanner);
        int [][] myMatrix = new int [myMatrixHeight][myMatrixHeight];
        getMatrixFromKeyboard(scanner,myMatrixHeight, myMatrixHeight,myMatrix);
        superPrintIntMatrix(myMatrixHeight, myMatrixHeight,myMatrix);
        System.out.println("Positive elements of the main diagonal: ");
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[i].length; j++) {
                if (i==j & myMatrix[i][j]>0){
                    System.out.print( myMatrix [i][j] + "\t");
                }
            }
        }
    }
}
