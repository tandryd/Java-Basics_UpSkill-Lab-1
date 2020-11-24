/*Cформировать квадратную матрицу порядка N по правилу:
 A[i][j] = sin((i*i-j*j)/2) и подсчитать количество положительных элементов в ней.
 */
package com.epam.upskill.module2.arrayOfArrays;
import static java.lang.Math.*;
import static com.epam.upskill.module2.arrayOfArrays.MatrixUtils.*;
import java.util.Scanner;
public class ArraysOfArraysProg7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the matrix: ");
        int myMatrixHeight = getMatrixHeight(scanner);
        System.out.print("Enter the length of the matrix: ");
        int myMatrixLength = getMatrixHeight(scanner);
        double [][] myMatrix = new double[myMatrixHeight][myMatrixLength];
        int count = 0;
        for (int i = 0; i < myMatrix.length; i++) {
              for (int j = 0; j < myMatrix[i].length; j++) {
                double temp = (pow(i, 2) + pow(j, 2))/myMatrixHeight;
                double temp2 = sin(temp);
                myMatrix[i][j] = temp2;
                  if (myMatrix[i][j] > 0){
                      count ++;
                  }
              }
        }
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[i].length; j++) {
                System.out.printf("%.6f \t", myMatrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("Number of positive elements:" + count);
    }
}
