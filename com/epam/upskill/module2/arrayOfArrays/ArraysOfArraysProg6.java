/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */
package com.epam.upskill.module2.arrayOfArrays;
import java.util.Scanner;
import static com.epam.upskill.module2.arrayOfArrays.MatrixUtils.*;
public class ArraysOfArraysProg6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myMatrixHeight = getMatrixHeight(scanner);
             int[][] myMatrix = new int[myMatrixHeight][myMatrixHeight];
             int temp = myMatrixHeight;
             int temp2 = 0;
        for (int i = 0; i < myMatrix.length/2; i++) {//
            for (int j = 0; j < myMatrix[i].length/2; j++) {
                if (i <= j) {
                    myMatrix[i][j] = 1;
                }
            }
        }
        for (int i = myMatrix.length/2; i < myMatrix.length; i++) {
            for (int j = myMatrix[i].length/2; j < myMatrix[i].length; j++) {
                if (i >= j) {
                    myMatrix[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < myMatrix.length/2; i++) {
            for (int j = temp-1; j >= myMatrix[i].length/2; j--) {
                 myMatrix[i][j] = 1;
                }
            temp--;
        }
        for (int i = myMatrix.length-1; i >= myMatrix.length/2; i--) {
            for (int j = temp2; j < myMatrix[i].length/2; j++) {
                myMatrix[i][j] = 1;
            }
            temp2++;
        }
        superPrintIntMatrix(myMatrixHeight, myMatrixHeight, myMatrix);
    }
}

