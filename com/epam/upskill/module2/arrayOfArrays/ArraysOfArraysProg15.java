/*Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */
package com.epam.upskill.module2.arrayOfArrays;
import java.util.Scanner;
import static com.epam.upskill.module2.arrayOfArrays.MatrixUtils.*;
public class ArraysOfArraysProg15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Height of the matrix: ");
        int myMatrixHeight = getMatrixHeight(scanner);
        System.out.print("Enter the Length of the matrix: ");
        int myMatrixLength = getMatrixHeight(scanner);
        int [][] myMatrix = new int[myMatrixHeight][myMatrixLength];
        getRandomMatrix(myMatrix);
        formatPrintIntMatrix(myMatrix.length, myMatrix[0].length, myMatrix);
        int max = findMaxInMatrix(myMatrix);
        System.out.println();
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[i].length; j++) {
                if (myMatrix[i][j]%2!=0){
                    myMatrix[i][j] = max;
                }
            }
        }
        System.out.println("Max element of matrix: " + max);
        formatPrintIntMatrix(myMatrix.length, myMatrix[0].length, myMatrix);
    }
}
