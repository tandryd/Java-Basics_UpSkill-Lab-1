/*Реализуйте сортировку обменами. */
package com.epam.upskill.module2.sorting;
import java.util.Arrays;
import java.util.Scanner;
import static com.epam.upskill.module2.sorting.SortingUtils.*;
public class SortingProg3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myArrayLength = getMyArrayLength(scanner);
        int [] myArray = getArrayIntFromKeyboard(myArrayLength);
        System.out.println(Arrays.toString(myArray));
        bubbleSortingUp(myArray);
        System.out.println(Arrays.toString(myArray));
        bubbleSortingDown(myArray);
        System.out.println(Arrays.toString(myArray));
    }
    private static void bubbleSortingUp(int[] myArray) {
        for (int i = 0; i < myArray.length - 1; i++)
            for (int j = 0; j < myArray.length - i - 1; j++)
                if (myArray[j] > myArray[j + 1]) {
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }
    }
        private static void bubbleSortingDown (int[] myArray) {
            for (int i = 0; i < myArray.length - 1; i++)
                for (int j = 0; j < myArray.length - i - 1; j++)
                    if (myArray[j] < myArray[j + 1]) {
                        int temp = myArray[j];
                        myArray[j] = myArray[j + 1];
                        myArray[j + 1] = temp;
                    }
        }
}
