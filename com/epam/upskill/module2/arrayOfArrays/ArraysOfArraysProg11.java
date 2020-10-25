/*Матрицу 10x20 заполнить случайными числами от 0 до 15.
Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.
 */
package com.epam.upskill.module2.arrayOfArrays;
import java.util.Random;
import static com.epam.upskill.module2.arrayOfArrays.MatrixUtils.*;
public class ArraysOfArraysProg11 {
    public static void main(String[] args) {

        int [][] myMatrix = new int [10][20];
        randomMyMatrix(myMatrix);
        superPrintIntMatrix(10, 20, myMatrix);
        System.out.print("the matrix's row numbers we're looking for: ");
        for (int i = 0; i < myMatrix.length; i++) {
            int count = 0;
            for (int j = 0; j < myMatrix[i].length; j++) {
                if (myMatrix[i][j]==5){
                    count++;
                }
            }
                if (count>=3){
                    System.out.print((i+1) + "\t");
                }
        }
    }

    private static void randomMyMatrix(int[][] myMatrix) {
        Random random = new Random();
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[i].length; j++) {
                myMatrix[i][j] = random.nextInt(15);
            }
        }
    }


}
