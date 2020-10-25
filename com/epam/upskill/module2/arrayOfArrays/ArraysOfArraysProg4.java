/* Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */
package com.epam.upskill.module2.arrayOfArrays;
import java.util.Scanner;
import static com.epam.upskill.module2.arrayOfArrays.MatrixUtils.*;
public class ArraysOfArraysProg4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myMatrixHeight = getMatrixHeight(scanner);
        int[][] myMatrix = new int[myMatrixHeight][myMatrixHeight];
        int temp1 = 1;
        int temp2 = myMatrixHeight;
        for (int i = 0; i < myMatrixHeight; i++) {
            for (int j = 0; j < myMatrix.length; j++) {
                if (i % 2 == 0) {
                    myMatrix[i][j] = temp1++;
                }
                else
                    myMatrix [i][j] = temp2--;
            }
            temp1 =1;
            temp2 = myMatrixHeight;
        }
        MatrixUtils.superPrintIntMatrix(myMatrixHeight,myMatrixHeight,myMatrix);
    }
}

