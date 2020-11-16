/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */
package com.epam.upskill.module2.arrayOfArrays;
import java.util.Scanner;
import static com.epam.upskill.module2.arrayOfArrays.MatrixUtils.*;
public class ArraysOfArraysProg5 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the height of the matrix (a natural even number): ");
            int myMatrixHeight = getMatrixHeight(scanner);
            if (myMatrixHeight % 2 != 0) {
                System.out.println("Incorrect data. Please enter a natural even number ");
                continue;
            }
            int[][] myMatrix = new int[myMatrixHeight][myMatrixHeight];
            int temp = 1;
            int temp2 = myMatrixHeight;
            for (int i = 0; i < myMatrix.length; i++) {
                for (int j = temp2 - 1; j >= 0; j--) {
                    if (i == temp - 1) {
                        myMatrix[i][j] = temp;
                    }
                }
                temp++;
                temp2--;
            }
            formatPrintIntMatrix(myMatrixHeight, myMatrixHeight, myMatrix);
        }
    }
}
