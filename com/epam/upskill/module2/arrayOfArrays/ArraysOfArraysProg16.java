/*
Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, ..., nxn
так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой.
Построить такой квадрат.
 */
package com.epam.upskill.module2.arrayOfArrays;
import java.util.Scanner;
import static com.epam.upskill.module2.arrayOfArrays.MatrixUtils.*;
public class ArraysOfArraysProg16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Height of the matrix: ");
        int n = getMatrixHeight(scanner);
        int[][] myMagicMatrix = new int[n][n];
        int number = 1;
        int row = 0;
        int column = n / 2;
        int currentRow;
        int currentCol;
        while (number <= n * n) {
            myMagicMatrix[row][column] = number;
            number++;
            currentRow = row;
            currentCol = column;
            row -= 1;
            column += 1;
            if (row == -1) {
                row = n - 1;
            }
            if (column == n) {
                column = 0;
            }
            if (myMagicMatrix[row][column] != 0) {
                row = currentRow + 1;
                column = currentCol;
                if (row == -1) {
                    row = n - 1;
                }
            }
        }
        formatPrintIntMatrix(n,n,myMagicMatrix);
    }
}

